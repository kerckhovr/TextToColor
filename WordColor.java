import java.awt.*;

public class WordColor {

    String      theWord;
    int         letters;
    int         occurances;
    ColorValue  colorSet;
    final int   firstValue    = 11;
    final int   secondValue   = 10;
    final int   thirdValue    =  9;
    final int   fourthValue   =  8;
    final int   fifthValue    =  7;
    final int   sixthValue    =  5;
    final int   seventhValue  =  4;
    final int   eighthValue   =  3;
    final int   ninthValue    =  2;
    final int   tenthValue    =  1;
    
    public WordColor () {
        
        colorSet    =  new ColorValue();
        theWord     =  "";
        letters     =  0;        
        occurances  =  0;
        
    }
    
    public WordColor (String text) {
        
        theWord     =  text;
        letters     =  text.length();
        occurances  =  1;
        colorSet    =  getColor(theWord, letters);
        
    }
    
    private ColorValue getColor (String word, int length) {
        ColorValue tempColor = new ColorValue();
        
        for(int i = 0; i < length; i ++) {
            switch(word.charAt(i)) {
                case 'a':
                    tempColor.addRed(firstValue);
                    break;
                case 'b':
                    tempColor.addBlue(seventhValue);
                    break;
                case 'c':
                    tempColor.addGreen(fourthValue);
                    break;
                case 'd':
                    tempColor.addBlue(fourthValue);
                    break;
                case 'e':
                    tempColor.addGreen(firstValue);
                    break;
                case 'f':
                    tempColor.addRed(sixthValue);
                    break;
                case 'g':
                    tempColor.addGreen(sixthValue);
                    break;
                case 'h':
                    tempColor.addRed(thirdValue);
                    break;
                case 'i':
                    tempColor.addBlue(secondValue);
                    break;
                case 'j':
                    tempColor.addGreen(eighthValue);
                    break;
                case 'k':
                    tempColor.addBlue(eighthValue);
                    break;
                case 'l':
                    tempColor.addRed(fourthValue);
                    break;
                case 'm':
                    tempColor.addRed(fifthValue);
                    break;
                case 'n':
                    tempColor.addGreen(secondValue);
                    break;
                case 'o':
                    tempColor.addRed(secondValue);
                    break;
                case 'p':
                    tempColor.addRed(seventhValue);
                    break;
                case 'q':
                    tempColor.addGreen(tenthValue);
                    break;
                case 'r':
                    tempColor.addGreen(thirdValue);
                    break;
                case 's':
                    tempColor.addBlue(thirdValue);
                    break;
                case 't':
                    tempColor.addBlue(firstValue);
                    break;
                case 'u':
                    tempColor.addGreen(fifthValue);
                    break;
                case 'v':
                    tempColor.addGreen(seventhValue);
                    break;
                case 'w':
                    tempColor.addBlue(fifthValue);
                    break;
                case 'x':
                    tempColor.addRed(eighthValue);
                    break;
                case 'y':
                    tempColor.addBlue(sixthValue);
                    break;
                case 'z':
                    tempColor.addRed(tenthValue);
                    break;
                default:
                    break;
                
            }
            
        }
        
        return tempColor;
    }
    
    public String toString () {
        String output = " ";
        return output;
    }
    
    private void checkLetterColor (char letter) {
        
    }
}
