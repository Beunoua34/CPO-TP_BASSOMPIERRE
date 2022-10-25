/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_bassompierre;

/**
 *
 * @author benba
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    public Voiture (String unModele, String uneMarque, int lesCV){
        Modele=unModele;
        Marque = uneMarque;
        PuissanceCV=lesCV;
    }
    @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = "Modele: " +Modele + ", Marque: " + Marque +", Puisance: " + PuissanceCV +" CV";
return chaine_a_retourner ;
}
}
