package GUI;

/**
 *
 * @author tomwi
 */
public class TitlePanel extends javax.swing.JPanel {

    /**
     * Creates new form titlePanel
     */
    public TitlePanel() {
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

        titleLabel = new java.awt.Label();

        setBackground(new java.awt.Color(57, 124, 213));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new java.awt.BorderLayout());

        titleLabel.setAlignment(java.awt.Label.CENTER);
        titleLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        titleLabel.setPreferredSize(new java.awt.Dimension(1000, 40));
        titleLabel.setText("Real Office Furniture Company");
        add(titleLabel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label titleLabel;
    // End of variables declaration//GEN-END:variables
}
