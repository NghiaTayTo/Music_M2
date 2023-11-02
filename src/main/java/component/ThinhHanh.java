
package component;

import model.Model_ThinhHanh;

public class ThinhHanh extends javax.swing.JLayeredPane  {


    public ThinhHanh() {
        initComponents();
    }
    
    public void addImage(Model_ThinhHanh data){
            ItemThinhHanh item = new ItemThinhHanh();
            item.setData(data);
            panel.add(item);
            panel.repaint();
            panel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        scrollBarr1 = new swing.ScrollBarr();

        sp.setBorder(null);
        sp.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        sp.setHorizontalScrollBar(scrollBarr1);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sp.setViewportView(panel);

        scrollBarr1.setBackground(new java.awt.Color(204, 204, 204));
        scrollBarr1.setForeground(new java.awt.Color(0, 0, 0));
        scrollBarr1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);

        setLayer(sp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(scrollBarr1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollBarr1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollBarr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    private swing.ScrollBarr scrollBarr1;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
