/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author Margaux
 */
public class Example {
    Bandeau b=new Bandeau();
    
    public void exemple(){
        Scenario s=new Scenario();
        b.setMessage("");//pour enlever hello world
        s.ajouterEffet(new ApparitionTexte(b), 1);
        b.sleep(500);

        s.ajouterEffet(new ZoomManege(b), 1);
        b.sleep(500);
        s.ajouterEffet(new FondMulticoloreFete(b), 1);
        b.sleep(500);
        s.ajouterEffet(new PoliceChangeanteBras(b), 1);
        s.lireScenario();
    }
        public static void main(String[] args) {
	    new Example().exemple();
    }
}
