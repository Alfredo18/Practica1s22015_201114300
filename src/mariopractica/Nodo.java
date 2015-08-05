/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariopractica;

/**
 *
 * @author G42368LA
 */
public class Nodo {
    Personajes per;
    Nodo nex;
    Nodo pre;

    public Nodo(Personajes per) {
        this.per = per;
        this.nex = null;
        this.pre = null;
    }

    public Nodo(Personajes per, Nodo nex, Nodo pre) {
        this.per = per;
        this.nex = nex;
        this.pre = pre;
    }
    
    
    
}
