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
import java.awt.Color;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor
//and integrity at all times.
// I will not lie, cheat, or steal,
//nor will I accept the actions of those who do.
// -- Kirsten Chesley (kchesley888)
/**
*shape window class
*@author Kirsten Chesley (kchesley888)
*@version (2020-Feb-16)
*creates window
*/
public class ShapeWindow {
    private Window window;
    private TextShape textShape;
    private Button quitButton;
    private Button chooseButton;
    private BagInterface<String> itemBag;
    
    /**
     * constructor for the class
     * @param itemBag   item bag
     */
    public ShapeWindow(BagInterface<String> bag) {
        window = new Window();
        window.setTitle("Project 1");
        itemBag = bag;
        quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");
        window.addButton(quitButton, WindowSide.NORTH);
        chooseButton = new Button("Choose");
        chooseButton.onClick(this, "clickedChoose");
        window.addButton(chooseButton, WindowSide.SOUTH);
        textShape = new TextShape(0, 0, "");
        window.addShape(textShape);
        
        
    }
    
    /**
     * click the quit button cause quit
     * @param button button
     */
    public void clickedQuit(Button button) {
        System.exit(0);
    }
    
    /**
     * chooses when button is clicked
     * @param button button
     */
    public void clickedChoose(Button button) {
        if (itemBag.getCurrentSize() > 0) {
            textShape.setText(itemBag.remove()); 
        }
        else {
            textShape.setText("No more items");
        }
        this.colorText();
        this.centerText();
            
    }
    
    /**
     * colors the text
     */
    public void colorText() {
        if (textShape.getText().contains("blue")) {
            textShape.setForegroundColor(Color.BLUE);
        }
        else if (textShape.getText().contains("red")) {
            textShape.setForegroundColor(Color.RED);
        }
        else {
            textShape.setForegroundColor(Color.BLACK);
        }
    }
    
    /**
     * centers the text
     */
    public void centerText() {
        int x = window.getGraphPanelWidth() / 2;
        int y = window.getGraphPanelHeight() / 2;
        int textx = textShape.getWidth() / 2;
        int texty = textShape.getHeight() / 2;
        textShape.moveTo(x - textx,  y - texty);
    }
}
