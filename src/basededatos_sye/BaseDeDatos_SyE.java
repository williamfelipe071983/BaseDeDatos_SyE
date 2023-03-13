/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basededatos_sye;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDeDatos_SyE {

    
    public static void main(String[] args) {
        
      Connection conexion = null;
      Statement manipular_db = null;
      ResultSet rs;
      
      String user_db = "root";
      String password_db = "xarino06";
      String url = "jdbc:mysql://localhost:3306/base_sye";
      
        try {
            conexion = DriverManager.getConnection(url, user_db, password_db);
            manipular_db = conexion.createStatement();
            manipular_db.executeUpdate("INSERT INTO USUARIO (Cedula,Nombre,Apellido,correo,clave,Rol)VALUES('70041353','William','Castrillon','william.castrillon@sye.com.co', 'castrillon1234','Gestor social')");
            rs = manipular_db.executeQuery("SELECT*FROM USUARIO");
            rs.next();
                
            
            System.out.println("Conexion exitosa");
            
        } catch (SQLException ex) {
            System.out.println("Conexion errada:"+ex.getMessage());
            
        }
        if (manipular_db != null){
            // INSERT
            String cedula = "42990652";
            String nombre = "Carolina";
            String apellido = "Acevedo";
            String correo = "carolina.acavedo@sye.com.co";
            String clave = "caro12365";
            String rol = "Gestora SST";
            
            try {
                int proceso = manipular_db.executeUpdate("INSERT INTO usuario(cedula,nombre,apellido,correo,clave,rol)VALUES('"+cedula+"','"+nombre+"','"+apellido+"','"+correo+"','"+clave+"','"+rol+"')");
            if (proceso==1){
                System.out.println("Se inserto con exito");
            }else {
                System.out.println("Error al ingresar");
                }
            }catch(SQLException error){
                System.out.println("Error al insertar datos:"+error.getMessage());
            }
            
                    
            
        }
            // UPDATE
            String nuevo_nombre = "William Felipe";
            String cedula_buscar = "71360593";
            
            try{
             int proceso_update = manipular_db.executeUpdate("UPDATE usuario SET nombre='"+nuevo_nombre+"' WHERE cedula ='"+cedula_buscar+"' ");
             
             if (proceso_update==1){
                 System.out.println("Se ha editado con exito");
             
             }else {
                 System.out.println("Error al editar");
             
             }
            }catch(SQLException error){
                System.out.println("Error al editar:"+error.getMessage());
            }
           
    }
    
    
}
