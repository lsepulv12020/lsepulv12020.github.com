
package Modelo;

import Interfaces.CRUD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO implements CRUD{
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con ;
    Conexion cn = new Conexion();
    String query ;
    int res;
    String msj;

    @Override
    public List listarUser() {
        
        List<Usuario> datos = new  ArrayList <>(); 
        query = "select * from tb_usuario";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
            
                Usuario us = new Usuario ();
                us.setId(rs.getInt("idUsuario"));
                us.setRut(rs.getString("rutUsuario"));
                us.setNom(rs.getString("nomUsuario"));
                us.setApp(rs.getString("appUsuario"));
                us.setApm(rs.getString("apmUsuario"));
                us.setTel(rs.getString("telUsuario"));
                us.setEma(rs.getString("emailUsuario"));
                datos.add(us);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        
        return datos;
    }

    @Override
    public Usuario listarUserId(int id) {
       
        String query = "select * from tb_usuario where idUsuario ="+id;
        Usuario user = new Usuario ();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
            
                
                user.setId(rs.getInt("idUsuario"));
                user.setRut(rs.getString("rutUsuario"));
                user.setNom(rs.getString("nomUsuario"));
                user.setApp(rs.getString("appUsuario"));
                user.setApm(rs.getString("apmUsuario"));
                user.setTel(rs.getString("telUsuario"));
                user.setEma(rs.getString("emailUsuario"));
                user.setUser(rs.getString("user"));
                user.setPass(rs.getString("pass"));
                user.setEst(rs.getInt("idEstado"));
                user.setTip(rs.getInt("idTipUsaurio"));
                user.setFec(rs.getDate("fec"));
             //   datos.add(us);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return user;
    }

    @Override
    public String agregarUsaurio(String Rut, String nom, String app, String apm, String tel, String ema, String user, String pass, int Est, int Tip, Date fec) {
    
        query = "INSERT INTO tb_usuario (rutUsuario, nomUsuario, appUsuario, apmUsuario, telUsuario, emailUsuario, user, pass, idEstado, idTipUsaurio, fec_creacion) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            ps.setString (1,Rut);
            ps.setString (2,nom);
            ps.setString (3,app);
            ps.setString (4,apm);
            ps.setString (5,tel);
            ps.setString (6,ema);
            ps.setString (7,user);
            ps.setString (8,pass);
            ps.setInt (9,Est);
            ps.setInt (10,Tip);
            ps.setDate(11,fec);
            res= ps.executeUpdate();
            if (res == 1){
                msj = "Usuario Agregado Correctamente";
            
            }else{
                msj = "Error";
            }
            
        } catch (Exception e) {
        }
    return msj;
    }

    @Override
    public String editarUsaurio(int id, String Rut, String nom, String app, String apm, String tel, String ema, String user, String pass, int Est, int Tip, Date fec) {
        
        String query = "update tb_usuario set rutUsuario=?, nomUsuario=?, appUsuario=?, apmUsuario=?"
                + ", telUsuario=?,  emailUsuario=?, user=?, pass=?, idEstado=?, idTipUsaurio=?"
                + ", fec_creacion=? where idUsuario ="+id;
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            ps.setString (1,Rut);
            ps.setString (2,nom);
            ps.setString (3,app);
            ps.setString (4,apm);
            ps.setString (5,tel);
            ps.setString (6,ema);
            ps.setString (7,user);
            ps.setString (8,pass);
            ps.setInt (9,Est);
            ps.setInt (10,Tip);
            ps.setDate(11,fec);
            res= ps.executeUpdate();
            if (res == 1){
                msj = "Usuario Modificado Correctamente";
            
            }else{
                msj = "Error";
            }
            
        } catch (Exception e) {
        }
    return msj;
    }

    @Override
    public Usuario eliminarUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
