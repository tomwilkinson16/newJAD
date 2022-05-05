package Items;

import javax.swing.ImageIcon;
import java.io.Serializable;

/**This is the data class for the table object, all data that is chosen in the
 * GUI is populated from this class.
 *
 * @author tomwi
 */
public class Table extends Furniture implements Serializable{
    private BaseType base;
    double diameter;
   
    /**This constructor contains the enum's which have been created and also
     * holds the data from the super class of furniture, the imageIcon is the
     * GUI image which will be displayed once the chair has been added to the 
     * basket.
     *
     * @param diameter
     * @param wood
     * @param base
     * @param quantity
     * @param idNumber
     */
    public Table(double diameter, WoodType wood, BaseType base, 
            int quantity, int idNumber){
        super(wood, quantity, idNumber);
        this.diameter = diameter;
        this.base = base;
        this.image = new ImageIcon(new ImageIcon("resources/table1.png")
            .getImage()
            .getScaledInstance(150,150, java.awt.Image.SCALE_SMOOTH));
        

        }

    /**This method gets the diameter of the table.
     *
     * @return diameter
     */
    public double getDiameter() {
        return diameter;
    }

    /**This method sets the diameter of the table.
     *
     * @param diameter
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**This method is implemented through the ENUM and it gets the base.
     *
     * @return base
     */
    public BaseType getBase() {
        return base;
    }

    /**This method is implemented through the ENUM and it sets the base.
     *
     * @param base
     */
    public void setBase(BaseType base){
        this.base = base;
    }

    @Override
    public ImageIcon getImage() {
        return image;
    }
    
    
    @Override
    public String toString(){
        return "\nTable\nID: " + this.getIdNumber() 
                + "\nWood type: "+ wood
                + "\nTable size: "+ diameter
                + "\nBase type: " + base
                + "\nQuantity: " + quantity
                + "\nPrice: £" + calculatePrice() + "\n\n";
    }   
    
    /**This method is the calculate price method for the table.
     *
     * @return
     */
    @Override
    public double calculatePrice(){
        
        double tempPrice,price;
        tempPrice = (this.diameter * this.diameter)* this.wood.getPrice()
                + this.base.getPrice();
        
        price = tempPrice * quantity;
        
        
        return price;
    }
    

}
