/*
 * Developer : Richard Kerckhove (kerckhovr@sou.edu)
 * Date : 01/21/2013
 * All code (c)2013 Richard Kerckhove All Rights Reserved
 */
public class ColorValue {
    private int red;
    private int green;
    private int blue;
    
    public ColorValue(){
        red = 0;
        green = 0;
        blue = 0;
    }
    
    public void addRed(int value) {
        red += value;
    }
    
    public void subRed(int value) {
        red -= value;
    }
    
    public void addGreen(int value) {
        green += value;
    }
    
    public void subGreen(int value) {
        green -= value;
    }
    
    public void addBlue(int value) {
        blue += value;
    }
    
    public void sunBlue(int value) {
        blue -= value;
    }
    
    public String toString () {
        return red + ", " + green + ", " + blue;
    }
}
