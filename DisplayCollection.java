/**
 * 
 */
package project1;
import bag.Bag; 
import bag.BagInterface; 

import java.util.Random; 
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor 
//and integrity at all times.
// I will not lie, cheat, or steal, 
//nor will I accept the actions of those who do.
// -- Kirsten Chesley (kchesley888)
/**
*display collection class
*@author Kirsten Chesley (kchesley888)
*@version (2020-Feb-16)
*/
public class DisplayCollection {
    /**
     * strings for bag
     */
    final public static String[] STRINGS = {"red circle",
        "blue circle", "red square", "blue square"};
    private BagInterface<String> itemBag;
    
    /**
     * constructor for the display collection
     */
    public DisplayCollection() {
        this.itemBag = new Bag<>();
        Random random = new Random(); 
        int count = random.nextInt(11) + 5;
        for (int i = 0; i < count; i++) {
            Random r = new Random();
            int a = r.nextInt(4);
            itemBag.add(DisplayCollection.STRINGS[a]);
            
        }
    }
    
    /**
     * returns the bag
     * @return returns the bag
     */
    public BagInterface<String> getItemBag() {
        return this.itemBag;
    }
    
}
