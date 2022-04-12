package Items;

import javax.swing.ImageIcon;

/**
 *
 * @author tomwi
 */
public class Chair extends Furniture{
    
    private Armrests arms;
    
    public Chair (Armrests arms, WoodType wood, int quantity, int idNumber){
        super (wood, quantity, idNumber);
        this.arms = arms;
        this.image = new ImageIcon(new ImageIcon("resources/Chair5.png")
            .getImage()
            .getScaledInstance(150,150, java.awt.Image.SCALE_SMOOTH));
    }

    public Armrests getArms() {
        return arms;
    }
    
    public void setArms(Armrests arms) {
        this.arms = arms;
    }


    @Override
    public ImageIcon getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "\nChair\nID:" + this.getIdNumber() 
                + "\nArmrests: " + arms 
                + "\nWood Type: " + wood
                + "\nSub Price: " + this.calculatePrice() 
                + "\nQuantity: " + quantity + "\n\n";
    }
    

    @Override
    public double calculatePrice(){
        
        double tempPrice, price;
         tempPrice = this.wood.getPrice() * this.arms.getPrice();
         price = tempPrice * quantity;
        return price;
    }
    
    
    
    
}



    