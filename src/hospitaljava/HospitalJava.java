/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitaljava;

import cl.douc.bd.Conexion;
import cl.duoc.views.Menu;
import java.sql.Connection;



/**
 *
 * @author Cetecom
 */
public class HospitalJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Conexion cx = new Conexion();
         cx.conectar();
        
        Menu menu = new Menu();
        menu.setVisible(true);
    }
    
}
