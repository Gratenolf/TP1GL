/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ng452532
 */
public class InterfacePanier extends javax.swing.JFrame {
    public Panier Pan;
    public String listeOrange[]={"Chili","Perou","Ouzbekistan","Slovaquie","Mozambique"};
    public String listeBanane[]={"Angola","Perou","Islande","Canada"};
    int qt=0;
        
        
        
    /**
     * Creates new form InterfacePanier
     */
    public InterfacePanier() throws FruitException {
        Pan = new Panier(10);
        initComponents();
        this.elements.removeAllItems();
        for(int i=0;i<5;i++)
        {
            this.elements.addItem("orange de "+listeOrange[i]);
            this.Affichage.append("0 orange de "+listeOrange[i]);
        }
        for(int i=0;i<4;i++){
            this.elements.addItem("Banane de "+listeBanane[i]);
            this.Affichage.append("0 Banane de "+listeBanane[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        plus = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        elements = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        moins = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Affichage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel5.add(plus, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.WEST);

        jPanel6.setLayout(new java.awt.BorderLayout());

        elements.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        elements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementsActionPerformed(evt);
            }
        });
        jPanel6.add(elements, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        moins.setText("-");
        moins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moinsActionPerformed(evt);
            }
        });
        jPanel2.add(moins, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        Affichage.setColumns(20);
        Affichage.setRows(5);
        jScrollPane1.setViewportView(Affichage);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plusActionPerformed

    private void elementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementsActionPerformed
        
    }//GEN-LAST:event_elementsActionPerformed

    private void moinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moinsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moinsActionPerformed

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
            java.util.logging.Logger.getLogger(InterfacePanier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePanier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePanier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePanier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfacePanier().setVisible(true);
                } catch (FruitException ex) {
                    Logger.getLogger(InterfacePanier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Affichage;
    private javax.swing.JComboBox<String> elements;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton moins;
    private javax.swing.JButton plus;
    // End of variables declaration//GEN-END:variables
}
