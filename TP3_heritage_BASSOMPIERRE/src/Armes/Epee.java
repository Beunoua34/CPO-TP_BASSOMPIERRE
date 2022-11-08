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
    int age;
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

    @Override  //on cree un toString specialise pour les epees
    public String toString() {
        return "Epee{Nom = "+nom+ ", Niveau = "+niv_attaque+", finesse = " + finesse + '}';
    }
    
}
