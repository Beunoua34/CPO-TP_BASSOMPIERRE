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

    public Arme getArmePortee() {
        return armePortee;
    }

    public void setArmePortee(String nomArme) {
        boolean ajoutee = false;
        for (int i=0;i<Armes.size();i++){ //on parcourt toutes les armes du personnage
            if (Armes.get(i).getNom().equals(nomArme)){
                armePortee=Armes.get(i);
                ajoutee=true;// si l'arme a ete ajoutee, on le note
                System.out.println("Arme ajoutee");
        
            }
        }
        if (ajoutee==false) System.out.println("Ce personnage n'a pas cette arme.");
    }

    @Override
    public String toString() {
        if (armePortee!=null){
            return "Personnage{" + "nom=" + nom + ", vie=" + vie + ", Arme portee : "+ armePortee + '}'; 
        }    
        else {
            return "Personnage{" + "nom=" + nom + ", vie=" + vie + '}';
        }
    }
     
}
