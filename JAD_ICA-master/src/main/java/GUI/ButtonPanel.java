package GUI;

import Interfaces.BasketInterface;
import Interfaces.ItemInterface;
import Interfaces.SerializationInterface;
import Interfaces.SummaryInterface;
import javax.swing.JFileChooser;

/**
 * This class is dedicated to the functionality of the GUI; adding chairs,
 * tables desks as well as serializing the data, clearing and totalling the
 * basket, and finally displaying the basket to the console.
 *
 * @author tomwi
 */
public class ButtonPanel extends javax.swing.JPanel {

    /**
     * Creates new form ButtonPanel using the initComponenets method.
     */
    public ButtonPanel() {
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

        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(60, 0), new java.awt.Dimension(60, 0), new java.awt.Dimension(60, 32767));
        addChairButton = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        addTableButton = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        addDeskButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        loadBasketButton = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        saveBasketButton = new javax.swing.JButton();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        clearBasketButton = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        totalPriceButton = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        showSummaryButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(57, 124, 213));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setPreferredSize(new java.awt.Dimension(500, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));
        add(filler9);

        addChairButton.setText("Add Chair");
        addChairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChairButtonActionPerformed(evt);
            }
        });
        add(addChairButton);
        add(filler4);

        addTableButton.setText("Add Table");
        addTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTableButtonActionPerformed(evt);
            }
        });
        add(addTableButton);
        add(filler5);

        addDeskButton.setText("Add Desk");
        addDeskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeskButtonActionPerformed(evt);
            }
        });
        add(addDeskButton);
        add(filler1);

        loadBasketButton.setText("Load Basket");
        loadBasketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBasketButtonActionPerformed(evt);
            }
        });
        add(loadBasketButton);
        add(filler6);

        saveBasketButton.setText("Save Basket");
        saveBasketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBasketButtonActionPerformed(evt);
            }
        });
        add(saveBasketButton);
        add(filler7);

        clearBasketButton.setBackground(new java.awt.Color(255, 0, 0));
        clearBasketButton.setText("Clear Basket");
        clearBasketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBasketButtonActionPerformed(evt);
            }
        });
        add(clearBasketButton);
        add(filler2);

        totalPriceButton.setText("Total Price of Basket");
        totalPriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceButtonActionPerformed(evt);
            }
        });
        add(totalPriceButton);
        add(filler8);

        showSummaryButton.setText("Show Summary");
        showSummaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSummaryButtonActionPerformed(evt);
            }
        });
        add(showSummaryButton);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This constructor is the implementation of the ItemInterface and the
     * listener watches for changes to the state of the object.
     *
     * @param listener
     */
    public void addItemlListener(ItemInterface listener) {
        this.itemListener = listener;
    }

    /**
     * This constructor is the implementation of the BasketInterface and the
     * listener watches for changes to the state of the object.
     *
     * @param listener
     */
    public void addBasketListener(BasketInterface listener) {
        this.basketListener = listener;
    }

    /**
     * This constructor is the implementation of the SummaryInterface and the
     * listener watches for changes to the state of the object.
     *
     * @param listener
     */
    public void addSummaryListener(SummaryInterface listener) {
        this.summaryListener = listener;
    }

    /**
     * This constructor is the implementation of the serializableInterface and
     * the listener watches for changes to the state of the object.
     *
     * @param listener
     */
    public void setSerializeListener(SerializationInterface listener) {
        this.serializeListener = listener;
    }

    /**
     * This method uses the itemListener method from the itemInterface, this
     * listens to chair panel to update the state of the object.
     *
     * @param evt
     */
    private void addChairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChairButtonActionPerformed

        itemListener.newChairPanel();
    }//GEN-LAST:event_addChairButtonActionPerformed

    /**
     * This method uses the itemListener method from the itemInterface, this
     * listens to table panel to update the state of the object.
     *
     * @param evt
     */
    private void addTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTableButtonActionPerformed

        itemListener.newTablePanel();
    }//GEN-LAST:event_addTableButtonActionPerformed

    /**
     * This method uses the itemListener method from the itemInterface, this
     * listens to desk panel to update the state of the object.
     *
     * @param evt
     */
    private void addDeskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeskButtonActionPerformed

        itemListener.newDeskPanel();
    }//GEN-LAST:event_addDeskButtonActionPerformed

    /**
     * This method uses the summary method from the summaryInterface, this
     * listens to all the panels and displays the summary of the objects to
     * console.
     *
     * @param evt
     */
    private void showSummaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSummaryButtonActionPerformed

        summaryListener.showBasketSummary();

    }//GEN-LAST:event_showSummaryButtonActionPerformed

    /**
     * This method uses the removeAllItemsFromBasket from the basketInterface ,
     * this listens to all the panels and removes all objects from the basket
     *
     * @param evt
     */
    private void clearBasketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBasketButtonActionPerformed

        basketListener.removeAllItemsFromBasket();
    }//GEN-LAST:event_clearBasketButtonActionPerformed

    /**
     * This method uses the totalPricePanel and itemListener to access the total
     * price of the basket,once the button is pressed it displays the total
     * price to the GUI.
     *
     * @param evt
     */
    private void totalPriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceButtonActionPerformed

        itemListener.totalPricePanel();
    }//GEN-LAST:event_totalPriceButtonActionPerformed

    /**
     * This method loads the basket, it uses JFileChooser to bring a window up
     * for the user to choose which file they would like to load, if the file is
     * a valid file, the basket will be loaded and the GUI will be updated.
     *
     * @param evt
     */
    private void loadBasketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBasketButtonActionPerformed

        int choice = 0;
        JFileChooser file = new JFileChooser();
        choice = file.showOpenDialog(this);
        if (choice == JFileChooser.APPROVE_OPTION) {
            serializeListener.loadBasket(file.getSelectedFile());
        }
    }//GEN-LAST:event_loadBasketButtonActionPerformed

    /**
     * This method saves the basket, it uses JFileChooser to bring a window up
     * for the user to input a correct file name and file type, if the file is a
     * valid file, the basket will be saved and the GUI will be updated.
     *
     * @param evt
     */
    private void saveBasketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBasketButtonActionPerformed
        int choice = 0;
        JFileChooser file = new JFileChooser();
        choice = file.showSaveDialog(this);
        if (choice == JFileChooser.APPROVE_OPTION) {
            serializeListener.saveBasket(file.getSelectedFile());
        }
    }//GEN-LAST:event_saveBasketButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addChairButton;
    private javax.swing.JButton addDeskButton;
    private javax.swing.JButton addTableButton;
    private javax.swing.JButton clearBasketButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton loadBasketButton;
    private javax.swing.JButton saveBasketButton;
    private javax.swing.JButton showSummaryButton;
    private javax.swing.JButton totalPriceButton;
    // End of variables declaration//GEN-END:variables

    private ItemInterface itemListener;
    private BasketInterface basketListener;
    private SummaryInterface summaryListener;
    private SerializationInterface serializeListener;
}
