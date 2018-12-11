/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author flaviebilhac
 */
public class FondMulticoloreFete extends Effet{
    private Bandeau b;
    
    public FondMulticoloreFete (Bandeau band){
        this.b = band;
        b.setBackground(Color.red);
        b.setForeground(Color.WHITE);
    }
    
    @Override
    public void afficher(){
        b.setMessage("Je suis toujours à la fête");
        Color col;
        Random r = new Random();
        boolean bool = true;
        while(bool==true){
            b.setBackground(col= new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
        }
    }
}
