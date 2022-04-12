package Items;

import java.util.ArrayList;

/**
 *
 * @author tomwi
 */
public class Orders {
    private final ArrayList<Furniture> products = new ArrayList();

    
    public Orders(){
    }
    
    public void addProduct(Furniture p){
        this.products.add(p);
    }
    
    public String summary(){

        StringBuilder summary = new StringBuilder();
        for(Furniture p : this.products){
            summary.append(p.toString());
            
        }
        return summary.toString();
    }
    
    public double getTotalPrice(){
        double price = 0;
        for(Furniture p : this.products){
            price = price + p.calculatePrice();
        }
        
        return price;
    }
    
    public void removeItem(int p){
        this.products.remove(p);
    }
    
    public Furniture getItem(int index) {
        return products.get(index);
    }
    
    public int getItemIndex(Furniture p){
        return products.indexOf(p);
    }            
            
    public int productsSize() {
        return products.size();
        
    }
    
    public void removeAllItems(){
        this.products.clear();
    }
    
}
