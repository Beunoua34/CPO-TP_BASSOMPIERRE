/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author benba
 */
public class Arme {
    String nom;
    int niv_attaque;
    public Arme(String blaze,int niv ){
        nom=blaze;
        if (niv>=100){
            niv_attaque=100; //le niveau est plafonne a 100
        }else if (niv<0) {
            niv_attaque=0;//et ne peut pas etre en dessous de 0
        }
        else{  
            niv_attaque=niv;
    }}
    @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner =  nom + ", niveau: "+ niv_attaque;
return chaine_a_retourner ;
}
}
