
package main;

import java.awt.Color;
import model.Model_Menu;
import swing.ScrollBarr;


public class Main extends javax.swing.JFrame {

  
    public Main() {
        initComponents();
        init();
    }
    
    public void init(){
        sp.setVerticalScrollBar(new ScrollBarr());
        setBackground(new Color(0,0,0,0));
        list1.addItem(new Model_Menu("Khám phá","song"));
        list1.addItem(new Model_Menu("Thư viện","playlist"));
        list1.addItem(new Model_Menu("Radio","radio"));
        list1.addItem(new Model_Menu("Zingchart","albums"));
        list1.addItem(new Model_Menu("Tài khoản","artists"));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new swing.Panel();
        header2 = new component.header();
        lbOut = new javax.swing.JLabel();
        menu1 = new component.Menu();
        list1 = new component.ListMenuItem<>();
        footer3 = new component.footer();
        sp = new javax.swing.JScrollPane();
        form_ThinhHanh2 = new form.Form_ThinhHanh();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setForeground(new java.awt.Color(255, 255, 255));

        lbOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbOut.setForeground(new java.awt.Color(255, 0, 0));
        lbOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOut.setText("X");
        lbOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbOutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout header2Layout = new javax.swing.GroupLayout(header2);
        header2.setLayout(header2Layout);
        header2Layout.setHorizontalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbOut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        header2Layout.setVerticalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbOut)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        footer3.setBackground(new java.awt.Color(51, 51, 51));
        footer3.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout footer3Layout = new javax.swing.GroupLayout(footer3);
        footer3.setLayout(footer3Layout);
        footer3Layout.setHorizontalGroup(
            footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        footer3Layout.setVerticalGroup(
            footer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        sp.setBackground(new java.awt.Color(255, 255, 255));
        sp.setForeground(new java.awt.Color(255, 255, 255));
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setOpaque(false);
        sp.setViewportView(form_ThinhHanh2);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE))
            .addComponent(footer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(footer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseExited
        lbOut.setForeground(new Color(255,0,0));
    }//GEN-LAST:event_lbOutMouseExited

    private void lbOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseEntered
        lbOut.setForeground(new Color(153,0,0));
    }//GEN-LAST:event_lbOutMouseEntered

    private void lbOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbOutMouseClicked


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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.footer footer3;
    private form.Form_ThinhHanh form_ThinhHanh2;
    private component.header header2;
    private javax.swing.JLabel lbOut;
    private component.ListMenuItem<String> list1;
    private component.Menu menu1;
    private swing.Panel panel1;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
