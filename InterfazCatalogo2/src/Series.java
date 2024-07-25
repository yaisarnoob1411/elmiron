
import comoboxes.list_generos;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JLabel;


public class Series extends javax.swing.JFrame {
    
    Coneccion conectar = new Coneccion();
    Connection conect = conectar.conexion();

    private ImageIcon imagen;
    private Icon icono;
    
    public Series() {
        initComponents();
        this.setLocationRelativeTo(this);
        cargarCombo(cbCategoria);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVer1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnVer = new javax.swing.JButton();
        btnVer2 = new javax.swing.JButton();
        cbSeries = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Picture = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();

        btnVer1.setBackground(new java.awt.Color(255, 255, 102));
        btnVer1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVer1.setText("VER");

        jRadioButton1.setText("jRadioButton1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));

        btnVer.setBackground(new java.awt.Color(255, 255, 102));
        btnVer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVer.setText("VER");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnVer2.setBackground(new java.awt.Color(255, 255, 102));
        btnVer2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVer2.setText("<");
        btnVer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer2ActionPerformed(evt);
            }
        });

        cbSeries.setBackground(new java.awt.Color(204, 0, 255));
        cbSeries.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbSeries.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una Serie....", "The Big Bang Theory", "Breaking Bad", "13 Reasons Why" }));
        cbSeries.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSeriesItemStateChanged(evt);
            }
        });
        cbSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeriesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Series");

        cbCategoria.setBackground(new java.awt.Color(204, 0, 255));
        cbCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una Categoria...", "Accion", "Terror", "Comedia", "Infantil", "Romance" }));
        cbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoriaItemStateChanged(evt);
            }
        });
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCategoria, 0, 222, Short.MAX_VALUE)
                    .addComponent(cbSeries, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnVer2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVer)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVer2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer2ActionPerformed
    Catalogo ing = new Catalogo();
    ing.setVisible(true);
    this.dispose(); 
    }//GEN-LAST:event_btnVer2ActionPerformed

    private void cbSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeriesActionPerformed

        
    }//GEN-LAST:event_cbSeriesActionPerformed

    private void cbSeriesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSeriesItemStateChanged
    int posicion;
    posicion = cbSeries.getSelectedIndex();
    
    switch(posicion){
        case 1:
            this.pintarImagen(this.Picture,"build/classes/imagenes/TBBT.jpg");
            break;
        case 2:
            this.pintarImagen(this.Picture, "build/classes/imagenes/BB.jpg");
            break;
        case 3:
            this.pintarImagen(this.Picture, "build/classes/imagenes/13RW.jpg");
            break;
    }
            
    }//GEN-LAST:event_cbSeriesItemStateChanged

    private void cbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoriaItemStateChanged
        
    }//GEN-LAST:event_cbCategoriaItemStateChanged

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerActionPerformed

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
            java.util.logging.Logger.getLogger(Series.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Series.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Series.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Series.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Series().setVisible(true);
            }
        });
       
    }   
    private void pintarImagen(JLabel Picture,String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        Picture.getWidth(), 
                        Picture.getHeight(), 
                        Image.SCALE_DEFAULT
                )
        );
        Picture.setIcon(icono);
        this.repaint();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Picture;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVer1;
    private javax.swing.JButton btnVer2;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbSeries;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo(JComboBox c){
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        c.setModel(combo);
        list_generos lc = new list_generos();
        
    }
    
}
