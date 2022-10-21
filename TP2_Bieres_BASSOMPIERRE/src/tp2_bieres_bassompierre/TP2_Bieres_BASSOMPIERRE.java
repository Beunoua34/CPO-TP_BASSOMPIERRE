/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_bassompierre;

/**
 *
 * @author benba
 */
public class TP2_Bieres_BASSOMPIERRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des Trolls", 7.0, "Dubuisson");
        
        uneBiere.ouverte=false;
        uneBiere.lireEtiquette();
        
        BouteilleBiere biere2 = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        
        biere2.ouverte=false;
        biere2.lireEtiquette();
        
        BouteilleBiere biere3 = new BouteilleBiere ("FAXE" , 12.0 , "Colline du crack");
        biere3.lireEtiquette();
        BouteilleBiere biere4 = new BouteilleBiere ("MAXIMATOR", 11.5,"MTP");
        
        System.out.println(uneBiere.Decapsuler());
        
    }
    
}

