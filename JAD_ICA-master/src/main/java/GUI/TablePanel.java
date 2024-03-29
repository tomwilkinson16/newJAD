package GUI;

import Items.BaseType;
import Items.Table;
import Items.WoodType;
import Interfaces.NewItemInterface;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**This class is the implementation of the data which is stored in the Items
 * package, it has two constructors which decide what state the object is in
 * (new object or an edit).
 * 
 * @author tomwi
 */
public class TablePanel extends javax.swing.JPanel {

    private final NewItemInterface newItemInterface;
    private Table table;

    /**This first constructor is the creation of a new table through the 
     * newItemInterface, with the initComponents this is used to visually see
     * in my GUI.
     * 
     *
     * @param newItemInterface
     */
    public TablePanel(NewItemInterface newItemInterface) {
        initComponents();
        this.newItemInterface = newItemInterface;
    }

    /**The second constructor is dedicated to editing a table and it uses the
     * same parameters but chances the instance of the table through singletons.
     *
     * @param newItemInterface
     * @param table
     */
    public TablePanel(NewItemInterface newItemInterface, Table table) {
        this(newItemInterface);
        this.table = table;
        this.tableTitle.setText("Editting a Table");
        this.addToBasketButton.setText("Save Changes");
    }

    /**The below method is used when the user adds an item to the basket, and
     * depending if the table hasn't been created before, the table will either
     * be an edit or a new creation with the use of null pointers.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableTitle = new javax.swing.JLabel();
        woodTypeLabel = new javax.swing.JLabel();
        baseTypeLabel = new javax.swing.JLabel();
        diameterLabel = new javax.swing.JLabel();
        diamaterTextField = new javax.swing.JTextField();
        IdNumberLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        addToBasketButton = new javax.swing.JButton();
        quantityTextField = new javax.swing.JTextField();
        woodTypeComboBox = new javax.swing.JComboBox();
        baseTypeComboBox = new javax.swing.JComboBox();
        idFormattedTextField = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(57, 124, 213));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setPreferredSize(new java.awt.Dimension(450, 475));

        tableTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tableTitle.setText("Add a Table");

        woodTypeLabel.setText("Choose Wood Type");

        baseTypeLabel.setText("Choose Base Type");

        diameterLabel.setText("Choose a Table Size(50cm minimum)");

        diamaterTextField.setText("50");

        IdNumberLabel.setText("ID Number");

        quantityLabel.setText("Choose Quantity");

        addToBasketButton.setText("Add To Basket");
        addToBasketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBasketButtonActionPerformed(evt);
            }
        });

        quantityTextField.setText("1");

        woodTypeComboBox.setModel(new DefaultComboBoxModel<>(WoodType.values()));

        baseTypeComboBox.setModel(new DefaultComboBoxModel<>(BaseType.values()));

        idFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        idFormattedTextField.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(addToBasketButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tableTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(woodTypeLabel)
                                    .addGap(129, 129, 129))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(baseTypeLabel)
                                    .addGap(133, 133, 133)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(woodTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(baseTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idFormattedTextField)
                            .addComponent(IdNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantityTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(diamaterTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diameterLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tableTitle)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(woodTypeLabel)
                    .addComponent(IdNumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(woodTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baseTypeLabel)
                    .addComponent(quantityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baseTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(diameterLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diamaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(addToBasketButton)
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addToBasketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBasketButtonActionPerformed

        double diameter;
        int quantity = 1;
        int idNumber = 0;

        try {
            Table newTable = null;
            
           
            if (this.diamaterTextField != null && Double.parseDouble(this.diamaterTextField.getText()) >= 50) {
                diameter = Double.parseDouble(this.diamaterTextField.getText());
            }else {
                JOptionPane.showMessageDialog(this, "Invalid size, must be above 50cm",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                
                return;
            }
            if (this.quantityTextField != null) {
                quantity = Integer.parseInt(this.quantityTextField.getText());
            }
            if (this.idFormattedTextField != null) {
                if (Integer.valueOf(idFormattedTextField.getText()) > 0) {
                    idNumber = Integer.valueOf(idFormattedTextField.getText());
                    newTable = new Table(diameter, 
                            (WoodType)woodTypeComboBox.getSelectedItem(), 
                            (BaseType)baseTypeComboBox.getSelectedItem(), 
                            quantity, 
                            idNumber);
                }
                while (Integer.valueOf(idFormattedTextField.getText()) < 0) {
                    idFormattedTextField.setText(null);
                }
                
                if (table == null) {
                    this.newItemInterface.addNewItemToBasket(newTable);
                } else {
                    table.setBase((BaseType)baseTypeComboBox.getSelectedItem());
                    table.setDiameter(diameter);
                    table.setIdNumber(idNumber);
                    table.setQuantity(quantity);
                    table.setWood((WoodType)woodTypeComboBox.getSelectedItem());
                    this.newItemInterface.editSingleItem(table);
                    JOptionPane.showMessageDialog(this, "Basket updated",
                            "Edit Complete",
                            JOptionPane.WARNING_MESSAGE);
                    MainFrame.getInstance().clearInteractionPanel();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "This is an invalid character",
                    "WARNING",
                    JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_addToBasketButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdNumberLabel;
    private javax.swing.JButton addToBasketButton;
    private javax.swing.JComboBox baseTypeComboBox;
    private javax.swing.JLabel baseTypeLabel;
    private javax.swing.JTextField diamaterTextField;
    private javax.swing.JLabel diameterLabel;
    private javax.swing.JFormattedTextField idFormattedTextField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JLabel tableTitle;
    private javax.swing.JComboBox woodTypeComboBox;
    private javax.swing.JLabel woodTypeLabel;
    // End of variables declaration//GEN-END:variables
}
