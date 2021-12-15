/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.DepartamentoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CotiDepa;

/**
 *
 * @author Matio_000
 */
public class VentanaMostrar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMostrar
     */
    public VentanaMostrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        btnEstacionamientos = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Cotizacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 0, 0))); // NOI18N

        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Estacionamiento", "Bodega", "Código", "Rut", "Nombre", "Fono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMostrar);

        btnEstacionamientos.setText("Estacionamientos");
        btnEstacionamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstacionamientosActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Rut:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnEstacionamientos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(210, 210, 210)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnVolver)
                    .addComponent(btnEstacionamientos))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(67, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarTabla()
    {
        DefaultTableModel dtm=(DefaultTableModel)tblMostrar.getModel();
        while(dtm.getRowCount()>0)
            dtm.removeRow(0);
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DepartamentoDAO depDAO=new DepartamentoDAO();
        CotiDepa dep=depDAO.buscarcotizacion(txtRut.getText());
        DefaultTableModel dtm=(DefaultTableModel)tblMostrar.getModel();
        limpiarTabla();
        if(dep==null)
        {
            ArrayList <CotiDepa> cotizaciones=depDAO.mostrartodos();
            if(cotizaciones.size()==0)
            JOptionPane.showMessageDialog(this, "No hay Cotizaciones", "SIN COTIZACIONES", JOptionPane.ERROR);
            else
            {
                String [][]datos=new String[cotizaciones.size()][7];
                for (int i = 0; i < cotizaciones.size(); i++) {
                    datos[i][0]=cotizaciones.get(i).getModelo();
                    datos[i][1]=String.valueOf(cotizaciones.get(i).isEstacionamiento());
                    datos[i][2]=cotizaciones.get(i).getBodega();
                    datos[i][3]=cotizaciones.get(i).getCodigo();
                    datos[i][4]=cotizaciones.get(i).getRut();
                    datos[i][5]=cotizaciones.get(i).getNombre();
                    datos[i][6]=String.valueOf(cotizaciones.get(i).getFono());
                    dtm.addRow(datos[i]);
                }
                tblMostrar.setModel(dtm);
            }

        }
        else
        {
            String []datos=new String[7];
            datos[0]=dep.getModelo();
            datos[1]=String.valueOf(dep.isEstacionamiento());
            datos[2]=dep.getBodega();
            datos[3]=dep.getCodigo();
            datos[4]=dep.getRut();
            datos[5]=dep.getNombre();
            datos[6]=String.valueOf(dep.getFono());
            dtm.addRow(datos);
            tblMostrar.setModel(dtm);
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)tblMostrar.getModel();
        int fila=tblMostrar.getSelectedRow();
        if(fila==-1)
        JOptionPane.showMessageDialog(this, "Debe Seleccionar el Registro");
        else
        {
            String rut=String.valueOf(tblMostrar.getValueAt(fila, 4));
            DepartamentoDAO depDAO=new DepartamentoDAO();
            depDAO.eliminarcotizacion(rut);
            dtm.removeRow(fila);
            tblMostrar.setModel(dtm);
            JOptionPane.showMessageDialog(this,"Cotizacion Eliminada", "ELIMINAR COTIZACION", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)tblMostrar.getModel();
        int fila=tblMostrar.getSelectedRow();
        if(fila==-1)
        JOptionPane.showMessageDialog(this, "Debe Seleccionar el Registro");
        {
            DepartamentoDAO depaDAO=new DepartamentoDAO();
            String modelo,bodega,codigo,rut,nombre;
            boolean estacionamiento;
            int fono;
            modelo=String.valueOf(tblMostrar.getValueAt(fila, 0));
            estacionamiento=Boolean.parseBoolean(String.valueOf(tblMostrar.getValueAt(fila, 1)));
            bodega=String.valueOf(tblMostrar.getValueAt(fila, 2));
            codigo=String.valueOf(tblMostrar.getValueAt(fila, 3));
            rut=String.valueOf(tblMostrar.getValueAt(fila, 4));
            nombre=String.valueOf(tblMostrar.getValueAt(fila, 5));
            fono=Integer.parseInt(String.valueOf(tblMostrar.getValueAt(fila, 6)));
            CotiDepa depa=new CotiDepa(modelo, estacionamiento, bodega, codigo, rut, nombre, fono);
            depaDAO.modificarcotizacion(depa);
            JOptionPane.showMessageDialog(this, "Registro Modificado", "MODIFICAR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEstacionamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstacionamientosActionPerformed
        DepartamentoDAO depDAO=new DepartamentoDAO();
        DefaultTableModel dtm=(DefaultTableModel)tblMostrar.getModel();
        limpiarTabla();
            
        ArrayList <CotiDepa> cotizaciones=depDAO.mostrartodosestacionamiento();
            if(cotizaciones.size()==0)
            JOptionPane.showMessageDialog(this, "No hay Cotizaciones", "SIN COTIZACIONES", JOptionPane.ERROR);
            else
            {
                String [][]datos=new String[cotizaciones.size()][7];
                for (int i = 0; i < cotizaciones.size(); i++) {
                    datos[i][0]=cotizaciones.get(i).getModelo();
                    datos[i][1]=String.valueOf(cotizaciones.get(i).isEstacionamiento());
                    datos[i][2]=cotizaciones.get(i).getBodega();
                    datos[i][3]=cotizaciones.get(i).getCodigo();
                    datos[i][4]=cotizaciones.get(i).getRut();
                    datos[i][5]=cotizaciones.get(i).getNombre();
                    datos[i][6]=String.valueOf(cotizaciones.get(i).getFono());
                    dtm.addRow(datos[i]);
                }
                tblMostrar.setModel(dtm);
            }
    }//GEN-LAST:event_btnEstacionamientosActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEstacionamientos;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMostrar;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
