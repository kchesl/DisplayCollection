
import bag.Bag; 
import bag.BagInterface; 
import CS2114.TextShape;

import java.util.Random; 
import CS2114.Window; 
import CS2114.Button;

import CS2114.WindowSide;

/**
*project runner class
*/
public class ProjectRunner {
    
    /**
     * project runner Constructor
     */
    public ProjectRunner() {
        
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        DisplayCollection dc = new DisplayCollection();
        ShapeWindow sw = new ShapeWindow(dc.getItemBag());

    }

}
