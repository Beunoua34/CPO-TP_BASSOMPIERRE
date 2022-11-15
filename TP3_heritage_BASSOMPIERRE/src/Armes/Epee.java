/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;



/**
 *
 * @author benba
 */
public class Epee extends Arme {
    int finesse;
    public Epee (String nam, int lvl, int fin){
        
        super(nam,lvl);  //on fait appel au constructeur de la classe mere
        if (fin>=100){
            finesse=100; //l age est plafonne a 100
        }else if (fin<0) {
            finesse=0;//et ne peut pas etre en dessous de 0
        }
        else{ 
          finesse=fin;
        }
    }

    public int getFinesse() {
        return finesse;
    }

    public void setFinesse(int finesse) {
        if (finesse<0){
        this.finesse=0;//si la finesse entrée est <0 , on le fixe a 0
    } else if (finesse>100) {
            this.finesse=100;//si la finesse entrée est >100 , on le fixe a 100
        }
    else {
        this.finesse=finesse;
    }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiv_attaque() {
        return niv_attaque;
    }

    public void setNiv_attaque(int niv_attaque) {
        if (niv_attaque<0){
        this.niv_attaque=0;//si le niveau entré est <0 , on le fixe a 0
    } else if (niv_attaque>100) {
            this.niv_attaque=100;//si le niveau entré est >100 , on le fixe a 100
        }
    else {
        this.niv_attaque=niv_attaque;
    }
    }

    @Override  //on cree un toString specialise pour les epees
    public String toString() {
        return "Epee{Nom = "+nom+ ", Niveau = "+niv_attaque+", finesse = " + finesse + '}';
    }
    
}
