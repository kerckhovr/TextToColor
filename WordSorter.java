
/*
 * Developer : Richard Kerckhove (kerckhovr@sou.edu)
 * Date : 01/21/2013
 * All code (c)2013 Richard Kerckhove All Rights Reserved
 */

import java.io.*;
import java.util.*;

public class WordSorter {
    
    protected static String token = null;
    protected static StringTokenizer tokenizer;
    private static BufferedReader buffer;
    private static String enteredText;
    private static ArrayList<String> textArray; 
    
    public static ArrayList<String> scanText (String text) {
        int numberOfWords = 0;
        tokenizer = new StringTokenizer(text, " ,.?\"!&()", false);
        ArrayList<String> tempArray = new ArrayList<String>();
        
        while(tokenizer.hasMoreTokens()) {
            token = tokenizer.nextToken();
            tempArray.add(token);
            numberOfWords++;

        }
        
        System.out.println(tempArray.get(0));
        
        return tempArray;
    }
    
    public static void colorize (ArrayList<String> list) {
        ArrayList<WordColor> tempColorList = new ArrayList<WordColor>();
        String currentWord = "";
        WordColor tempColor;
        int counter = list.size();
        
        for(int i = 0; i < counter; i++) {
            currentWord = list.get(i);
            tempColor = new WordColor(currentWord);
            tempColorList.add(tempColor);
            System.out.println(tempColorList.get(i).colorSet.toString());

        }
        
    }
    
    public void LogWord() {
        
    }
    
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter the text: ");
        //enteredText = scan.nextLine();
        //textArray = scanText(enteredText);  
        //colorize(textArray);
        TextToColorGUI thing = new TextToColorGUI();
    }
}
