package Items;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;


/**
 *
 * @author tomwi
 */
public abstract class Furniture implements Serializable{
     
    protected int idNumber = 0;
    protected WoodType wood;
    protected int quantity = 0;
    protected ImageIcon image; 

    
    
    
    
    public Furniture(WoodType wood, int quantity, int idNumber) {
        this.wood = wood;
        this.quantity = quantity;
        this.idNumber = idNumber;
        
    }
    
    public abstract double calculatePrice();
    
    public int getIdNumber(){
        return idNumber;
    }
    
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void resetIdNumber(){
        this.idNumber = 0;
    }
        
    public WoodType getWood() {
        return wood;
    }

    public void setWood(WoodType wood) {
        this.wood = wood;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ImageIcon getImage() {
        return image;
    }
    
    
    
    @Override
    public String toString(){
        String summary = "" ;
        summary += "<html>Product ID Number: " + this.getIdNumber() + "<br/>";
        summary += "Wood Type: " + wood + "<br/>";
        summary += "Sub Total: " +  this.calculatePrice() + "<br/>";
        summary += "Quantity: " + quantity +  "<br/>" + "</html>" ;
        return summary;
    }
}


