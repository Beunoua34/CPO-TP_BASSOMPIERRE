/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.*;
import java.util.ArrayList;

/**
 *
 * @author benba
 */
public class Personnage {
    String  nom;
    int vie;
    Arme armePortee= null; //on cree une variable prenant l'arme que porte le personnage, initialisee vide
     ArrayList <Arme> Armes= new ArrayList <Arme>();

     public void NouvelleArme(Arme weapon){
         if (Armes.size()<=5){
             Armes.add(weapon);
         }
     }
    public Personnage(String nom, int vie) {
        this.nom = nom;
        if (vie<0){       
            this.vie = 0; //si la vie est <0, on la fixe a 0
        }else {
            this.vie=vie;
        }
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", vie=" + vie + '}';
    }
    
}
