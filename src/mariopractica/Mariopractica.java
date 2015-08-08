/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariopractica;

import javax.swing.JFrame;

/**
 *
 * @author G42368LA
 */
public class Mariopractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pantalla1 p = new pantalla1();
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setSize(1000,600);
		p.setLayout(null);
		p.show();
                p.setLocationRelativeTo(null);
        
        // TODO code application logic here
    }
    
}
