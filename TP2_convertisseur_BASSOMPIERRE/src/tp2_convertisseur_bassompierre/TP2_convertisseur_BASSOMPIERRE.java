/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseur_bassompierre;

import java.util.Scanner;

/**
 *
 * @author benba
 */
public class TP2_convertisseur_BASSOMPIERRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc;
        sc=new Scanner(System.in);       
        double temp;
        double i;
        double val;
        convertisseur c = new convertisseur();
        System.out.println("Valeur de la temperature a convertir: ");
        temp=sc.nextDouble();
        System.out.println("Selon la conversion que vous voulez faire, tappez le chiffre associé :\n celcius en kelvin :1 \n kelvin en celcius:2 \n fahrenheit en celcius:3 \n celcius en fahrenheit:4 \n fahrenheit en kelvin:5 \n kelvin en fahrenheit:6");
        i=sc.nextDouble();
        
        //en fonction de la demande de l'utilisateur, on realise la conversion adaptee
        if (i==1){
            val=c.CelciusVersKelvin(temp);
            System.out.println(val+"K");
        }
        
        else if
                (i==2){
            val=c.KelvinVersCelcius(temp);
            System.out.println(val+"C");
        }
        
        else if (i==3){
            val=c.FahrenheitVersCelcius(temp);
            System.out.println(val+"C");
        }
        
        else if (i==4){
            val=c.CelciusVersFahrenheit(temp);
            System.out.println(val+"F");
        }
        
        
        else if (i==5){
            val=c.FahrenheitVersKelvin(temp);
            System.out.println(val+"K");
        }
        
        else if (i==6){
            val=c.KelvinVersFahrenheit(temp);
            System.out.println(val+"F");
        } 
      
    }
}
