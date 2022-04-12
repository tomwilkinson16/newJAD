package Items;

/**
 *
 * @author tomwi
 */
public enum WoodType {
      OAK (0.04), WALNUT (0.03);
    
    private final double price;
    
    private WoodType(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return price;
        
    }
}
