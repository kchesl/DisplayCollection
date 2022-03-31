/**
 * 
 */
package project1;
import bag.Bag; 
import bag.BagInterface; 
import CS2114.TextShape;

import java.util.Random; 
import CS2114.Window; 
import CS2114.Button;

import CS2114.WindowSide;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor
//and integrity at all times.
// I will not lie, cheat, or steal, 
//nor will I accept the actions of those who do.
// -- Kirsten Chesley (kchesley888)
/**
*project runner class
*@author Kirsten Chesley (kchesley888)
*@version (2020-Feb-16)
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
