
package Interfaces;

import Items.Furniture;

/**
 *
 * @author tomwi
 */
public interface NewItemInterface {
    
    void addNewItemToBasket(Furniture furn);
    void editSingleItem(Furniture furn);
    int MAX_BASKET = 9;
    
}
