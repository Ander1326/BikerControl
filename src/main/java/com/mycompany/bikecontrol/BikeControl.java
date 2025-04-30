package com.mycompany.bikecontrol;
/**
 *
 * @author TUF
 */
import com.mycompany.bikecontrol.IGU.Principal;
import com.mycompany.bikecontrol.Logica.Conexion;
public class BikeControl {

    public static void main(String[] args) {
       Principal pric = new Principal();
       pric.setVisible(true);
       pric.setLocationRelativeTo(null);
       
       Conexion con = new Conexion();  
       
    }
}
