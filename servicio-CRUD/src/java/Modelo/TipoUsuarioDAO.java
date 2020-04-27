
package Modelo;

import Interfaces.CRUD_tipusuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class TipoUsuarioDAO implements CRUD_tipusuario{
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con ;
    Conexion cn = new Conexion();
    String query ;

    @Override
    public List listarTipoUsuario() {
        
        List<EstUsuario> datos = new  ArrayList <>(); 
        query = "select * from tb_tipusuario";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
            
                EstUsuario es = new EstUsuario ();
                es.setId(rs.getInt("idTipUsaurio"));
                es.setNom(rs.getString("nomTip"));
                es.setDesc(rs.getString("descripTipo"));
                datos.add(es);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        
        return datos;
    }
    
}
