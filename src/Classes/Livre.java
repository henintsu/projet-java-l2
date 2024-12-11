/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author JAZZY
 */
public class Livre {
    private int id;
    private String titre;
    private String auteur;
    private int nbrpage ;
    private String categories ;
    private String datesortie ;
    private int nombre ;
    
    public Livre() {
    }
    
    public Livre(int id, String titre , String auteur , int nbrpage ,String categories ,String datesortie ,int nombre) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.nbrpage = nbrpage;
        this.categories = categories;
        this.datesortie = datesortie ;
        this.nombre = nombre ;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbrpage() {
        return nbrpage;
    }

    public String getCategories() {
        return categories;
    }

    public String getDatesortie() {
        return datesortie;
    }

    public int getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setNbrpage(int nbrpage) {
        this.nbrpage = nbrpage;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void setDatesortie(String datesortie) {
        this.datesortie = datesortie;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
   
    
    
}
