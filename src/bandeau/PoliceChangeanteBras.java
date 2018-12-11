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
public class PoliceChangeanteBras extends Effet{
    private Bandeau b;
    
    public PoliceChangeanteBras(Bandeau band){
        this.b = band;
        b.setBackground(Color.red);
        b.setForeground(Color.WHITE);
    }
    
    @Override
    public void afficher(){
        b.setMessage("Quand tu me tiens dans tes bras");
        b.setFont(new Font("SansSerif 15", Font.ITALIC,16));
        b.sleep(1000);
        b.setFont(new Font("Courier new", Font.ITALIC,16));
        b.sleep(1000);
        b.setFont(new Font("SansSerif 15", Font.ITALIC,16));
    }
}
