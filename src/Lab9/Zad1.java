/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;
import java.awt.*;
import java.applet.*;
/**
 *
 * @author mefod
 */
public class Zad1 extends Applet{
    @Override
         public void init(){
             
         }
         public void paint(Graphics g) {
                g.drawLine(0, 0, 500, 0);

                g.drawLine(0, 0, 0, 500);

                g.drawLine(500, 0, 500, 500);

                g.drawLine(500, 500, 0, 500);

                Color newColor = new Color(0, 0, 255);

                newColor = new Color(200, 50, 200);

                g.drawLine(150, 480, 350, 480);

                g.drawLine(150, 480, 150, 250);

                g.drawLine(350, 480, 350, 250);

                g.setColor(newColor);

                g.drawLine(100, 250, 400, 250);

                g.drawLine(100, 250, 250, 200);

                g.drawLine(250, 200, 400, 250);
         }
    
}
