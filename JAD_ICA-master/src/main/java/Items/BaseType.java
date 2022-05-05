
package Items;

/**This is an ENUM and it is used for a table to get which baseType that is
 * chosen and the price is set. 
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
