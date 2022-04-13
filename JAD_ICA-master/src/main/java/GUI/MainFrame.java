package GUI;

import Interfaces.ItemInterface;
import Interfaces.BasketInterface;
import Interfaces.SummaryInterface;
import Items.Chair;
import Items.Desk;
import Items.Table;
/**
 *
 * @author tomwi
 */
public class MainFrame extends javax.swing.JFrame implements ItemInterface, 
        BasketInterface, SummaryInterface{
    
    private static MainFrame instance;
    /**
     * Creates new form RoflFrame
     */
    private MainFrame() {
        initComponents();
        initListeners();
    }

    public static MainFrame getInstance(){
        if (instance ==null){
            return instance = new MainFrame();
        }else{
            return instance;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel1 = new GUI.ButtonPanel();
        titlePanel1 = new GUI.TitlePanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(1, 0), new java.awt.Dimension(1, 0), new java.awt.Dimension(1, 32767));
        jPanel1 = new javax.swing.JPanel();
        interactionPanel = new javax.swing.JPanel();
        basketPanel = new GUI.BasketPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ROFC Ordering System");
        setBackground(new java.awt.Color(57, 124, 213));
        setForeground(new java.awt.Color(57, 124, 213));
        setSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(new java.awt.BorderLayout(5, 5));
        getContentPane().add(buttonPanel1, java.awt.BorderLayout.SOUTH);
        getContentPane().add(titlePanel1, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(filler1, java.awt.BorderLayout.LINE_START);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        interactionPanel.setBackground(new java.awt.Color(57, 124, 213));
        interactionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        interactionPanel.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(interactionPanel);
        jPanel1.add(basketPanel);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initListeners() {
        buttonPanel1.addItemlListener(this);
        basketPanel.addBasketListener(this);
        buttonPanel1.addBasketListener(this.basketPanel);
        buttonPanel1.addItemlListener(this);
        buttonPanel1.addSummaryListener(this.basketPanel);
        basketPanel.addSummaryListener(this);
        buttonPanel1.setSerializeListener(this.basketPanel);
    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            MainFrame.getInstance().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.BasketPanel basketPanel;
    private GUI.ButtonPanel buttonPanel1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel interactionPanel;
    private javax.swing.JPanel jPanel1;
    private GUI.TitlePanel titlePanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void newChairPanel() {
        interactionPanel.removeAll();         
        interactionPanel.add(new ChairPanel(basketPanel));
        interactionPanel.updateUI();
        
    }
    @Override
    public void editChairPanel(Chair chair) {
        interactionPanel.removeAll();         
        interactionPanel.add(new ChairPanel(basketPanel, chair));
        interactionPanel.updateUI();      
    }
    
    @Override
    public void newDeskPanel() {
        interactionPanel.removeAll();         
        interactionPanel.add(new DeskPanel(basketPanel));
        interactionPanel.updateUI();
        
    }
    
    @Override
    public void editDeskPanel(Desk desk) {
        interactionPanel.removeAll();         
        interactionPanel.add(new DeskPanel(basketPanel, desk));
        interactionPanel.updateUI();
    }
    
    @Override
    public void newTablePanel() {
        interactionPanel.removeAll();         
        interactionPanel.add(new TablePanel(basketPanel));
        interactionPanel.updateUI();
    }
    
    @Override
    public void editTablePanel(Table table) {
        interactionPanel.removeAll();         
        interactionPanel.add(new TablePanel(basketPanel, table));
        interactionPanel.updateUI();
    }
    
    @Override
    public void summaryPanel(String summary){
        interactionPanel.removeAll();
        interactionPanel.add(new SummaryPanel(summary));
        interactionPanel.updateUI();
    }


    @Override
    public void removeAllItemsFromBasket() {
        basketPanel.removeAll();
        basketPanel.add(new BasketPanel());
        basketPanel.updateUI();
    }

    @Override
    public void totalPricePanel() {
        interactionPanel.removeAll();
        TotalPricePanel pricePanel = new TotalPricePanel();
        pricePanel.setText("£" + String.valueOf(this.basketPanel.totalPriceOfBasket()));
        interactionPanel.add(pricePanel);
        interactionPanel.updateUI();
    }
    
    @Override
    public void showBasketSummary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeSingleItem() {
        basketPanel.removeAll();
        basketPanel.add(new BasketPanel());
        basketPanel.updateUI();
    }
    
    public void clearInteractionPanel(){
        interactionPanel.removeAll();
        interactionPanel.updateUI();
    }
}
