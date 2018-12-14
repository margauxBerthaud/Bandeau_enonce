/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Margaux
 */
public class ApparitionTexte extends Effet{
    private Bandeau b;
    
    public ApparitionTexte(Bandeau a){
        this.b=a;
        
    }
    
    public void afficher(){
        b.sleep(100);
        b.setMessage("Tu me fais tourner la tête");
        b.setFont(new Font("SansSerif 15", Font.ITALIC,40));
        b.setBackground(Color.WHITE);
        b.setForeground(Color.red);
        for (int i=0;i<=40;i++){
            b.setRotation(2*Math.PI*i /40);
            b.sleep(100);
            
        }
       
        
           }
    
}
