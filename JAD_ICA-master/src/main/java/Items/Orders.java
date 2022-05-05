package Items;

import java.io.Serializable;
import java.util.ArrayList;

/**This class is used in the GUI as a basket analyser, it is used to see whats in
 * the basket, what can be removed, adding to basket and getting the price.
 *
 * @author tomwi
 */
public class Orders implements Serializable{
    private final ArrayList<Furniture> products = new ArrayList();

    /**This is a blank constructor for orders.
     *
     */
    public Orders(){
    }
    
    /**This adds the product the array list Furniture.
     *
     * @param p
     */
    public void addProduct(Furniture p){
        this.products.add(p);
    }
    
    /**When an order is added, the string builder is used to append the summary
     * to a toString.
     *
     * @return
     */
    public String summary(){

        StringBuilder summary = new StringBuilder();
        for(Furniture p : this.products){
            summary.append(p.toString());
            
        }
        return summary.toString();
    }
    
    /**This method gets the price for each item in the basket and totals it all.
     *
     * @return price
     */
    public double getTotalPrice(){
        double price = 0;
        for(Furniture p : this.products){
            price = price + p.calculatePrice();
        }
        
        return price;
    }
    
    /**This method removes an item from the array list.
     *
     * @param p
     */
    public void removeItem(int p){
        this.products.remove(p);
    }
    
    /**This method gets an item from an array list.
     *
     * @param index
     * @return products.get(index)
     */
    public Furniture getItem(int index) {
        return products.get(index);
    }
    
    /**This method gets the item index for each item in the array.
     *
     * @param p
     * @return products.indexOf(p)
     */
    public int getItemIndex(Furniture p){
        return products.indexOf(p);
    }            
            
    /**This method gets the array size.
     *
     * @return products.size()
     */
    public int productsSize() {
        return products.size();
        
    }
    
    /**This method removes all items from the basket using the clear command
     * from the java library.
     *
     */
    public void removeAllItems(){
        this.products.clear();
    }
    
}
