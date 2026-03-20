package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    public Main(){
        initComponents();
        setTitle("INICIO");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        panel1 = new javax.swing.JPanel();
        nuevoRegistroButton = new javax.swing.JButton();
        buscarPorNombreButton  = new javax.swing.JButton();
        actualizarRegistroButton = new javax.swing.JButton();
        consulrarRegistrosButton = new javax.swing.JButton();
        eliminarRegistroButton = new javax.swing.JButton();
        buscarPorIdButton = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel1.setBackground(new java.awt.Color(255, 204, 204));

        label1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        label1.setText("cliente");

        nuevoRegistroButton.setBackground(new java.awt.Color(255, 153, 153));
        nuevoRegistroButton.setText("Nuevo Registro");
        nuevoRegistroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        consulrarRegistrosButton.setBackground(new java.awt.Color(255, 153, 153));
        consulrarRegistrosButton.setText("Consultar registros");
        consulrarRegistrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        actualizarRegistroButton.setBackground(new java.awt.Color(255, 153, 153));
        actualizarRegistroButton.setText("Actualizar registros");
        actualizarRegistroButton.setToolTipText("");
        actualizarRegistroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        eliminarRegistroButton.setBackground(new java.awt.Color(255, 153, 153));
        eliminarRegistroButton.setText("Eliminar registro");
        eliminarRegistroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        buscarPorNombreButton.setBackground(new java.awt.Color(255, 153, 153));
        buscarPorNombreButton.setText("Buscar por nombre");
        buscarPorNombreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNombreActionPerformed(evt);
            }
        });

        buscarPorIdButton.setBackground(new java.awt.Color(255, 153, 153));
        buscarPorIdButton.setText("Buscar por ID");
        buscarPorIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label1)
                                .addGap(187, 187, 187))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nuevoRegistroButton)
                                        .addComponent(buscarPorNombreButton)
                                        .addComponent(actualizarRegistroButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(consulrarRegistrosButton)
                                        .addComponent(eliminarRegistroButton)
                                        .addComponent(buscarPorIdButton))
                                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(label1)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoRegistroButton)
                                        .addComponent(consulrarRegistrosButton))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(actualizarRegistroButton)
                                        .addComponent(eliminarRegistroButton))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buscarPorNombreButton)
                                        .addComponent(buscarPorIdButton))
                                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Consultar consulta = new Consultar();
        consulta.setVisible(true);
        this.dispose();
    }

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {
        Actualizar actualizar = new Actualizar();
        actualizar.setVisible(true);
        this.dispose();
    }

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {
        NuevoRegistro nuevo = new NuevoRegistro();
        nuevo.setVisible(true);
        this.dispose();
    }

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {
        Eliminar eliminar = new Eliminar();
        eliminar.setVisible(true);
        this.dispose();
    }

    private void buscarNombreActionPerformed(java.awt.event.ActionEvent evt) {
        BuscarNombre buscarNom = new BuscarNombre();
        buscarNom.setVisible(true);
        this.dispose();
    }

    private void buscarIDActionPerformed(java.awt.event.ActionEvent evt) {
       BuscarId buscarId = new BuscarId();
       buscarId.setVisible(true);
       this.dispose();
    }

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

    private javax.swing.JPanel panel1;
    private javax.swing.JButton nuevoRegistroButton;
    private javax.swing.JButton buscarPorNombreButton;
    private javax.swing.JButton actualizarRegistroButton;
    private javax.swing.JButton consulrarRegistrosButton;
    private javax.swing.JButton eliminarRegistroButton;
    private javax.swing.JButton buscarPorIdButton;
    private JLabel label1;


}
