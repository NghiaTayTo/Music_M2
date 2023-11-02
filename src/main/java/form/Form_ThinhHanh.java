
package form;

import javax.swing.ImageIcon;
import model.Model_ThinhHanh;


public class Form_ThinhHanh extends javax.swing.JLayeredPane {

  
    public Form_ThinhHanh() {
        initComponents();
        init();
    }
    
    public void init(){
         thinhHanh.addImage(new Model_ThinhHanh(new ImageIcon(getClass().getResource("/icon/avicii.png")), "Avicii True Stories", "15 Albums | 17.5M Follower"));
         thinhHanh.addImage(new Model_ThinhHanh(new ImageIcon(getClass().getResource("/icon/kygo.png")), "Kygo and Alan Walker", "15 Albums | 17.5M Mollowers"));
        thinhHanh.addImage(new Model_ThinhHanh(new ImageIcon(getClass().getResource("/icon/ed-sheeran.jpg")), "Ed Sheeran", "15 Albums | 17.5M Mollowers"));
        thinhHanh.addImage(new Model_ThinhHanh(new ImageIcon(getClass().getResource("/icon/sigala.jpg")), "Sigala", "15 Albums | 17.5M Mollowers"));
    }
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        thinhHanh = new component.ThinhHanh();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Khám phá");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Thịnh hành");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thinhHanh, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thinhHanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(441, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private component.ThinhHanh thinhHanh;
    // End of variables declaration//GEN-END:variables
}
