package com.mycompany.bikecontrol.Logica;

/**
 *
 * @author TUF
 */
public class Administrador {
    
    private int id_Administrador;
    private String usuario;
    private String contraseña;

    public Administrador() {
    }

    public Administrador(int id_Administrador, String usuario, String contraseña) {
        this.id_Administrador = id_Administrador;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public int getId_Administrador() {
        return id_Administrador;
    }

    public void setId_Administrador(int id_Administrador) {
        this.id_Administrador = id_Administrador;
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
