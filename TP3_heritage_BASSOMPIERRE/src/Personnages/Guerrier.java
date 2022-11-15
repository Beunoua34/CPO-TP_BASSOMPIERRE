/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author benba
 */
public class Guerrier extends Personnage{
    Boolean cheval;
    public Guerrier (String name, int life, Boolean aCheval){
        
        super(name,life);  //on fait appel au constructeur de la classe mere
        cheval=aCheval; 
    }
}
