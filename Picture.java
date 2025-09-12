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
    private Square building;
    private Square sky;
    private Square window;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square window5;
    private Circle sun;
    private Circle sun2;
    private Person larry;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        building = new Square();
        sky = new Square();
        window = new Square();
        window2 = new Square();
        window3 = new Square();
        window4 = new Square();
        window5 = new Square();
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
            building.changeColor("black");
            building.changeSize(500);
            building.moveHorizontal(-310);
            building.moveVertical (-300);
            building.makeVisible();
            
            //make sky color dark blue once you get the colors working
            sky.changeColor("blue");
            sky.moveHorizontal(-140);
            sky.moveVertical(-120);
            sky.changeSize(420);
            sky.makeVisible();
            
            window.changeColor("yellow");
            window.moveHorizontal(-280);
            window.moveVertical(-70);
            window.changeSize(30);
            window.makeVisible();
            
            window2.changeColor("yellow");
            window2.moveHorizontal(-200);
            window2.moveVertical(-70);
            window2.changeSize(30);
            window2.makeVisible();
            
            //make window3 dark grey once you get the colors working
            window3.changeColor("yellow");
            window3.moveHorizontal(-280);
            window3.moveVertical(0);
            window3.changeSize(30);
            window3.makeVisible();
            
            window4.changeColor("yellow");
            window4.moveHorizontal(-200);
            window4.moveVertical(0);
            window4.changeSize(30);
            window4.makeVisible();
            
            //make window5 dark grey once you get the colors working
            window5.changeColor("yellow");
            window5.moveHorizontal(-280);
            window5.moveVertical(70);
            window5.changeSize(30);
            window5.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
            
            sun2.changeColor("green");
            sun2.moveHorizontal(50);
            sun2.moveVertical(-40);
            sun2.changeSize(20);
            sun2.makeVisible();
            drawn = true;
            
            larry.changeColor("magenta");
            larry.changeSize(60,30);
            larry.moveHorizontal(-30);
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
        building.changeColor("white");
        sky.changeColor("black");
        window.changeColor("black");
        window2.changeColor("black");
        window3.changeColor("black");
        window4.changeColor("black");
        window5.changeColor("black");
        sun.changeColor("white");
        sun2.changeColor("white");
        larry.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        building.changeColor("black");
        //make sky color dark blue once you get the colors working
        sky.changeColor("blue");
        window.changeColor("yellow");
        window2.changeColor("yellow");
        //make window3 dark grey once you get the colors working
        window3.changeColor("yellow");
        window4.changeColor("yellow");
        //make window5 dark grey once you get the colors working
        window5.changeColor("yellow");
        sun.changeColor("yellow");
        sun2.changeColor("green");
        larry.changeColor("magenta");
    }

    /**
     * adjust foreground colors
     */
    /*public void setForegroundColor(String colorString)
    {
        if (colorString.equals("red")){
            graphic.setColor(new Color(235,25,25));
        }
        else if (colorString.equals("darkblue")){
            graphic.setColor(new Color (18,15,85));
        }
        else if (colorString.equals("darkgrey")){
            graphic.setColor(new Color (99,99,99));
        }
	}*/
    }

