/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vidhya;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author lokesh
 */
public class Board extends javax.swing.JFrame {
    volatile JButton[][] but=new JButton[9][9];
    /**
     * Creates new form Board
     */
    public Board() {
        setLocation(100,50);
        setResizable(false);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jPanel2.setLayout(new java.awt.GridLayout(3, 3));
        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(3, 3));
        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(3, 3));
        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(3, 3));
        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(3, 3));
        jPanel1.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(3, 3));
        jPanel1.add(jPanel7);

        jPanel8.setLayout(new java.awt.GridLayout(3, 3));
        jPanel1.add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(3, 3));
        jPanel1.add(jPanel9);

        jPanel11.setLayout(new java.awt.GridLayout(3, 3));
        jPanel1.add(jPanel11);
        for(int i=0;i<9;i++)
        for(int j=0;j<9;j++){
            but[i][j]=new JButton();
            but[i][j].setBackground(Color.white);
            if(i>5){
                if(j>5)
                jPanel11.add(but[i][j]);
                else if(j>2)
                jPanel9.add(but[i][j]);
                else
                jPanel8.add(but[i][j]);
            }
            else if(i>2){
                if(j>5)
                jPanel7.add(but[i][j]);
                else if(j>2)
                jPanel6.add(but[i][j]);
                else
                jPanel5.add(but[i][j]);
            }
            else{
                if(j>5)
                jPanel4.add(but[i][j]);
                else if(j>2)
                jPanel3.add(but[i][j]);
                else
                jPanel2.add(but[i][j]);
            }
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Board b=new Board();
        b.setVisible(true);
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++){
                for(int k=0;k<3;k++){
                    //rotating the color in the button
                    rotate(b.but[i][j],new Color(((i+10+k)*80)%255,((j+10+k)*10)%255,((i+10+k)*(j+10+k)*40)%255));
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                    }
                    b.but[i][j].setBackground(Color.WHITE);
                }
            }
                
        
    }
    /**
     * @param b - JButton to set Color
     * @param c - Color to set
     * using SwingUtilities we can call invokeLater method to update the JFrame
     */
    static void rotate(JButton b,Color c){
        Runnable r=new Runnable() {
            @Override
            public void run() {
        
                    b.setBackground(c);
            }
        };
        SwingUtilities.invokeLater(r);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration                   
}
