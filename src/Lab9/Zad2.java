/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author mefod
 */
public class Zad2 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init()
    {
             
    }
    public void paint(final Graphics g) {
         int i, j;
         int[][] a = new int[3][3];
         for(i=0;i<3;i++){
           for(j=0;j<3;j++){
               a[i][j]=(int)Math.ceil(25*Math.random());
               g.drawString(Integer.toString(a[i][j]), 100+i, 100+j);
           }
        }
     }
}
