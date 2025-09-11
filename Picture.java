/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square background;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Person larry;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        background = new Square();
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        sun2 = new Circle();
        larry = new Person();
        drawn = false;
    }
    
    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.changeColor("black");
            background.changeSize(500);
            background.moveHorizontal(-310);
            background.moveVertical (-300);
            background.makeVisible();
            
            wall.changeColor("blue");
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("yellow");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
            
            sun2.changeColor("blue");
            sun2.moveHorizontal(50);
            sun2.moveVertical(-40);
            sun2.changeSize(20);
            sun2.makeVisible();
            drawn = true;
            
            larry.changeColor("red");
            larry.changeSize(60,30);
            larry.moveHorizontal(10);
            larry.moveVertical(25);
            larry.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background.changeColor("black");
        wall.changeColor("white");
        window.changeColor("black");
        roof.changeColor("white");
        sun.changeColor("white");
        sun2.changeColor("white");
        larry.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        background.changeColor("black");
        wall.changeColor("blue");
        window.changeColor("yellow");
        roof.changeColor("green");
        sun.changeColor("yellow");
        sun2.changeColor("blue");
        larry.changeColor("red");
    }
}
