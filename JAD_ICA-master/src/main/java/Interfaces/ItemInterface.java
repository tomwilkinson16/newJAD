package Interfaces;

import Items.Chair;
import Items.Desk;
import Items.Table;


/**This interface is one of the main interfaces and it determines whether the
 * GUI is an edit or if it is a new creation of an object.
 *
 * @author tomwi
 */
public interface ItemInterface {
    
    void newChairPanel();
    void editChairPanel(Chair chair);
    void newDeskPanel ();
    void editDeskPanel (Desk desk);
    void newTablePanel();
    void editTablePanel(Table table);
    void totalPricePanel();
    
    
}
