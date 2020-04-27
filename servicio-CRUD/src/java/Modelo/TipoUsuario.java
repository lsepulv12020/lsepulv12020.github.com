
package Modelo;


public class TipoUsuario {
    
    private int id;
    private String nom;
    private String des;

    public TipoUsuario() {
    }

    public TipoUsuario(int id, String nom, String des) {
        this.id = id;
        this.nom = nom;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    
}
