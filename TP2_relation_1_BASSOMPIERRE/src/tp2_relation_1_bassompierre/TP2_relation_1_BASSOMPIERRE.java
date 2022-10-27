/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_bassompierre;

/**
 *
 * @author benba
 */
public class TP2_relation_1_BASSOMPIERRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //3:
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        //on teste, et ca fonctionne!
        
        //8:
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.Proprietaire = bob ;
        System.out.println("La premiere voiture de Bob est "+ bob.liste_voitures[0]); //on affiche la premiere voiture de Bob
    
        //9:
        uneMicra.Proprietaire= reno; //on donne la Micra a reno
        reno.nbVoitures=1;
        reno.liste_voitures[0]=uneMicra;
        
        // On n'ajoute pas encore la 2008 a Bob pour lui ajouter plus tard avec la methode ajouter_voiture()
        //une2008.Proprietaire=bob;
       // bob.nbVoitures+=1;
        //bob.liste_voitures[bob.nbVoitures]=une2008; //si on a deja 1 voiture, la nouvelle est ajoutee dans la case n1 de la liste
        
        // et l'autre clio a reno
        uneAutreClio.Proprietaire= reno;
        reno.nbVoitures+=1;
        reno.liste_voitures[reno.nbVoitures-1]= uneAutreClio;
        
        //10:
        System.out.println(bob.ajouter_voiture(une2008)); //on ajoute la 200_ a Bob et ca fonctionne
        System.out.println(bob.ajouter_voiture(uneAutreClio)); //l'autre clio appartient a reno, donc l'ajout ne fonctionne pas

    }
    
}
