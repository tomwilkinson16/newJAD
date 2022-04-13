package Interfaces;

import Items.Chair;
import Items.Desk;
import Items.Table;


/**
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
