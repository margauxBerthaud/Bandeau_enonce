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
        b.setBackground(Color.RED);
        b.setForeground(Color.WHITE);
    }
    
    public void afficher(){
        b.setFont(new Font("SansSerif 15", Font.ITALIC,16));
        for (int i=0;i<=50;i++){
            b.setRotation(2*Math.PI*i /50);
            
        }
        
           }
    
}
