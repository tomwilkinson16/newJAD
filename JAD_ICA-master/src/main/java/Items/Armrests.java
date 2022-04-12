package Items;

/**
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
