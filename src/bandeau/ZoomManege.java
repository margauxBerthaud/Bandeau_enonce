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
 * @author flaviebilhac
 */
public class ZoomManege extends Effet {
    private Bandeau b;
    
    public ZoomManege (Bandeau band){
        this.b = band;
        b.setBackground(Color.WHITE);
        b.setForeground(Color.red);
    }
    
    public void afficher(){
        for (int i = 5; i < 60 ; i+=5) {
			b.setFont(new Font("SansSerif 15", Font.ITALIC, 5+i));
			b.sleep(100);
		}
    }
    
}
