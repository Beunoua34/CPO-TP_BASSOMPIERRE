/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;


/**
 *
 * @author benba
 */
public class Baton extends Arme {
    int age;
    
    public Baton (String name, int nv, int a){
        
        super(name,nv);  //on fait appel au constructeur de la classe mere
        if (a>=100){
            a=100; //l age est plafonne a 100
        }else if (a<0) {
            age=0;//et ne peut pas etre en dessous de 0
        }
        else{ 
        age=a;
    }
    }

    @Override  //on cree une methode toString speciale pour les batons
    public String toString() {
        return "Baton{ Nom= " + nom + ", Niveau: " + niv_attaque+", age=" + age + '}';
    }

}
