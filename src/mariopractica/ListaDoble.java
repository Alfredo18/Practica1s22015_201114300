/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariopractica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
    
    public Personajes EliminarPersonajeIN(){
        Personajes per =IN.per;
        if(IN==END){
                IN=END=null;
        } else{
            IN=IN.nex;
            IN.pre=null;
       }
        return per;
    }
    
    public Personajes EliminarPersonajeEND(){
        Personajes per =END.per;
        if(IN==END){
                IN=END=null;
        } else{
            END=END.pre;
            END.nex=null;
       }
        return per;
    }
    
    public void CargarListas(JPanel CargarImg){
     int contador =0;
     Nodo ayuda = IN;
     int aumentador = 70;
     while(ayuda!=null){
         if(ayuda.per.Tipo==("mario")){
         ImageIcon img = new ImageIcon("C:\\Users\\G42368LA\\Documents\\NetBeansProjects\\Mariopractica\\src\\Imaganes\\mario.png");
         ayuda.setIcon(img);
         ayuda.setBounds(25+contador*aumentador, 18, 26, 38);
         CargarImg.add(ayuda);
         CargarImg.repaint();
         contador ++;
         
         } else if(ayuda.per.Tipo==("hongo")){
         ImageIcon img = new ImageIcon("C:\\Users\\G42368LA\\Documents\\NetBeansProjects\\Mariopractica\\src\\Imaganes\\hongo.png");
         ayuda.setIcon(img);
         ayuda.setBounds(25+contador*aumentador, 18, 20, 26);
         CargarImg.add(ayuda);
         CargarImg.repaint();
         contador ++;
         
         } else if(ayuda.per.Tipo==("Pared")){
         ImageIcon img = new ImageIcon("C:\\Users\\G42368LA\\Documents\\NetBeansProjects\\Mariopractica\\src\\Imaganes\\Pared.png");
         ayuda.setIcon(img);
         ayuda.setBounds(25+contador*aumentador, 18, 24, 26);
         CargarImg.add(ayuda);
         CargarImg.repaint();
         contador ++;
         
         }else if(ayuda.per.Tipo==("tortuga")){
         ImageIcon img = new ImageIcon("C:\\Users\\G42368LA\\Documents\\NetBeansProjects\\Mariopractica\\src\\Imaganes\\Kopa.png");
         ayuda.setIcon(img);
         ayuda.setBounds(25+contador*aumentador, 18, 24, 27);
         CargarImg.add(ayuda);
         CargarImg.repaint();
         contador ++;
         
         }else if(ayuda.per.Tipo==("Ficha")){
         ImageIcon img = new ImageIcon("C:\\Users\\G42368LA\\Documents\\NetBeansProjects\\Mariopractica\\src\\Imaganes\\ficha.png");
         ayuda.setIcon(img);
         ayuda.setBounds(25+contador*aumentador, 18, 15, 27);
         CargarImg.add(ayuda);
         CargarImg.repaint();
         contador ++;
         
         }else if(ayuda.per.Tipo==("Castillo")){
         ImageIcon img = new ImageIcon("C:\\Users\\G42368LA\\Documents\\NetBeansProjects\\Mariopractica\\src\\Imaganes\\castillo.png");
         ayuda.setIcon(img);
         ayuda.setBounds(25+(contador*aumentador)+4, 14, 60, 59);
         CargarImg.add(ayuda);
         CargarImg.repaint();
         contador ++;
         
         }else if(ayuda.per.Tipo==("HongoMalo")){
         ImageIcon img = new ImageIcon("C:\\Users\\G42368LA\\Documents\\NetBeansProjects\\Mariopractica\\src\\Imaganes\\Gomba.png");
         ayuda.setIcon(img);
         ayuda.setBounds(25+contador*aumentador, 18, 23, 25);
         CargarImg.add(ayuda);
         CargarImg.repaint();
         contador ++;
         
         }else if(ayuda.per.Tipo==("Suelo")){
         ImageIcon img = new ImageIcon("C:\\Users\\G42368LA\\Documents\\NetBeansProjects\\Mariopractica\\src\\Imaganes\\Suelo.png");
         ayuda.setIcon(img);
         ayuda.setBounds(25+(contador*aumentador)+4, 14, 57, 51);
         CargarImg.add(ayuda);
         CargarImg.repaint();
         contador ++;
         
         }
     ayuda=ayuda.nex;
     }
    
    }
    
    public void mostrarlista(){
    if(!listavacia()){
        String datos = "<=>";
        Nodo aux = IN;
        while(aux!=null){
        datos= datos + "["+aux.per.Nombre+"]<=>";
        aux=aux.nex;
        }
        JOptionPane.showMessageDialog(null,datos,"Mostrando Lista",JOptionPane.INFORMATION_MESSAGE);
    }   }
    
       public String Grafis(){
          String inicio = "";
          String enlace="->";
          String guardar="";
          String retroceder ="";
         
          int Contador =1;
          Nodo ayuda =END;
          
          while(ayuda!=null){
          inicio = inicio+Contador+"[label="+ayuda.per.Nombre+"];\n";
          ayuda=ayuda.pre;
          Contador++;
          }
          Contador--;
          
          for(int i=1;i<Contador;){
               guardar =guardar +i + enlace+ ++i +";\n";  
               
          }
          
          for(int i=1;i < Contador;){
               retroceder =retroceder +Contador + enlace+ (--Contador)+";\n";  
               
          } 
           
       System.out.println("digraph G{\n"+inicio+guardar+retroceder+"}");
return "digraph G{\n"+inicio+guardar+retroceder+"}";
}
}
