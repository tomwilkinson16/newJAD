package GUI;

/**
 *
 * @author tomwi
 */
public class SummaryPanel extends javax.swing.JPanel {
    
    
    /**
     * Creates new form SummaryPanel, it currently is unused and is in place
     * if I wanted to display the summary of the full order to the GUI.
     * @param summary
     */
    public SummaryPanel(String summary) {
        initComponents();
        summary = "<html>" + summary + "</html>";
        summary = summary.replaceAll("\n", "<br>");
        summaryDisplayLabel.setText(summary);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        summaryDisplayLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(57, 124, 213));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setPreferredSize(new java.awt.Dimension(450, 475));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Summary");

        summaryDisplayLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        summaryDisplayLabel.setText("Please check the console");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(summaryDisplayLabel))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(summaryDisplayLabel)
                .addContainerGap(346, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel summaryDisplayLabel;
    // End of variables declaration//GEN-END:variables

}
