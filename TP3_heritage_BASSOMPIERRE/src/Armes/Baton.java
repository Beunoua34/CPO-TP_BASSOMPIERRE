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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
        this.age=0;//si l age entré est <0 , on le fixe a 0
    } else if (age>100) {
            this.age=100;//si l age entré est >100 , on le fixe a 100
        }
    else {
        this.age=age;
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
    @Override  //on cree une methode toString speciale pour les batons
    public String toString() {
        return "Baton{ Nom= " + nom + ", Niveau: " + niv_attaque+", age=" + age + '}';
    }

}
