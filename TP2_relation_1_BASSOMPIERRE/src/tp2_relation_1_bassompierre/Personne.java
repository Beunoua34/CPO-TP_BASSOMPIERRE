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
    int nbVoitures;
    Voiture [] liste_voitures ; //creation dun tableau contenant chaque voiture de la personne
    public Personne (String unNom, String unPrenom){
        nom=unNom;
        prenom=unPrenom;
        nbVoitures=0;
        liste_voitures= new Voiture[3];
    }
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire!=null){
            System.out.println("Erreur, la voiture est volee");
            return false;            
        }
        else if (nbVoitures>=3){
            System.out.println("Erreur, la personne a deja 3 voitures");
            return false;
        }
        else {
            int caseTableau=nbVoitures; //on determine la case a ajouter
            nbVoitures+=1;
            voiture_a_ajouter.Proprietaire=this; //on affecte la personne qui est en train d'executer la methode en proprietaire de la voiture
            this.liste_voitures[caseTableau]=voiture_a_ajouter; //et on ajoute cette voiture à la liste du propriétaire
            return true; 
            
        }
    }
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + "" + prenom;
return chaine_a_retourner ;
}
}
