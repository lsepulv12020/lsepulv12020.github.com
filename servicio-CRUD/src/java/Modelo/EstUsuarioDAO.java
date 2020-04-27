
package Modelo;

import Interfaces.CRUD_estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class EstUsuarioDAO implements CRUD_estado {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con ;
    Conexion cn = new Conexion();
    String query ;

    @Override
    public List listarEstado() {
        
        List<EstUsuario> datos = new  ArrayList <>(); 
        query = "select * from tb_estusuario";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
            
                EstUsuario es = new EstUsuario ();
                es.setId(rs.getInt("idEstado"));
                es.setNom(rs.getString("nomEstado"));
                es.setDesc(rs.getString("desEstado"));
                datos.add(es);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        
        return datos;
     
    
    }
    

    
}
