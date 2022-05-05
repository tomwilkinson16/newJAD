package Interfaces;
/*This interface is used to remove items from the basket whether it is singular
 * or all items in the basket, if one item is removed the basket shuffles and
 * realigns the array.
 *
 * @author tomwi
 */
public interface BasketInterface {
    
    void removeAllItemsFromBasket();
    void removeSingleItem();

}
