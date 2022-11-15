/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage_bassompierre;

import Armes.Epee;
import Armes.Baton;

import java.util.ArrayList;
import Armes.*;

import Personnages.*;

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
        Baton MonBaton = new Baton ("Chene",-4,5); //on teste un niveau negatif, et le code remet bien le niveau 0
        Baton MonAutreBaton = new Baton("Charme",5,6);
        System.out.println(MonBaton); //on en affiche 1 pour tester
        
        ArrayList <Arme> TabArme= new ArrayList <Arme>();  //on cree un tableau dynamique d'armes
        TabArme.add(MonEpee);
        TabArme.add(MonAutreEpee);
        TabArme.add(MonBaton);
        TabArme.add(MonAutreBaton);
        MonAutreBaton.setAge(-10); //on peut set un nouvel age, mais pas en dessous de 0 grace au setter
        for (int i=0; i<TabArme.size();i++){  //on parcourt tout le tableau pour afficher chaque element
            System.out.println(TabArme.get(i));
        }
        
        //on cree 2 magiciens et 2 guerriers
        Magicien premierMagicien=new Magicien("Gandalf",65,true);
        Magicien deuxiemeMagicien= new Magicien("Garcimore",44,false);
        deuxiemeMagicien.setVie(-44);
        System.out.println(deuxiemeMagicien); //on teste de mettre la vie du magicien en negatif, et on voit qu'elle est mise a 0 automatiquement
        deuxiemeMagicien.setVie(44); //puis on remet au magicien sa vie initiale
        Guerrier premierGuerrier= new Guerrier ("Conan",78,false);
        Guerrier deuxiemeGuerrier= new Guerrier ("Lannister",45, true);
        
        ArrayList <Personnage> TabPerso= new ArrayList <Personnage>();  //on cree un tableau dynamique de personnages
        TabPerso.add(premierMagicien);
        TabPerso.add(deuxiemeMagicien);
        TabPerso.add(premierGuerrier);
        TabPerso.add(deuxiemeGuerrier); //et on ajoute chaque guerrier dedans
        for (int i=0;i<TabPerso.size();i++){
            System.out.println(TabPerso.get(i));
        }
    }
    
}
