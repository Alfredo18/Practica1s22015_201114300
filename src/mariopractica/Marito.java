/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariopractica;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author G42368LA
 */
public class Marito {
    public int x;
    public int y;
    public int width;
    public int hiegth;
    public boolean vista;
    public Image img;
    
    public Marito (int x, int y){
    this.x=x;
    this.y=y;
    vista=true;
    }
    
    public void getImageDimensions(){
    width = img.getWidth(null);
    hiegth = img.getHeight(null);
}
    
    public void loadImage(String imageName){
    ImageIcon ii = new ImageIcon(imageName);
    img = ii.getImage();
    }
    
    public boolean isVisible(){
    return vista;
    }
    
    public Rectangle getBounds(){
    return new Rectangle (x,y,width,hiegth);
    
    }
    
    public Image getImage(){
    return img;
    } 
    public int getX(){
    return x;
    
    }
    
    public int getY(){
    return y;
    
    }
    
}


