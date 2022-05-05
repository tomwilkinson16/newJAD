
package Interfaces;

import Items.Furniture;

/**This interface edits each singular item and sets the maximum values of the
 * basket to be 9 items but i can have multiple quantities of this item.
 *
 * @author tomwi
 */
public interface NewItemInterface {
    
    void addNewItemToBasket(Furniture furn);
    void editSingleItem(Furniture furn);
    int MAX_BASKET = 9;
    
}
