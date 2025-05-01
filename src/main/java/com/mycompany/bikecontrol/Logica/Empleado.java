package com.mycompany.bikecontrol.Logica;

public class Empleado {
    
    private int id_Empleado;
    private String usuario;
    private String contraseña;

    public Empleado() {
    }

    public Empleado(int id_Empleado, String usuario, String contraseña) {
        this.id_Empleado = id_Empleado;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public int getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(int id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
     
}
