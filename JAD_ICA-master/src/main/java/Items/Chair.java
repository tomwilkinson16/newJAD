package Items;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**This is the data class for the chair object, all data that is chosen in the
 * GUI is populated from this class.
 *
 * @author tomwi
 */
public class Chair extends Furniture implements Serializable {

    private Armrests arms;

    /**This constructor contains the enum's which have been created and also
     * holds the data from the super class of furniture, the imageIcon is the
     * GUI image which will be displayed once the chair has been added to the 
     * basket.
     *
     * @param arms
     * @param wood
     * @param quantity
     * @param idNumber
     */
    public Chair(Armrests arms, WoodType wood, int quantity, int idNumber) {
        super(wood, quantity, idNumber);
        this.arms = arms;
        this.image = new ImageIcon(new ImageIcon("resources/Chair5.png")
                .getImage()
                .getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
    }

    /**This is the method to get the armrests from the ENUM.
     *
     * @return arms
     */
    public Armrests getArms() {
        return arms;
    }

    /**This is the method to set the armrests from the ENUM.
     *
     * @param arms
     */
    public void setArms(Armrests arms) {
        this.arms = arms;
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
        return "\nChair\nID:" + this.getIdNumber()
                + "\nWood Type: " + wood
                + "\nArmrests: " + arms
                + "\nQuantity: " + quantity
                + "\nPrice: £" + this.calculatePrice() + "\n\n";
    }

    /**This is the calculatePrice method for the chair data class and it gets
     * the prices from the ENUMS and which wood is chosen to generate a price.
     *
     * @return
     */
    @Override
    public double calculatePrice() {

        double tempPrice, price;
        tempPrice = this.wood.getPrice() * this.arms.getPrice();
        price = tempPrice * quantity;
        return price;
    }

}
