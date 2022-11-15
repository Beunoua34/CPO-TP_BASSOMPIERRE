/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author benba
 */
public class Magicien extends Personnage{
    Boolean confirme;
    public Magicien (String name, int life, Boolean confirm){
        
        super(name,life);  //on fait appel au constructeur de la classe mere
        confirme=confirm;
        
        
    }

    public Boolean getConfirme() {
        return confirme;
    }

    public void setConfirme(Boolean confirme) {
        this.confirme = confirme;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }
    
}
