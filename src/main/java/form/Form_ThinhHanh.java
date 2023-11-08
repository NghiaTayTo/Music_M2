package form;

import SlideShow.Slide1;
import SlideShow.Slide2;
import SlideShow.Slide3;
import SlideShow.Slide4;
import Table.Model_Table;
import javax.swing.ImageIcon;

public class Form_ThinhHanh extends javax.swing.JLayeredPane {

    public Form_ThinhHanh() {
        initComponents();
        init();
        initTableData();

    }

    public void init() {
        slideShow1.initSlideshow(new Slide1(), new Slide2(), new Slide3(), new Slide4());

    }

    private void initTableData() {
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Chill/nhiptraitim.jpg")), "Nhịp Trái Tim", "Ai Biết", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Chill/anhsedoi.jpg")), "Anh Sẽ Đợi", "Ai Biết", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Chill/nangamxadan.jpg")), "Nắng Ấm Xa Dần", "Sơn Tùng M-TP", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Chill/codonglon.jpg")), "Cổ Đông Lớn", "Ai Biết", "120K", "03:50").toRowTable());
        table1.addRow(new Model_Table(new ImageIcon(getClass().getResource("/icon/Chill/dungsai.jpg")), "Đừng Sai", "Ai Biết", "120K", "03:50").toRowTable());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTable1 = new Table.TableMusic();
        slideShow1 = new SlideShow.SlideShow();
        vuTruNhacViet2 = new List.VuTruNhacViet();
        quocTeNoiBat2 = new List.QuocTeNoiBat();
        tamTrangHomNay1 = new List.TamTrangHomNay();
        chuDeHot2 = new List.ChuDeHot();
        top1001 = new List.Top100();
        table1 = new Table.TableMusic();

        setBackground(new java.awt.Color(29, 38, 49));
        setOpaque(true);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Sing", "View", "Time"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });

        setLayer(slideShow1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(vuTruNhacViet2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(quocTeNoiBat2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(tamTrangHomNay1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(chuDeHot2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(top1001, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(table1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(slideShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(top1001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chuDeHot2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tamTrangHomNay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quocTeNoiBat2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vuTruNhacViet2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(slideShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(vuTruNhacViet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(quocTeNoiBat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(tamTrangHomNay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(chuDeHot2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(top1001, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1397, Short.MAX_VALUE))
        );

    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked

    }//GEN-LAST:event_table1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private List.ChuDeHot chuDeHot2;
    private Table.TableMusic jTable1;
    private List.QuocTeNoiBat quocTeNoiBat2;
    private SlideShow.SlideShow slideShow1;
    private Table.TableMusic table1;
    private List.TamTrangHomNay tamTrangHomNay1;
    private List.Top100 top1001;
    private List.VuTruNhacViet vuTruNhacViet2;
    // End of variables declaration//GEN-END:variables
}
