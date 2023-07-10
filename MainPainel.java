package com.mycompany.conversormoedas;

public class MainPainel extends javax.swing.JFrame {

    public MainPainel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoEscolhaOpcao = new javax.swing.JLabel();
        escolhasDeConversao = new javax.swing.JComboBox<>();
        btonEscolher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor");
        setBackground(new java.awt.Color(204, 204, 204));

        textoEscolhaOpcao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoEscolhaOpcao.setText("Escolha uma opção:");

        escolhasDeConversao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conversor de moeda", "Conversor de temperatura" }));

        btonEscolher.setText("Selecionar");
        btonEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonEscolherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(textoEscolhaOpcao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btonEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(escolhasDeConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(textoEscolhaOpcao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escolhasDeConversao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btonEscolher)
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btonEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonEscolherActionPerformed
        if (escolhasDeConversao.getSelectedIndex() == 0) {
            new ConversorMoedaPainel().setVisible(true);
        } 
        if (escolhasDeConversao.getSelectedIndex() == 1){
            new ConversorTemperaturaPainel().setVisible(true);
        }
    }//GEN-LAST:event_btonEscolherActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPainel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainPainel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btonEscolher;
    private javax.swing.JComboBox<String> escolhasDeConversao;
    private javax.swing.JLabel textoEscolhaOpcao;
    // End of variables declaration//GEN-END:variables
}
