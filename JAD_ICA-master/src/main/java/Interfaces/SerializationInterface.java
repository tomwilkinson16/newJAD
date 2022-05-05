package Interfaces;

import java.io.File;

/**This interface is the serializable methods in which I load and save my basket
 * states.
 *
 * @author tomwi
 */
public interface SerializationInterface {
    
    void loadBasket(File file);
    void saveBasket(File file);
    
}
