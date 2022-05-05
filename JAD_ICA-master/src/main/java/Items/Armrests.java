package Items;

/**This is an ENUM and it is used to get units of wood for the chair item, It is
 * then used to set the price of chair.
 *
 * @author tomwi
 */
public enum Armrests {
    YES(1875), 
    NO (1625);
    
    private final int price;
    
    private Armrests(int price){
        this.price = price;
    }
    
    public int getPrice(){
        return price;
    }
}
