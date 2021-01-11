/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author mefod
 */
public class Calc extends /*javax.swing.*/JFrame {

double temp = 0;
double memory = 0;
        int i;
        char op= ' ';
        Calc(String s){
            super(s);
            setLayout(null);
            setSize(340,265);
            setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            final TextField display = new TextField("");
            display.setEditable(true);
            
            display.setBounds(2,2,238,22);
            add(display);
            Button b1 = new Button("1");
            b1.setBounds(2,30,40,40);
            add(b1);
            Button b2 = new Button("2");
            b2.setBounds(52,30,40,40);
            add(b2);
            Button b3 = new Button("3");
            b3.setBounds(102,30,40,40);
            add(b3);
            Button b4 = new Button("4");
            b4.setBounds(2,80,40,40);
            add(b4);
            Button b5 = new Button("5");
            b5.setBounds(52,80,40,40);
            add(b5);
            Button b6 = new Button("6");
            b6.setBounds(102,80,40,40);
            add(b6);
            Button b7 = new Button("7");
            b7.setBounds(2,130,40,40);
            add(b7);
            Button b8 = new Button("8");
            b8.setBounds(52,130,40,40);
            add(b8);
            Button b9 = new Button("9");
            b9.setBounds(102,130,40,40);
            add(b9);
            Button b0 = new Button("0");
            b0.setBounds(2,180,40,40);
            add(b0);
            Button beq = new Button("=");
            beq.setBounds(52,180,90,40);
            add(beq);
            Button bplus = new Button("+");
            bplus.setBounds(152,30,80,40);
            add(bplus);
            Button bminus = new Button("-");
            bminus.setBounds(152,80,80,40);
            add(bminus);
            Button bmul = new Button("*");
            bmul.setBounds(152,130,80,40);
            add(bmul);
            Button bdiv = new Button("/");
            bdiv.setBounds(152,180,80,40);
            add(bdiv);
            Button bmem = new Button("Память");
            bmem.setBounds(242,30,80,40);
            add(bmem);
            Button bfmem = new Button("Вызов");
            bfmem.setBounds(242,80,80,40);
            add(bfmem);
            
            b1.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  display.setText(display.getText()+"1");
              }
            });
            b2.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  display.setText(display.getText()+"2");
              }
            });
            b3.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  display.setText(display.getText()+"3");
              }
            });
            b4.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  display.setText(display.getText()+"4");
              }
            });
            b5.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  display.setText(display.getText()+"5");
              }
            });
            b6.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  display.setText(display.getText()+"6");
              }
            });
            b7.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  display.setText(display.getText()+"7");
              }
            });
            b8.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  display.setText(display.getText()+"8");
              }
            });
            b9.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  display.setText(display.getText()+"9");
              }
            });
            b0.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  display.setText(display.getText()+"0");
              }
            });
            bplus.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  char[] chars = display.getText().toCharArray();
                  for(i=0; i< chars.length; i++)
                  {
                      if ("1234567890.".contains(String.valueOf(chars[i])))
                      { 
                           op = '+';
                           temp = Double.valueOf(display.getText());
                           display.setText("");
                      }
                      else
                      {
                           display.setText("");
                      }
                  }
              }
            });
            bminus.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  char[] chars = display.getText().toCharArray();
                  for(i=0; i< chars.length; i++)
                  {
                      if ("1234567890.".contains(String.valueOf(chars[i])))
                      { 
                           op = '+';
                           temp = Double.valueOf(display.getText());
                           display.setText("");
                      }
                      else
                      {
                           display.setText("");
                      }
                  }
              }
            });
            bdiv.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  char[] chars = display.getText().toCharArray();
                  for(i=0; i< chars.length; i++)
                  {
                      if ("1234567890.".contains(String.valueOf(chars[i])))
                      { 
                           op = '/';
                           temp = Double.valueOf(display.getText());
                           display.setText("");
                      }
                      else
                      {
                           display.setText("");
                      }
                  }
              }
            });
            bmul.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  char[] chars = display.getText().toCharArray();
                  for(i=0; i< chars.length; i++)
                  {
                      if ("1234567890.".contains(String.valueOf(chars[i])))
                      { 
                           op = '*';
                           temp = Double.valueOf(display.getText());
                           display.setText("");
                      }
                      else
                      {
                           display.setText("");
                      }
                  }
              }
            });
            bmem.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  char[] chars = display.getText().toCharArray();
                  for(i=0; i< chars.length; i++)
                  {
                  if ("1234567890.".contains(String.valueOf(chars[i])))
                      { 
                           memory = Double.valueOf(display.getText());
                           display.setText("");
                      }
                      else
                      {
                           display.setText("");
                      }
                  }                          
              }
            });
            bfmem.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  String mem = String.valueOf(memory);
                  display.setText(mem);
              }
            });
            beq.addActionListener(new ActionListener()
            {
              public void actionPerformed(ActionEvent event)
              {
                  switch(op){
                      case '+':
                      display.setText(String.valueOf(temp+Double.valueOf(display.getText())));
                      break;
                      case '-':
                      display.setText(String.valueOf(temp-Double.valueOf(display.getText())));
                      break;
                      case '*':
                      display.setText(String.valueOf(temp*Double.valueOf(display.getText())));
                      break;
                      case '/':
                      display.setText(String.valueOf(temp/Double.valueOf(display.getText())));
                      break;
                  }
              }
            });
        }
    public Calc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new Calc("Calculator");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
