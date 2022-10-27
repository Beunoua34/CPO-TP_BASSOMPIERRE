/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseur_bassompierre;

/**
 *
 * @author benba
 */
public class convertisseur {
    int nbrConversions;
    public  void Convertisseur(){
    nbrConversions = 0 ;
}
    public double CelciusVersKelvin(double CK){
        CK+=273;
        nbrConversions+=1;
        return CK;
    }
    

    public double KelvinVersCelcius(double KC){
        KC-=273;
        nbrConversions+=1;
        return KC;
    }
    
    public double FahrenheitVersCelcius(double FC){
        FC=(FC-32)/1.8;
        nbrConversions+=1;
        return FC;
    }
    public double CelciusVersFahrenheit (double CF){
        CF=(CF*1.8)+32;
        nbrConversions+=1;
        return CF;
    }
    
    public double FahrenheitVersKelvin (double FK){
        FK=(FK+459.67)*(5/9);
        nbrConversions+=1;
        return FK;
    }
    public double KelvinVersFahrenheit (double KF){
        KF=(KF*(9/5))-459.67;
        nbrConversions+=1;
        return KF;
    }
    @Override
public String toString () {
return "Nombre de conversions: "+ nbrConversions;
}

}
