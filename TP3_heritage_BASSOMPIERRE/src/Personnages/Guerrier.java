/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author benba
 */
public class Guerrier extends Personnage{
    Boolean cheval;
    public Guerrier (String name, int life, Boolean aCheval){
        
        super(name,life);  //on fait appel au constructeur de la classe mere
        cheval=aCheval; 
    }

    public Boolean getCheval() {
        return cheval;
    }

    public void setCheval(Boolean cheval) {
        this.cheval = cheval;
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
