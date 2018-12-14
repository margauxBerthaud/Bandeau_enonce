/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;

/**
 *
 * @author flaviebilhac
 */

public class Scenario {
    
    protected ArrayList<ScenarioElement> effet=new ArrayList<>();
    
    public void ajouterEffet(Effet e, int repeat){
        effet.add(new ScenarioElement(e,repeat));
        
    }
    public void lireScenario(){
        effet.forEach((e) -> {
            e.effect.afficher();
        });
    }
}
