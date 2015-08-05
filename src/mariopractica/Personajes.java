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
public class Personajes {
    String Nombre;
    String Tipo;
    int x;
    int y;    

    public Personajes(String Nombre, String Tipo) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }

    public Personajes(String Nombre, String Tipo, int x, int y) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.x = x;
        this.y = y;
    }

    public Personajes() {
        Nombre = "";
        Tipo = "";
        x = 0;
        y = 0;
        
    }
    
    
    
    
}
