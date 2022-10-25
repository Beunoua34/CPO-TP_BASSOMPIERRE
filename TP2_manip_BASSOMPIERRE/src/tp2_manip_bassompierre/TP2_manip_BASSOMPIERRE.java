/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_bassompierre;

import java.util.Arrays;

/**
 *
 * @author benba
 */
public class TP2_manip_BASSOMPIERRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //3:
        Tartiflette assiette1= new Tartiflette(500);
        Tartiflette assiette2= new Tartiflette(600);
        Tartiflette assiette3=assiette2; //on a cree trois elements, assiette 2 et 3 ont la meme valeur dans nbCalories mais sont 2 tartiflettes differentes
        //4:
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        //5:
        assiette2= assiette1;
        assiette1=assiette3; //on utilise l'element tartiflette 3 ayant les memes attributs que Tartiflette2 pour interchanger les valeurs
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;  //on affiche a nouveau, et cela a fonctionné
        
        //6:
        // La ligne "Moussaka assiette666 = assiette1 ;" est incorrecte
        // La ligne "Moussaka assiette667 = new Tartiflette() ;" est incorrecte
        //Une référence objetne peut pas referencer un autre type d'objet qui n'a aucun rapport
        
        //7:
        Moussaka Tab [] = new Moussaka[10];  // creation du tableau
        for (int i=0;i<10;i++){ //pour chaque case du tableau, on cree une moussaka
            Tab[i]= new Moussaka(i); //je fais le choix de mettre un nombre de callorie égal au numero de case de la moussaka
        }
        System.out.println(Tab[1].nbCalories);
        System.out.println(Tab[4].nbCalories); // j'affiche 2 cases du tableau pour vérifier: ca fonctionne
    }

}
