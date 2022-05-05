package Items;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 * This is the super class for all the object that are created, all data classes
 * will implement furniture and every method in this class is implemented for
 * each individual object.
 *
 * @author tomwi
 */
public abstract class Furniture implements Serializable {

    /**
     * This is an ID number in which all the items created will obtain
     *
     */
    protected int idNumber = 0;

    /**
     * This is an ENUM value and every object created will have a woodType.
     *
     */
    protected WoodType wood;

    /**
     * All items created will need to have a quantity.
     *
     */
    protected int quantity;

    /**
     * This class has access to each image and it creates the image and draws it
     * to the GUI.
     *
     */
    protected ImageIcon image;

    /**
     * This constructor is the super constructor in which all items created will
     * need access to, every object will have a woodType, quantity and idNumber.
     *
     * @param wood
     * @param quantity
     * @param idNumber
     */
    public Furniture(WoodType wood, int quantity, int idNumber) {
        this.wood = wood;
        this.quantity = quantity;
        this.idNumber = idNumber;

    }

    /**
     *
     * @return
     */
    public abstract double calculatePrice();

    /**
     * This is the method to get the idNumber
     *
     * @return idNumber
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * This is the method to set the idNumber
     *
     * @param idNumber
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    /** This is the method to get the woodType.
     *
     * @return wood
     */
    public WoodType getWood() {
        return wood;
    }

    /**This is the method to set the woodType.
     *
     * @param wood
     */
    public void setWood(WoodType wood) {
        this.wood = wood;
    }

    /**This is the method to get the quantity.
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**This is the method to set the quantity.
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**This is the method to get the image.
     *
     * @return image
     */
    public ImageIcon getImage() {
        return image;
    }

    @Override
    public String toString() {
        String summary = "";
        summary += "<html>Product ID Number: " + this.getIdNumber() + "<br/>";
        summary += "Wood Type: " + wood + "<br/>";
        summary += "Sub Total: " + this.calculatePrice() + "<br/>";
        summary += "Quantity: " + quantity + "<br/>" + "</html>";
        return summary;
    }
}
