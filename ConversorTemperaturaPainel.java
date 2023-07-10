import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorTemperaturaPainel extends javax.swing.JFrame {

    public ConversorTemperaturaPainel() {
        initComponents();
    }

    public void ConverteParaKelvin(int temperatura, String escolha) {
        int kelvin = temperatura + 273;
        JOptionPane.showMessageDialog(null, "A conversão para ºK são " + kelvin + " " + escolha.substring(28));
    }

    public void ConverteParaFharenheit(double temperatura, String escolha) {
        double fharenheit = (temperatura * 1.8) + 32;
        JOptionPane.showMessageDialog(null, "A conversão para ºF são " + formatarMedida(fharenheit) + " " + escolha.substring(32));
    }

    // Método para formatar o valor de fharenheit
    private static String formatarMedida(double valor) {
        DecimalFormat formato = new DecimalFormat("#,#0.0");
        return formato.format(valor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btonConverter = new javax.swing.JButton();
        btonVoltarMenuPrinc = new javax.swing.JButton();
        textoInserirValor = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        textoEscolhaConversao = new javax.swing.JLabel();
        escolhaTipoConversao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversor de Temperatura");

        btonConverter.setText("Converter");
        btonConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonConverterActionPerformed(evt);
            }
        });

        btonVoltarMenuPrinc.setText("Voltar para o menu principal");
        btonVoltarMenuPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonVoltarMenuPrincActionPerformed(evt);
            }
        });

        textoInserirValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoInserirValor.setText("Digite o número de Celsius que deseja converter na caixa de texto:");

        inputValor.setToolTipText("tre");

        textoEscolhaConversao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoEscolhaConversao.setText("Escolha a unidade de temperatura que deseja converter:");

        escolhaTipoConversao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Celcius (ºC) para Kelvin (ºK)", "De Celcius (ºC) para Fahrenheit (ºF)" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btonVoltarMenuPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btonConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoInserirValor)
                            .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoEscolhaConversao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(escolhaTipoConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(textoInserirValor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoEscolhaConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escolhaTipoConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btonConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btonVoltarMenuPrinc)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btonConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonConverterActionPerformed
        String entradaValor = inputValor.getText();
        // Validando se está o input está vazio
        if (entradaValor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um valor!");
        } else {

            // Validação do número
            if (entradaValor.matches("^[0-9]+$")) {
                String escolhaConversao = (String) escolhaTipoConversao.getSelectedItem();

                if ("De Celcius (ºC) para Kelvin (ºK)".equals(escolhaConversao)) {
                    int temperaturaInt = Integer.parseInt(entradaValor);
                    ConverteParaKelvin(temperaturaInt, escolhaConversao);

                } else {
                    double temperaturaDouble = Double.parseDouble(entradaValor);
                    ConverteParaFharenheit(temperaturaDouble, escolhaConversao);
                }
                //String moedaDestino = cambioMoeda.substring(11);
            } else {
                JOptionPane.showMessageDialog(null, "Valor fora do padrão!\nEx: 10");
            }
        }
    }//GEN-LAST:event_btonConverterActionPerformed

    private void btonVoltarMenuPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonVoltarMenuPrincActionPerformed
        dispose();
    }//GEN-LAST:event_btonVoltarMenuPrincActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperaturaPainel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ConversorTemperaturaPainel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btonConverter;
    private javax.swing.JButton btonVoltarMenuPrinc;
    private javax.swing.JComboBox<String> escolhaTipoConversao;
    private javax.swing.JTextField inputValor;
    private javax.swing.JLabel textoEscolhaConversao;
    private javax.swing.JLabel textoInserirValor;
    // End of variables declaration//GEN-END:variables
}
