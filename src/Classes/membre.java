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
public class membre {
    private int id;
    private String nom ;
    private String prenom;
    private String dateNaiss ;
    private String adresse ;
    private String email ;
    private int telephone ;
    
    public membre() {
    }
    
    public membre(int id,String nom ,String prenom ,String dateNaiss , String adresse ,String email ,int telephone){
        this.id = id ;
        this.nom = nom ;
        this.prenom = prenom ;
        this.dateNaiss = dateNaiss ;
        this.adresse = adresse ;
        this.email = email ;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
   
}

