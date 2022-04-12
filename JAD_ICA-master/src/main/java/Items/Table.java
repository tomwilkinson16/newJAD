package Items;

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author tomwi
 */
public class Table extends Furniture{
    private BaseType base;
    double diameter;
   
    
    public Table(double diameter, WoodType wood, BaseType base, 
            int quantity, int idNumber){
        super(wood, quantity, idNumber);
        this.diameter = diameter;
        this.base = base;
        this.image = new ImageIcon(new ImageIcon("resources/table1.png")
            .getImage()
            .getScaledInstance(150,150, java.awt.Image.SCALE_SMOOTH));
        

        }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    
    public BaseType getBase() {
        return base;
    }

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
    
    @Override
    public double calculatePrice(){
        
        double tempPrice,price;
        tempPrice = (this.diameter * this.diameter)* this.wood.getPrice()
                + this.base.getPrice();
        
        price = tempPrice * quantity;
        
        
        return price;
    }
    

}
