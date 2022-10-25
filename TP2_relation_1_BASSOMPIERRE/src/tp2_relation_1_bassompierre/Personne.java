/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_bassompierre;

/**
 *
 * @author benba
 */
public class Personne {
    String nom;
    String prenom;
    public Personne (String unNom, String unPrenom){
        nom=unNom;
        prenom=unPrenom;
    }

@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + "" + prenom;
return chaine_a_retourner ;
}
}
