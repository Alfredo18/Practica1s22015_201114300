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
public class ListaDoble {
    // IN = nodo inicio, END nodo final
        Nodo IN, END;

    public ListaDoble() {
        this.IN= null;
        this.END=null;
        
    }
    
    public boolean listavacia(){
        if (IN==null){
        return true;
        } 
        else{
        return false;
        }
}
    
    public void InsertarPersonajeIN(Personajes per){
        if(!listavacia()){
        IN = new Nodo(per, IN, null);
        IN.nex.pre=IN;
        } else{
        IN = END = new Nodo(per);
        }
    }
    
    public void InsertarPersonajeEND(Personajes per){
    if(!listavacia()){
        END = new Nodo(per, null, END);
        END.pre.nex=END;
        }else{
        IN = END = new Nodo(per);
        }
    }
    
}
