package Items;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**This is the data class for a desk and this is implemented when the user creates
 * a new desk and adds it to the basket.
 * 
 *
 * @author tomwi
 */
public class Desk extends Furniture implements Serializable{
    private int drawers;
    private final int deskHeight = 80;
    private double deskWidth;
    private double deskDepth;
    

    /**This constructor contains the enum's which have been created and also
     * holds the data from the super class of furniture, the imageIcon is the
     * GUI image which will be displayed once the desk has been added to the 
     * basket.
     *
     * @param drawers
     * @param deskWidth
     * @param deskDepth
     * @param wood
     * @param quantity
     * @param idNumber
     */
    public Desk(int drawers, double deskWidth, double deskDepth, WoodType wood, int quantity, int idNumber) {
        super(wood, quantity, idNumber);
        this.drawers = drawers;
        this.deskWidth = deskWidth;
        this.deskDepth = deskDepth;
        this.image = new ImageIcon(new ImageIcon("resources/desk1.png")
            .getImage()
            .getScaledInstance(150,150, java.awt.Image.SCALE_SMOOTH));
    }

    /**This method is used to get the amount of drawers via the GUI.
     *
     * @return
     */
    public int getDrawers() {
        return drawers;
    }

    /**This method is used to set the amount of drawers via the GUI.
     *
     * @param drawers
     */
    public void setDrawers(int drawers) {
        this.drawers = drawers;
    }

    /**This method is used to get the desk width via the GUI
     *
     * @return deskWidth
     */
    public double getDeskWidth() {
        return deskWidth;
    }

    /**This method is used to set the desk width via the GUI
     *
     * @param deskWidth
     */
    public void setDeskWidth(double deskWidth) {
        this.deskWidth = deskWidth;
    }

    /**This method is used to get the desk depth via the GUI
     *
     * @return
     */
    public double getDeskDepth() {
        return deskDepth;
    }

    /**This method is used to set the desk depth via the GUI
     *
     * @param deskDepth
     */
    public void setDeskDepth(double deskDepth) {
        this.deskDepth = deskDepth;
    }

    /**This method gets the image depending on the object created.
     *
     * @return image
     */
    @Override
    public ImageIcon getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "\nDesk"
                +"\nID: " + idNumber
                +"\nWood Type: " + wood
                + "\nDrawers: " + drawers 
                + "\nDesk Height: " + deskHeight
                + "\nDesk Width: " + deskWidth 
                + "\nDesk Depth: " + deskDepth
                + "\nQuantity: " + quantity
                + "\nPrice: £" + calculatePrice() +"\n\n";
    }
        
    /**This method is the calculate price method for the desk.
     * 
     *
     * @return price
     */
    @Override
    public double calculatePrice(){

        double tempPrice, price;
        
        tempPrice = (((((deskHeight+deskWidth+deskDepth)*12) 
                + (deskDepth*deskWidth))  
                * this.wood.getPrice())) + (drawers * 8.5);
        price = tempPrice * quantity;
        
        return price;
        
    }
    
}
