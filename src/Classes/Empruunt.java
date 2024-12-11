/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Jessarel
 */
public class Empruunt {
    private int idEmprunt;
    private String IdLivre;
    private String TitreLivre;
    private int AuteurLivre;
    private String nombreLivre ;
    private String IdMembre ;
    private int nomMembre ;
    private String Prenommembre ;
    private String DateEmprunt ;
    private String DateRetour ;
    
       public Empruunt() {
    }
    
public Empruunt( int IdEmprunt , String IdLivre ,String TitreLivre,int AuteurLivre,String nombreLivre,String IdMembre ,String Prenommembre ,String DateEmprunt,String DateRetour) {
        this.idEmprunt = idEmprunt;
        this.IdLivre= IdLivre;
        this.TitreLivre = TitreLivre;
        this. AuteurLivre = AuteurLivre;
        this.nombreLivre = nombreLivre;
        this.IdMembre = IdMembre ;
        this.nomMembre = nomMembre ; 
        this.Prenommembre = Prenommembre ;
        this.DateEmprunt = DateEmprunt;
        this.DateRetour = DateRetour ;
    }

    public int getIdEmprunt() {
        return idEmprunt;
    }

    public String getIdLivre() {
        return IdLivre;
    }

    public String getTitreLivre() {
        return TitreLivre;
    }

    public int getAuteurLivre() {
        return AuteurLivre;
    }

    public String getNombreLivre() {
        return nombreLivre;
    }

    public String getIdMembre() {
        return IdMembre;
    }

    public int getNomMembre() {
        return nomMembre;
    }

    public String getPrenommembre() {
        return Prenommembre;
    }

    public String getDateEmprunt() {
        return DateEmprunt;
    }

    public String getDateRetour() {
        return DateRetour;
    }

    public void setIdEmprunt(int idEmprunt) {
        this.idEmprunt = idEmprunt;
    }

    public void setIdLivre(String IdLivre) {
        this.IdLivre = IdLivre;
    }

    public void setTitreLivre(String TitreLivre) {
        this.TitreLivre = TitreLivre;
    }

    public void setAuteurLivre(int AuteurLivre) {
        this.AuteurLivre = AuteurLivre;
    }

    public void setNombreLivre(String nombreLivre) {
        this.nombreLivre = nombreLivre;
    }

    public void setIdMembre(String IdMembre) {
        this.IdMembre = IdMembre;
    }

    public void setNomMembre(int nomMembre) {
        this.nomMembre = nomMembre;
    }

    public void setPrenommembre(String Prenommembre) {
        this.Prenommembre = Prenommembre;
    }

    public void setDateEmprunt(String DateEmprunt) {
        this.DateEmprunt = DateEmprunt;
    }

    public void setDateRetour(String DateRetour) {
        this.DateRetour = DateRetour;
    }



    
    
}