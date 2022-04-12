
package Interfaces;

import Items.Furniture;

/**
 *
 * @author tomwi
 */
public interface NewItemInterface {
    
    void newItemToBasket(Furniture furn);
    void editItem(Furniture furn);
    int MAX_BASKET = 9;
    
}
