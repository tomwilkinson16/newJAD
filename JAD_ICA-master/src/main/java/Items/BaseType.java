
package Items;

/**
 *
 * @author tomwi
 */
public enum BaseType {
    
    WOODEN (45), 
    CHROME (35);
    
    
    private final int price;
    
    private BaseType(int price){
        this.price = price;
    }
    
    public int getPrice(){
        return price;
        
    }
    
}
