/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp22;

/**
 *
 * @author PersoPc
 */
public class Livre {
    private int id ;
    private String titre ;
    private String auteur ;
    private float prix ;

    public Livre(int id, String titre, String auteur, float prix) {
      this.id=id;
       this.titre=titre;
      this.auteur=auteur;
      this.prix=prix;
    }
     public int getId() {
        return id;
    }
     public void setId(int id){
         this.id=id;
     }
      public String getTitre() {
        return titre;
    }
       public void setTitre(String titre) {
        this.titre = titre;
    }
        public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
      public float getPrix() {
        return prix;
    }
        public void setPrix(float prix) {
        this.prix = prix;
    }

}