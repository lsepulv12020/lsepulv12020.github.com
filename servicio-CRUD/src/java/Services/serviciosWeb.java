
package Services;

import Modelo.EstUsuario;
import Modelo.EstUsuarioDAO;
import Modelo.TipoUsuario;
import Modelo.TipoUsuarioDAO;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.sql.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "serviciosWeb")
public class serviciosWeb {
    UsuarioDAO udao = new UsuarioDAO ();
    EstUsuarioDAO edao = new EstUsuarioDAO();
    TipoUsuarioDAO tdao = new TipoUsuarioDAO();

    @WebMethod(operationName = "listarEmp")
    public List<Usuario> listarEmp() {
       List datos = udao.listarUser();
       return datos;
    }

    /**
     * Web service operation
     * @param rut
     * @param Nom
     * @param App
     * @param Apm
     * @param Tel
     * @param Ema
     * @param User
     * @param Pass
     * @param idEst
     * @param idTip
     * @param fec
     * @return 
     */
    @WebMethod(operationName = "agregarEmp")
    public String agregarEmp(@WebParam(name = "rut") String rut, @WebParam(name = "Nom") String Nom, @WebParam(name = "App") String App, @WebParam(name = "Apm") String Apm, @WebParam(name = "Tel") String Tel, @WebParam(name = "Ema") String Ema, @WebParam(name = "User") String User, @WebParam(name = "Pass") String Pass, @WebParam(name = "idEst") int idEst, @WebParam(name = "idTip") int idTip, @WebParam(name = "fec") Date fec) {
        String datos = udao.agregarUsaurio(rut, Nom, App, Apm, Tel, Ema, User, Pass, idEst, idTip, fec);
        return datos;
    }
    
       @WebMethod(operationName = "listarEst")
    public List<EstUsuario> listarEst() {
       List datos = edao.listarEstado();
       return datos;
    }
    
           @WebMethod(operationName = "listarTip")
    public List<TipoUsuario> listarTip() {
       List datos = tdao.listarTipoUsuario();
       return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listEmpId")
    public Usuario listEmpId(@WebParam(name = "id") int id) {
       Usuario user = udao.listarUserId(id);
        return user;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarEmp")
    public String editarEmp(@WebParam(name = "id") int id, @WebParam(name = "rut") String rut, @WebParam(name = "nom") String nom, @WebParam(name = "app") String app, @WebParam(name = "apm") String apm, @WebParam(name = "tel") String tel, @WebParam(name = "ema") String ema, @WebParam(name = "usr") String usr, @WebParam(name = "pass") String pass, @WebParam(name = "est") int est, @WebParam(name = "tip") int tip, @WebParam(name = "fec") Date fec) {
       String datos = udao.editarUsaurio(id, rut, nom, app, apm, tel, ema, usr, pass, est, tip, fec);
        return datos;
    }
    
    
    
}
