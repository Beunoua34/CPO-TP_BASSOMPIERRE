/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage_bassompierre;

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
    }
    
}
