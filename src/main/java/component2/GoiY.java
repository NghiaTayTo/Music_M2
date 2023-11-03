
package component2;

import javax.swing.ImageIcon;
import model.Model_GoiY;


public class GoiY extends javax.swing.JPanel {

 
    public GoiY() {
        initComponents();
        init();
    }
    
    public void init(){
        list1.addItem(new Model_GoiY("Cắt đôi nỗi sầu","Tăng Duy Tân", new ImageIcon(getClass().getResource("/icon/thuyChi.jpg"))));
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new component2.ListGoiY<>();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 669, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component2.ListGoiY<String> list1;
    // End of variables declaration//GEN-END:variables
}
