/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postest1_mod12;

import javax.swing.JOptionPane;

/**
 *
 * @author Spitzery
 */
public class Suhu extends javax.swing.JFrame {
    int input;
    int cf=0,ck=0,cr=0,fc=0,fk=0,fr=0,kc=0,kf=0,kr=0,rc=0,rf=0,rk=0,cc=0,ff=0,kk=0,rr=0;
            
     public void parsing () {
        try {
       input=Integer.parseInt(inp.getText().toString());
       } catch (NumberFormatException e) {
            }
    }

    /**
     * Creates new form Suhu
     */
    public Suhu() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ik = new javax.swing.JRadioButton();
        ic = new javax.swing.JRadioButton();
        ir = new javax.swing.JRadioButton();
        iff = new javax.swing.JRadioButton();
        inp = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        oun = new javax.swing.JTextField();
        or = new javax.swing.JRadioButton();
        ok = new javax.swing.JRadioButton();
        oc = new javax.swing.JRadioButton();
        off = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OUTPUT");

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INPUT");

        jPanel2.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.setForeground(new java.awt.Color(0, 204, 51));

        buttonGroup1.add(ik);
        ik.setText("Kelvin");
        ik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ikMouseClicked(evt);
            }
        });

        buttonGroup1.add(ic);
        ic.setText("Celcius");
        ic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icMouseClicked(evt);
            }
        });
        ic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icActionPerformed(evt);
            }
        });

        buttonGroup1.add(ir);
        ir.setText("Reamur");
        ir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                irMouseClicked(evt);
            }
        });

        buttonGroup1.add(iff);
        iff.setText("Fahrenheit");
        iff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iffMouseClicked(evt);
            }
        });

        inp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ik)
                    .addComponent(ic)
                    .addComponent(ir)
                    .addComponent(iff)
                    .addComponent(inp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(inp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        oun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ounMouseClicked(evt);
            }
        });

        buttonGroup2.add(or);
        or.setText("Reamur");
        or.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orMouseClicked(evt);
            }
        });

        buttonGroup2.add(ok);
        ok.setText("Kelvin");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });

        buttonGroup2.add(oc);
        oc.setText("Celcius");
        oc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocMouseClicked(evt);
            }
        });

        buttonGroup2.add(off);
        off.setText("Fahrenheit");
        off.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                offMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ok)
                    .addComponent(oc)
                    .addComponent(or)
                    .addComponent(off)
                    .addComponent(oun, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(or)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(off)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(oun, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(261, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel3)
                    .addContainerGap(217, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Konversi Suhu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icActionPerformed

    private void ikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ikMouseClicked
        this.parsing();
        if (ik.isSelected()==true){
            inp.setText(input+" K");
            kc = input - 273;
            kf = (int) (1.8 *(input - 273)+32);
            kr = (int) (0.8*(input - 273));
            kk=input;
        }
    
    
    }//GEN-LAST:event_ikMouseClicked

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
       this.parsing();
       if (ok.isSelected()==true && ic.isSelected()==true){
           oun.setText(ck+" K");
       }
       if (ok.isSelected()==true && iff.isSelected()==true){
         oun.setText(fk+" K");
     }
       if (ok.isSelected()==true && ir.isSelected()==true){
         oun.setText(rk+" K");
     }
       if (ok.isSelected()==true && ik.isSelected()==true){
         oun.setText(kk+" K");
     }
    }//GEN-LAST:event_okMouseClicked

    private void icMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icMouseClicked
        this.parsing();
        if (ic.isSelected()==true){
            inp.setText(input+" C");
        cf = (int) ((1.8 * input) +32);
        ck = input + 273;
        cr = (int) (0.8 * input); 
        cc=input;
    }// TODO add your handling code here:
    }//GEN-LAST:event_icMouseClicked

    private void irMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_irMouseClicked
       this.parsing();
       if (ir.isSelected()==true){
           inp.setText(input+" R");
           rc = (int) (1.25 * input);
           rk = (int) ((1.25 * input)+273);
           rf = (int) ((2.25 * input)+32);
           rr=input;
           
       }
    }//GEN-LAST:event_irMouseClicked

    private void iffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iffMouseClicked
    this.parsing();
    if (iff.isSelected()==true){
        inp.setText(input+" F");
        fc = (int) (0.55*(input - 32));
        fk = (int) (0.55*(input - 32)+273);
        fr = (int) (0.44 *(input - 32));
        ff=input;
    }
    }//GEN-LAST:event_iffMouseClicked

    private void ocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocMouseClicked
     this.parsing();
     if (oc.isSelected()==true && iff.isSelected()==true){
         oun.setText(fc+" C");
     }
     if (oc.isSelected()==true && ik.isSelected()==true){
         oun.setText(kc+" C");
     }
     if (oc.isSelected()==true && ir.isSelected()==true){
         oun.setText(rc+" C");
     }
     if (oc.isSelected()==true && ic.isSelected()==true){
         oun.setText(cc+" C");
     }
    }//GEN-LAST:event_ocMouseClicked

    private void orMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orMouseClicked
      this.parsing();
      if (or.isSelected()==true && iff.isSelected()==true){
         oun.setText(fr+" R");
     }
      if (or.isSelected()==true && ik.isSelected()==true){
         oun.setText(kr+" R");
     }
      if (or.isSelected()==true && ic.isSelected()==true){
         oun.setText(cr+" R");
     }
      if (or.isSelected()==true && ir.isSelected()==true){
         oun.setText(rr+" R");
     }
    }//GEN-LAST:event_orMouseClicked

    private void offMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offMouseClicked
    this.parsing();
    if (off.isSelected()==true && ic.isSelected()==true){
         oun.setText(cf+" F");
     }
    if (off.isSelected()==true && ik.isSelected()==true){
         oun.setText(kf+" F");
     }
    if (off.isSelected()==true && ir.isSelected()==true){
         oun.setText(rf+" F");
     }
    if (off.isSelected()==true && iff.isSelected()==true){
         oun.setText(ff+" F");
     }
    }//GEN-LAST:event_offMouseClicked

    private void inpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inpMouseClicked
    inp.setText("");
    ik.setSelected(false);
    ic.setSelected(false);
    iff.setSelected(false);
    ir.setSelected(false);
    }//GEN-LAST:event_inpMouseClicked

    private void ounMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ounMouseClicked
    oun.setText("");
    }//GEN-LAST:event_ounMouseClicked

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
            java.util.logging.Logger.getLogger(Suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton ic;
    private javax.swing.JRadioButton iff;
    private javax.swing.JRadioButton ik;
    private javax.swing.JTextField inp;
    private javax.swing.JRadioButton ir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton oc;
    private javax.swing.JRadioButton off;
    private javax.swing.JRadioButton ok;
    private javax.swing.JRadioButton or;
    private javax.swing.JTextField oun;
    // End of variables declaration//GEN-END:variables
}
