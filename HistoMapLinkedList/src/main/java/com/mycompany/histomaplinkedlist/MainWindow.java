package com.mycompany.histomaplinkedlist;
import java.awt.GridLayout;
/**
 *
 * @author skyla
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        MainWindow_Button_GetHashMap = new javax.swing.JButton();
        MainWindow_TextField_Grades = new javax.swing.JTextField();
        MainWindow_Label_GradesHERE = new javax.swing.JLabel();
        MainWindow_Panel_Graph = new GraphicsPanel();
        MainWindow_Button_removeTable = new javax.swing.JButton();
        MainWindow_Button_RanColor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainWindow_Button_GetHashMap.setText("Show HashMap");
        MainWindow_Button_GetHashMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainWindow_Button_GetHashMapActionPerformed(evt);
            }
        });

        MainWindow_TextField_Grades.setText("94 85 86 92 100 74 85 96 84 84 82 78 74 60 62 96 87 88 50");

        MainWindow_Label_GradesHERE.setText("<-Grades here");

        MainWindow_Panel_Graph.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MainWindow_Panel_GraphLayout = new javax.swing.GroupLayout(MainWindow_Panel_Graph);
        MainWindow_Panel_Graph.setLayout(MainWindow_Panel_GraphLayout);
        MainWindow_Panel_GraphLayout.setHorizontalGroup(
            MainWindow_Panel_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MainWindow_Panel_GraphLayout.setVerticalGroup(
            MainWindow_Panel_GraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        MainWindow_Button_removeTable.setText("Remove Table");
        MainWindow_Button_removeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainWindow_Button_removeTableActionPerformed(evt);
            }
        });

        MainWindow_Button_RanColor.setText("Random Colors");
        MainWindow_Button_RanColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainWindow_Button_RanColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(MainWindow_Button_removeTable)
                .addGap(18, 18, 18)
                .addComponent(MainWindow_Button_GetHashMap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(MainWindow_Button_RanColor)
                .addGap(18, 18, 18)
                .addComponent(MainWindow_TextField_Grades, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(MainWindow_Label_GradesHERE)
                .addGap(28, 28, 28))
            .addComponent(MainWindow_Panel_Graph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MainWindow_Panel_Graph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainWindow_Button_GetHashMap)
                    .addComponent(MainWindow_TextField_Grades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainWindow_Label_GradesHERE)
                    .addComponent(MainWindow_Button_removeTable)
                    .addComponent(MainWindow_Button_RanColor))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainWindow_Button_GetHashMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainWindow_Button_GetHashMapActionPerformed
    //passes the grade data to the Graphics Panel so that histogram is built in the GraphicsComponent(Graphics) methid.
    
    String data = MainWindow_TextField_Grades.getText();
    ((GraphicsPanel)MainWindow_Panel_Graph).processData(data, false);
    }//GEN-LAST:event_MainWindow_Button_GetHashMapActionPerformed

    private void MainWindow_Button_removeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainWindow_Button_removeTableActionPerformed
    String data = "";
    ((GraphicsPanel)MainWindow_Panel_Graph).processData(data, false);
    }//GEN-LAST:event_MainWindow_Button_removeTableActionPerformed

    private void MainWindow_Button_RanColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainWindow_Button_RanColorActionPerformed
    String data = MainWindow_TextField_Grades.getText();
    ((GraphicsPanel)MainWindow_Panel_Graph).processData(data, true);
    }//GEN-LAST:event_MainWindow_Button_RanColorActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainWindow_Button_GetHashMap;
    private javax.swing.JButton MainWindow_Button_RanColor;
    private javax.swing.JButton MainWindow_Button_removeTable;
    private javax.swing.JLabel MainWindow_Label_GradesHERE;
    private javax.swing.JPanel MainWindow_Panel_Graph;
    private javax.swing.JTextField MainWindow_TextField_Grades;
    // End of variables declaration//GEN-END:variables
}
