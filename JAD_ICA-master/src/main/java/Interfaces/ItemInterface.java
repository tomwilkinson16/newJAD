package Interfaces;

import Items.Chair;
import Items.Desk;
import Items.Table;


/**
 *
 * @author tomwi
 */
public interface ItemInterface {
    
    void chairPanel();
    void chairPanel(Chair chair);
    void deskPanel ();
    void deskPanel (Desk desk);
    void tablePanel();
    void tablePanel(Table table);
    void totalPricePanel();
    
    
}
