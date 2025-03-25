/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*//**** @author coral*/
import java.sql.Connection;
import java.sql.PreparedStatement; //Sentencia preparada
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD { 
    private Connection conexion;
    
    public UserCRUD(){ //Constructor de la clase donde se conecta a la BD 
       conexion=ConexionMySQL.conectar();
    }
    
    public boolean InsertUsuario(String nombre, String correo, String contra){
        
        String insertSQL="INSERT INTO usuarios(nombre, correo, contrasena) VALUES (?,?,?)";
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contra); //En Java está como "contra" y en la BD esta "contrasena"
            return ps.executeUpdate()>0;
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al crear al usuario"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
    
    }//Fin del INSERT
    
    //Método para Consultar por id
    
    public ResultSet buscarporid(int id){
        String sqlBuscar= "SELECT * FROM usuarios WHERE id_usuario=?";//?--> parámetro pendiente
        
        
        //Si hay error no se romperá y capturará los errores
        try{
            PreparedStatement ps=conexion.prepareStatement(sqlBuscar);
            ps.setInt(1, id);
            return ps.executeQuery();//devuelve un ResultSet
            
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute la consulta
            System.out.println("Error al buscar por id"+e.getMessage());//Las excepciones son para observar donde está el error
            return null;
        }
            
        
        
    }//Fin del Método para Consultar por id
    
    
    public ResultSet obtenertodos(){
        
        //**NO SE PASAN NINGÚN PARÁMETRO, PORQUE SE DESEA OBTENER TODO Y NO UNO EN ESPECÍFICO**
        String sqltodos="SELECT * FROM usuarios";
        
        try
        {
            PreparedStatement ps = conexion.prepareStatement(sqltodos);
            return ps.executeQuery();//Regresa el ResultSet, es decir la consulta
        }
        
        catch(SQLException s){
            
            System.out.println("Error al consultar todos los datos"+s.getMessage());
            return null;
        }
        
    }//Fin del Método para obtener todos los datos de la BD
    
}//Llave fin de la clase




