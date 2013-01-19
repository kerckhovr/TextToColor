/** Created by Richard Kerckhove
*   ColorValue.java
*   This is an object to hold RGB value.
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
    
    public void addGreen(int value) {
        green += value;
    }
    
    public void addBlue(int value) {
        blue += value;
    }
    
    public String toString () {
        return red + ", " + green + ", " + blue;
    }
}
