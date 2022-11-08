/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage_bassompierre;

import Armes.Epee;
import Armes.Baton;

import java.util.ArrayList;
import Armes.*;

/**
 *
 * @author benba
 */
public class TP3_heritage_BASSOMPIERRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //on cree 2 batons et 2 epees
        Epee MonEpee=new Epee("Excalibur",7, 5);
        Epee MonAutreEpee=new Epee("Durandal",4, 7);
        Baton MonBaton = new Baton ("Chene",4,5);
        Baton MonAutreBaton = new Baton("Charme",5,6);
        System.out.println(MonBaton); //on en affiche 1 pour tester
        
        ArrayList <Arme> TabArme= new ArrayList <Arme>();  //on cree un tableau dynamique d'armes
        TabArme.add(MonEpee);
        TabArme.add(MonAutreEpee);
        TabArme.add(MonBaton);
        TabArme.add(MonAutreBaton);
        for (int i=0; i<TabArme.size();i++){  //on parcourt tout le tableau pour afficher chaque element
            System.out.println(TabArme.get(i));
        }
    }
    
}
