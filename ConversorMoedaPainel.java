import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ConversorMoedaPainel extends javax.swing.JFrame {

    public ConversorMoedaPainel() {
        initComponents();
    }

    public Double DicionarioTaxasCambio(String tipoConversao) {
        Map<String, Double> taxasCambio = new HashMap<>();
        taxasCambio.put("De Reais a Dólares", 5.00);
        taxasCambio.put("De Reais a Euros", 5.35);
        taxasCambio.put("De Reais a Libras", 6.25);
        taxasCambio.put("De Reais a Yenes", 0.047);
        taxasCambio.put("De Reais a Won Coreanos", 0.0047);
        taxasCambio.put("De Reais a Pesos Argentino", 0.019);
        taxasCambio.put("De Reais a Pesos Chileno", 0.0060);
       
        return taxasCambio.get(tipoConversao);
    }
    
    // Método para formatar o valor como uma string formatada de moeda
    private static String formatarMoeda(double valor) {
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        return formato.format(valor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoInserirValor = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        btonConverter = new javax.swing.JButton();
        btonVoltarMenuPrinc = new javax.swing.JButton();
        textoEscolhaConversao = new javax.swing.JLabel();
        escolhaTipoConversao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversor de moedas");
        setBackground(new java.awt.Color(204, 204, 204));

        textoInserirValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoInserirValor.setText("Insira um valor:");

        inputValor.setToolTipText("tre");

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

        textoEscolhaConversao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoEscolhaConversao.setText("Escolha a moeda a qual você deseja converter:");

        escolhaTipoConversao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes", "De Reais a Won Coreanos", "De Reais a Pesos Argentino", "De Reais a Pesos Chileno" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoInserirValor)
                    .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoEscolhaConversao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(escolhaTipoConversao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 119, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btonVoltarMenuPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(btonConverter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(textoInserirValor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoEscolhaConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escolhaTipoConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btonConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btonVoltarMenuPrinc)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btonVoltarMenuPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonVoltarMenuPrincActionPerformed
        dispose();
    }//GEN-LAST:event_btonVoltarMenuPrincActionPerformed

    private void btonConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonConverterActionPerformed
        String entradaValor = inputValor.getText();
        // Validando se está o input está vazio
        if (entradaValor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um valor!");
        } else {

            // Validação do número
            if (entradaValor.matches("[+]?([1-9]*[.])?[0-9]+")) {
                String cambioMoeda = (String) escolhaTipoConversao.getSelectedItem();
                double valorConversao = DicionarioTaxasCambio(cambioMoeda);
                double entrada = Double.parseDouble(entradaValor);
                double result = entrada / valorConversao;
                String moedaDestino = cambioMoeda.substring(11);
                
                JOptionPane.showMessageDialog(null,"O valor da conversão é "+ formatarMoeda(result)+ " " +moedaDestino);
            } else {
                JOptionPane.showMessageDialog(null, "Valor fora do padrão!\nEx: 100");
            }
        }
    }//GEN-LAST:event_btonConverterActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ConversorMoedaPainel().setVisible(true);
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
