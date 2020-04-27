
package Modelo;

import java.sql.Date;


public class Usuario {
    
    private int id;
    private String Rut;
    private String nom;
    private String app;
    private String apm;
    private String tel;
    private String ema;
    private String user;
    private String pass;
    private int Est;
    private int Tip;
    private Date fec;

    public Usuario() {
    }

    public Usuario(int id, String Rut, String nom, String app, String apm, String tel, String ema, String user, String pass, int Est, int Tip, Date fec) {
        this.id = id;
        this.Rut = Rut;
        this.nom = nom;
        this.app = app;
        this.apm = apm;
        this.tel = tel;
        this.ema = ema;
        this.user = user;
        this.pass = pass;
        this.Est = Est;
        this.Tip = Tip;
        this.fec = fec;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEma() {
        return ema;
    }

    public void setEma(String ema) {
        this.ema = ema;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getEst() {
        return Est;
    }

    public void setEst(int Est) {
        this.Est = Est;
    }

    public int getTip() {
        return Tip;
    }

    public void setTip(int Tip) {
        this.Tip = Tip;
    }

    public Date getFec() {
        return fec;
    }

    public void setFec(Date fec) {
        this.fec = fec;
    }
    
    
    
    
}
