/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

/**
 *
 * @author flaviebilhac
 */
public class FondMulticoloreFete extends Effet{
    private Bandeau b;
    
    public FondMulticoloreFete (Bandeau band){
        this.b = band;
    }
    
    @Override
    public void afficher(){
        b.setBackground(Color.red);
        b.setForeground(Color.WHITE);
        b.setMessage("Je suis toujours à la fête");
        b.setFont(new Font("SansSerif 15", Font.ITALIC,16));
        Color col;
        Random r = new Random();
        boolean bool = true;
        while(bool==true){
            b.setBackground(col= new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
            b.sleep(2000);
            bool=false;
        }
    }
}
