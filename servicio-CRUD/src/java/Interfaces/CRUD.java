
package Interfaces;

import Modelo.Usuario;
import java.util.*;


public interface CRUD {
    
    public List listarUser ();
    public Usuario listarUserId (int id);
    public String agregarUsaurio ( String Rut, String nom, String app, String apm, String tel, String ema, String user, String pass, int Est, int Tip, java.sql.Date fec);
    public String editarUsaurio ( int id ,String Rut, String nom, String app, String apm, String tel, String ema, String user, String pass, int Est, int Tip, java.sql.Date fec);
    public Usuario eliminarUsuario (int id);
    
}
