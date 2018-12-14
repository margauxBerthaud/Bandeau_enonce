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
public class ScenarioElement {
    protected Effet effect;
    protected int repeat;
    
    public ScenarioElement(Effet e, int r){
        effect=e;
        repeat=r;
    }
}
