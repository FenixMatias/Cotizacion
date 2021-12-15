/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.CotiDepa;

/**
 *
 * @author Matio_000
 */
public class DepartamentoDAO {
    
    public boolean ingresarcotizacion(CotiDepa dep)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="insert into DEPARTAMENTO (Modelo, Estacionamiento, Bodega, Codigo, rut, Nombre, Fono) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, dep.getModelo());
            ps.setBoolean(2, dep.isEstacionamiento());
            ps.setString(3, dep.getBodega());
            ps.setString(4, dep.getCodigo());
            ps.setString(5, dep.getRut());
            ps.setString(6, dep.getNombre());
            ps.setInt(7, dep.getFono());
            resultado=ps.executeUpdate()==1;
            ps.close();  
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public ArrayList<CotiDepa> mostrartodos()
    {
        ArrayList <CotiDepa> cotidepa=new ArrayList<CotiDepa>();
        try {
            Connection con=Conexion.getConexion();
            String query="select * from DEPARTAMENTO";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            CotiDepa dep;
            while(rs.next())
            {
                dep=new CotiDepa(rs.getString(1), rs.getBoolean(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                cotidepa.add(dep);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cotidepa;
    }    
    
    public boolean eliminarcotizacion(String rut)
    {
        boolean resultado=false;
        
        try {
            Connection con=Conexion.getConexion();
            String query="delete from DEPARTAMENTO where rut=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, rut);
            resultado=ps.executeUpdate()==1;
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public CotiDepa buscarcotizacion(String rut)
    {
        CotiDepa dep=null;
        try {
            Connection con = Conexion.getConexion();
            String query="select * from  DEPARTAMENTO where rut=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, rut);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                dep=new CotiDepa(rs.getString(1), rs.getBoolean(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dep;
    }   
    
    public boolean modificarcotizacion(CotiDepa dep)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="update DEPARTAMENTO set modelo=?,estacionamiento=?,bodega=?,codigo=?,nombre=?,fono=? where rut=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, dep.getModelo());
            ps.setBoolean(2, dep.isEstacionamiento());
            ps.setString(3, dep.getBodega());
            ps.setString(4, dep.getCodigo());
            ps.setString(5, dep.getNombre());
            ps.setInt(6, dep.getFono());
            ps.setString(7, dep.getRut());
            resultado=ps.executeUpdate()==1;
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
     public ArrayList<CotiDepa> mostrartodoses()
    {
        ArrayList <CotiDepa> cotidepa=new ArrayList<CotiDepa>();
        try {
            Connection con=Conexion.getConexion();
            String query="select * from DEPARTAMENTO";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            CotiDepa dep;
            while(rs.next())
            {
                
                dep=new CotiDepa(rs.getString(1), rs.getBoolean(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                cotidepa.add(dep);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cotidepa;
    }    
    
    public ArrayList<CotiDepa> mostrartodosestacionamiento()
    {
        ArrayList <CotiDepa> cotidepa=new ArrayList<CotiDepa>();
        try {
            Connection con=Conexion.getConexion();
            String query="select * from DEPARTAMENTO where estacionamiento=true";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            CotiDepa dep;
            while(rs.next())
            {
                dep=new CotiDepa(rs.getString(1), rs.getBoolean(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                cotidepa.add(dep);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cotidepa;
    }     
}
