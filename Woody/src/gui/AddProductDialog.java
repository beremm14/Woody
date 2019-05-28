package gui;

import data.Preset;
import data.Presets;
import data.Product;
import gui.model.PresetListModel;
import gui.model.ProductModel;

/**
 *
 * @author emil
 */
public class AddProductDialog extends javax.swing.JDialog {
    
    private boolean pressedOk = false;
    private Product product = new Product();
    private final ProductModel productModel = new ProductModel(product);
    private final PresetListModel presetListModel = new PresetListModel();

    /**
     * Creates new form AddProductDialog
     */
    public AddProductDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setTitle("Produkt hinzufügen...");
        setLocationRelativeTo(parent);
        
        jTableMaterials.setModel(productModel);
        jListPresets.setModel(presetListModel);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMaterials = new javax.swing.JTable();
        jPanButtons = new javax.swing.JPanel();
        jbutOK = new javax.swing.JButton();
        jbutCancel = new javax.swing.JButton();
        jPanEast = new javax.swing.JPanel();
        jPanControls = new javax.swing.JPanel();
        jLabelPreset = new javax.swing.JLabel();
        jtfValue = new javax.swing.JFormattedTextField();
        jLabelValue = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPresets = new javax.swing.JList<>();
        jbutAdd = new javax.swing.JButton();
        jbutRemove = new javax.swing.JButton();
        jPanControls1 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelHours = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jtfHours = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTableMaterials.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableMaterials);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanButtons.setBackground(new java.awt.Color(255, 255, 255));
        jPanButtons.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanButtons.setLayout(new java.awt.GridLayout());

        jbutOK.setText("OK");
        jPanButtons.add(jbutOK);

        jbutCancel.setText("Abbrechen");
        jPanButtons.add(jbutCancel);

        getContentPane().add(jPanButtons, java.awt.BorderLayout.SOUTH);

        jPanEast.setBackground(new java.awt.Color(255, 255, 255));
        jPanEast.setLayout(new java.awt.GridBagLayout());

        jPanControls.setBackground(new java.awt.Color(255, 255, 255));
        jPanControls.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5), javax.swing.BorderFactory.createTitledBorder("Material")));
        jPanControls.setLayout(new java.awt.GridBagLayout());

        jLabelPreset.setText("Vorlage:");
        jLabelPreset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanControls.add(jLabelPreset, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanControls.add(jtfValue, gridBagConstraints);

        jLabelValue.setText("jLabel1");
        jLabelValue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanControls.add(jLabelValue, gridBagConstraints);

        jScrollPane2.setViewportView(jListPresets);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 2.0;
        jPanControls.add(jScrollPane2, gridBagConstraints);

        jbutAdd.setText("Hinzufügen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanControls.add(jbutAdd, gridBagConstraints);

        jbutRemove.setText("Entfernen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanControls.add(jbutRemove, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanEast.add(jPanControls, gridBagConstraints);

        jPanControls1.setBackground(new java.awt.Color(255, 255, 255));
        jPanControls1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5), javax.swing.BorderFactory.createTitledBorder("Produkt")));
        jPanControls1.setLayout(new java.awt.GridBagLayout());

        jLabelName.setText("Produktname:");
        jPanControls1.add(jLabelName, new java.awt.GridBagConstraints());

        jLabelHours.setText("Arbeitsstunden:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanControls1.add(jLabelHours, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanControls1.add(jtfName, gridBagConstraints);

        jtfHours.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanControls1.add(jtfHours, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanEast.add(jPanControls1, gridBagConstraints);

        getContentPane().add(jPanEast, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AddProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddProductDialog dialog = new AddProductDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelHours;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPreset;
    private javax.swing.JLabel jLabelValue;
    private javax.swing.JList<Preset> jListPresets;
    private javax.swing.JPanel jPanButtons;
    private javax.swing.JPanel jPanControls;
    private javax.swing.JPanel jPanControls1;
    private javax.swing.JPanel jPanEast;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMaterials;
    private javax.swing.JButton jbutAdd;
    private javax.swing.JButton jbutCancel;
    private javax.swing.JButton jbutOK;
    private javax.swing.JButton jbutRemove;
    private javax.swing.JFormattedTextField jtfHours;
    private javax.swing.JTextField jtfName;
    private javax.swing.JFormattedTextField jtfValue;
    // End of variables declaration//GEN-END:variables
}
