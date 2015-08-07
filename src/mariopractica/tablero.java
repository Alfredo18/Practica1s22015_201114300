/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariopractica;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author G42368LA
 */
public class tablero extends JPanel{

    public tablero() {
        this.setBounds(0, 0, 500, 500);
        this.setBackground(Color.black);
       
    }
    Marito m = new Marito(50,50);
    public void paintComponent(Graphics d){
        super.paintComponent(d);
        d.setColor(Color.red);
        int ancho = getWidth();
        int alto = getHeight();
        m.loadImage("C:\\Users\\G42368LA\\Documents\\NetBeansProjects\\Mariopractica\\src\\Imaganes\\mario.png");
        d.drawImage(m.getImage(), m.getX(), m.getY(), this);
                
        
        for (int i = 0; i <=ancho;i+=25) {
            for (int j = 0; j <=alto; j+=25) {
                d.drawRect(0, 0, i, j);
               
  
            }
        }
     
        
        
        
        
    }
    
    
}
