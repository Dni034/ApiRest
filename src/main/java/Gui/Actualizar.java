package Gui;

import com.dania.pm.Registro;
import com.dania.pm.RegistroApiClient;

import javax.swing.*;

public class Actualizar extends javax.swing.JFrame{
    RegistroApiClient cliente = new RegistroApiClient();

    Registro nuevoRegistro = new Registro();

    public Actualizar(){
        initComponents();
        setLocationRelativeTo(null);
        setTitle("ACTUALIZAR REGISTRO");
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        IdActualizar = new javax.swing.JLabel();
        idActualizarCampo = new javax.swing.JTextField();
        nuevoNombre = new javax.swing.JLabel();
        nuevoNCampo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Actualizar registro");

        actualizar.setBackground(new java.awt.Color(255, 153, 153));
        actualizar.setText("Actualizar Registro");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        regresar.setBackground(new java.awt.Color(255, 153, 153));
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        IdActualizar.setText("ID de registro a actualizar:");

        nuevoNombre.setText("Nuevo nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(actualizar)
                                .addGap(58, 58, 58)
                                .addComponent(regresar)
                                .addContainerGap(146, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addComponent(IdActualizar)
                                        .addComponent(idActualizarCampo)
                                        .addComponent(nuevoNombre)
                                        .addComponent(nuevoNCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IdActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(idActualizarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nuevoNombre)
                                .addGap(18, 18, 18)
                                .addComponent(nuevoNCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(actualizar)
                                        .addComponent(regresar))
                                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {
        Main ventana = new Main();
        ventana.setVisible(true);
        this.dispose();
    }

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {
        if(nuevoNombre.getText()!="" && idActualizarCampo.getText()!=""){
            nuevoRegistro.setNombre(nuevoNombre.getText().toString());
            cliente.actualizar(nuevoRegistro, Integer.parseInt(idActualizarCampo.getText()));
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos.");
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar().setVisible(true);
            }
        });
    }


    private javax.swing.JLabel IdActualizar;
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField idActualizarCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nuevoNCampo;
    private javax.swing.JLabel nuevoNombre;
    private javax.swing.JButton regresar;
}
