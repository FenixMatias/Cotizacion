/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class CotiDepa {
    
    private String modelo;
    private boolean estacionamiento;
    private String bodega;
    private String codigo;
    private String rut;
    private String nombre;
    private int fono;

    public CotiDepa(String modelo, boolean estacionamiento, String bodega, String codigo, String rut, String nombre, int fono) {
        this.modelo = modelo;
        this.estacionamiento = estacionamiento;
        this.bodega = bodega;
        this.codigo = codigo;
        this.rut = rut;
        this.nombre = nombre;
        this.fono = fono;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(boolean estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }
    
    public int valormodelodepartamento()
    {
        int total=0;
        if(modelo.compareToIgnoreCase("UD1B")==0)
            return total=(int)((1250*26752.45));
        if(modelo.compareToIgnoreCase("DD1B")==0)
            return total=(int)((1560*26752.45));
        if(modelo.compareToIgnoreCase("DD2B")==0)    
            return total=(int)((1870*26752.45));
        if(modelo.compareToIgnoreCase("TD2B")==0)  
            return total=(int)((2100*26752.45));
        return total;             
    }
    
    public int valormodelodepartamentouf()
    {
        int total=0;
        if(modelo.compareToIgnoreCase("UD1B")==0)
            return total=1250;
        if(modelo.compareToIgnoreCase("DD1B")==0)
            return total=1560;
        if(modelo.compareToIgnoreCase("DD2B")==0)    
            return total=1870;
        if(modelo.compareToIgnoreCase("TD2B")==0)  
            return total=2100;
        return total;             
    }
    
    public int valorbodega()
    {
        int total=0;
        if(bodega.compareToIgnoreCase("Grande")==0)
            return total=(int)((80*26752.45));
        if(bodega.compareToIgnoreCase("Pequeña")==0)
            return total=(int)((40*26752.45));
        return total;             
    }
    
    public int valorbodegauf()
    {
        int total=0;
        if(bodega.compareToIgnoreCase("Grande")==0)
            return total=80;
        if(bodega.compareToIgnoreCase("Pequeña")==0)
            return total=40;
        return total;             
    }
    
    public int valorestacionamiento()
    {
        int total=0;
        if(estacionamiento==true)
            return total=(int)((150*26752.45));
        return total;             
    }
    
    public int valorestacionamientouf()
    {
        int total=0;
        if(estacionamiento==true)
            return total=150;
        return total;             
    }
    
    public int valortotalpropiedad()
    {
        return valormodelodepartamento()+valorbodega()+valorestacionamiento();            
    }
    
    public int valortotalpropiedaduf()
    {
        return valormodelodepartamentouf()+valorbodegauf()+valorestacionamientouf();            
    }
    
}
