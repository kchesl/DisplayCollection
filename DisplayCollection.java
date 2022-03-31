
import bag.Bag; 
import bag.BagInterface; 

import java.util.Random; 

*display collection class
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
