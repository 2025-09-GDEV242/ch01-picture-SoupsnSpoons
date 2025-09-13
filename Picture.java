/**
 * This is an image of a man coming home to his apartment after a long day.
Two windows are lit, the rest are dark, as most people are asleep at this time of night. 
 * A single lamppost outside illuminates the apartment building.
 * 
 * @author  Arielle Bowie
 * @version September 22nd, 2025
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
    private Square window6;
    private Square door;
    private Square door2;
    private Circle light;
    private Circle light2;
    private Triangle lamppost;
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
        window6 = new Square();
        door = new Square();
        door2 = new Square();
        light = new Circle();
        light2 = new Circle();
        lamppost = new Triangle();
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
            sky.changeColor("darkblue");
            sky.moveHorizontal(-140);
            sky.moveVertical(-120);
            sky.changeSize(420);
            sky.makeVisible();
            
            window.changeColor("yellow");
            window.moveHorizontal(-280);
            window.moveVertical(-90);
            window.changeSize(30);
            window.makeVisible();
            
            window2.changeColor("darkgrey");
            window2.moveHorizontal(-200);
            window2.moveVertical(-90);
            window2.changeSize(30);
            window2.makeVisible();
            
            window3.changeColor("darkgrey");
            window3.moveHorizontal(-280);
            window3.moveVertical(-20);
            window3.changeSize(30);
            window3.makeVisible();
            
            window4.changeColor("yellow");
            window4.moveHorizontal(-200);
            window4.moveVertical(-20);
            window4.changeSize(30);
            window4.makeVisible();
            
            window5.changeColor("darkgrey");
            window5.moveHorizontal(-280);
            window5.moveVertical(50);
            window5.changeSize(30);
            window5.makeVisible();
            
            window6.changeColor("darkgrey");
            window6.moveHorizontal(-200);
            window6.moveVertical(50);
            window6.changeSize(30);
            window6.makeVisible();
            
            door.changeColor("white");
            door.moveHorizontal(-240);
            door.moveVertical(110);
            door.changeSize(30);
            door.makeVisible();
            
            door2.changeColor("white");
            door2.moveHorizontal(-240);
            door2.moveVertical(140);
            door2.changeSize(30);
            door2.makeVisible();
    
            light.changeColor("lightyellow");
            light.moveHorizontal(110);
            light.moveVertical(-40);
            light.changeSize(60);
            light.makeVisible();
            drawn = true;
            
            light2.changeColor("yellow");
            light2.moveHorizontal(130);
            light2.moveVertical(-40);
            light2.changeSize(20);
            light2.makeVisible();
            drawn = true;
            
            lamppost.changeColor("red");
            lamppost.moveHorizontal(160);
            lamppost.moveVertical(-95);
            lamppost.changeSize(10,60);
            lamppost.makeVisible();
            
            larry.changeColor("magenta");
            larry.changeSize(60,30);
            larry.moveHorizontal(-30);
            larry.moveVertical(60);
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
        window6.changeColor("black");
        door.changeColor("black");
        door2.changeColor("black");
        light.changeColor("white");
        light2.changeColor("lightgrey");
        lamppost.changeColor("white");
        larry.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        building.changeColor("black");
        sky.changeColor("darkblue");
        window.changeColor("yellow");
        window2.changeColor("darkgrey");
        window3.changeColor("darkgrey");
        window4.changeColor("yellow");
        window5.changeColor("darkgrey");
        window6.changeColor("darkgrey");
        door.changeColor("white");
        door2.changeColor("white");
        light.changeColor("lightyellow");
        light2.changeColor("yellow");
        lamppost.changeColor("red");
        larry.changeColor("magenta");
    }
    }

