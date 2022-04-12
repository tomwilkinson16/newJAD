package Items;

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author tomwi
 */
public class Desk extends Furniture{
    private int drawers;
    private final int deskHeight = 80;
    private double deskWidth;
    private double deskDepth;
    

    /**
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

    public int getDrawers() {
        return drawers;
    }

    public void setDrawers(int drawers) {
        this.drawers = drawers;
    }

    public double getDeskWidth() {
        return deskWidth;
    }

    public void setDeskWidth(double deskWidth) {
        this.deskWidth = deskWidth;
    }

    public double getDeskDepth() {
        return deskDepth;
    }

    public void setDeskDepth(double deskDepth) {
        this.deskDepth = deskDepth;
    }

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
                + "\nPrice: " + calculatePrice() +"\n\n";
    }
        
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
