
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aybuk
 */
public class izlemepenceresi extends javax.swing.JFrame {

    /**
     * Creates new form izlemepenceresi
     */
    Connection con;
    private static Statement st;
    private static Statement sta;
    private static Statement stb;

    public static Connection connect() {

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabanları", "root", "");

        } catch (Exception e) {
            System.out.println("Veri tabanı bağlantısı başarısız hata:" + e);
        }
        return con;
    }

    public izlemepenceresi() {
        initComponents();

        String tur = "SELECT * FROM program WHERE program.progid IN(SELECT programturtablo.progid FROM programturtablo WHERE programturtablo.turid IN( SELECT turtab.turid FROM turtab WHERE turtab.turad LIKE (SELECT kullanicitablo.sevdigi1 FROM kullanicitablo WHERE kullanicitablo.kullaniciemail='" + Login_Form.girilenmail + "')))order by puanlama desc LIMIT 0,2";

        try (Connection conn = connect(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(tur);) {
            rs.next();
            String ad = rs.getString("progadi");
            jLabel1.setText(ad);
            rs.next();
            ad = rs.getString("progadi");
            jLabel2.setText(ad);

        } catch (Exception ex) {
            System.err.println("Veri çekme başarısız!");
        }
        String tura = "SELECT * FROM program WHERE program.progid IN(SELECT programturtablo.progid FROM programturtablo WHERE programturtablo.turid IN( SELECT turtab.turid FROM turtab WHERE turtab.turad LIKE (SELECT kullanicitablo.sevdigi2 FROM kullanicitablo WHERE kullanicitablo.kullaniciemail='" + Login_Form.girilenmail + "')))order by puanlama desc LIMIT 0,2";

        try (Connection conn = connect(); Statement sta = conn.createStatement(); ResultSet rsa = sta.executeQuery(tura);) {
            rsa.next();
            String ada = rsa.getString("progadi");
            jLabel3.setText(ada);
            rsa.next();
            ada = rsa.getString("progadi");
            jLabel4.setText(ada);

        } catch (Exception ex) {
            System.err.println("Veri çekme başarısız!");
        }

        String turb = "SELECT * FROM program WHERE program.progid IN(SELECT programturtablo.progid FROM programturtablo WHERE programturtablo.turid IN( SELECT turtab.turid FROM turtab WHERE turtab.turad LIKE (SELECT kullanicitablo.sevdigi3 FROM kullanicitablo WHERE kullanicitablo.kullaniciemail='" + Login_Form.girilenmail + "')))order by puanlama desc LIMIT 0,2";

        try (Connection conn = connect(); Statement stb = conn.createStatement(); ResultSet rsb = stb.executeQuery(turb);) {
            rsb.next();
            String adb = rsb.getString("progadi");
            jLabel5.setText(adb);
            rsb.next();
            adb = rsb.getString("progadi");
            jLabel6.setText(adb);

        } catch (Exception ex) {
            System.err.println("Veri çekme başarısız!");
        }
        String tural = tip.getText();
    }

    public void proglist(String turtip) {

        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabanları", "root", "");
            String query1 = "SELECT * FROM program WHERE tipi LIKE '%" + turtip + "%'";
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Object[] row = new Object[7];
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while (rs.next()) {
               
                 
                    row[0] = rs.getString(1);
                    row[1] = rs.getString(2);
                    row[2] = rs.getString(3);
                    row[3] = rs.getString(4);
                    row[4] = rs.getString(5);
                    row[5] = rs.getString(6);
                    row[6] = rs.getString(7);
                    model.addRow(row);

                
             
            }
        } catch (Exception e) {
            System.err.println("Veri tabanı bağlantısı başarısız!");

        }

    }

    public void proglist2(String turtip) {

        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabanları", "root", "");
            String query1 = "SELECT * FROM program WHERE progadi LIKE '%" + turtip + "%'";
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Object[] row = new Object[7];
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while (rs.next()) {
                 
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                model.addRow(row);

            }
        } catch (Exception e) {
            System.err.println("Veri tabanı bağlantısı başarısız!");

        }

    }

   
 /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tip = new javax.swing.JTextField();
        turegore = new javax.swing.JButton();
        ısmegore = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 7));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 8));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 7));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 7));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 7));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 7));

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Sevdiği tür film önerisi 2:");

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Sevdiği tür film önerisi 3:");

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Sevdiği tür film önerisi 4:");

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Sevdiği tür film önerisi 5:");

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Sevdiği tür film önerisi 6:");

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Sevdiği tür film önerisi 1:");

        tip.setBackground(new java.awt.Color(153, 0, 0));
        tip.setText("FİLM İSMİ/TÜR İSMİ:");
        tip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipActionPerformed(evt);
            }
        });

        turegore.setBackground(new java.awt.Color(153, 0, 0));
        turegore.setText("TÜRE GÖRE ARAMA YAPINIZ");
        turegore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turegoreMouseClicked(evt);
            }
        });

        ısmegore.setBackground(new java.awt.Color(153, 0, 0));
        ısmegore.setText("İSME GÖRE ARAMA YAPINIZ.");
        ısmegore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ısmegoreMouseClicked(evt);
            }
        });
        ısmegore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ısmegoreActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "progid", "progadi", "tipi", "turu", "puanlama", "bolumsayisi", "uzunluk"
            }
        ));
        jTable1.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix 7.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(344, 344, 344)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(turegore, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ısmegore, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(tip, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 672, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(turegore, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(tip, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(ısmegore, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipActionPerformed

    private void ısmegoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ısmegoreActionPerformed

    }//GEN-LAST:event_ısmegoreActionPerformed

    private void turegoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turegoreMouseClicked

        proglist(tip.getText());


    }//GEN-LAST:event_turegoreMouseClicked

    private void ısmegoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ısmegoreMouseClicked
        proglist2(tip.getText());
    }//GEN-LAST:event_ısmegoreMouseClicked
    progizleme fr = new progizleme();
    public static String idd;
    public static String adii;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        idd = model.getValueAt(index, 0).toString();
        adii = model.getValueAt(index, 1).toString();
        String filmturu = model.getValueAt(index, 2).toString();
        String filmtipi = model.getValueAt(index, 3).toString();
        String filmpuan = model.getValueAt(index, 4).toString();
        String filmbolumsayısı = model.getValueAt(index, 5).toString();
        String filmuzunlugu = model.getValueAt(index, 6).toString();

        fr.setVisible(true);
        fr.pack();

        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();

        fr.iddd.setText(idd);
        fr.jLabel1.setText(adii);
        fr.jLabel2.setText(filmturu);
        fr.jLabel3.setText(filmtipi);
        fr.jLabel4.setText(filmpuan);
        fr.jLabel5.setText(filmbolumsayısı);
        fr.jLabel6.setText(filmuzunlugu);

    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tip;
    private javax.swing.JButton turegore;
    private javax.swing.JButton ısmegore;
    // End of variables declaration//GEN-END:variables
}
