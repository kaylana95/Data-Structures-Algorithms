/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordpower;

/**
 *
 * @author Anthony
 */
import java.util.Scanner;
public class WordPower {

    /**
     * @param args the command line arguments
     */
    
    static String theWord = "";
    static String userChoice = "";
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("please enter a word");
        theWord = userInput.next();
        
        //then display the menu
        theMenu();
        //then ask the user for choice
        userChoice = userInput.next();
        
        while (!userChoice.equalsIgnoreCase("x") ){
          
        // do a few things
        // making the letters upper case
        if(userChoice.equalsIgnoreCase("1")){
            
            theWord = theWord.toUpperCase();
            System.out.print(theWord);
        
        }else if (userChoice.equalsIgnoreCase("2"))
        {
        theWord = theWord.toLowerCase();
            System.out.print(theWord);
        }else if (userChoice.equalsIgnoreCase("3"))
        {
        String theLetter = "";
        int pos = 0;
        System.out.println("please enter a letter");
        theLetter = userInput.next();
        pos = theWord.indexOf(theLetter);
         System.out.println(theLetter + "is in position " + pos);   
        
        }
        else if (userChoice.equalsIgnoreCase("4"))
        {
            int userPos = 0;
            char letterInPos;
            System.out.println("please enter a position");
            userPos = userInput.nextInt();
            
            letterInPos = theWord.charAt(userPos);
           System.out.println("in position " + userPos + "is "+ letterInPos); 
    
        }
        else if(userChoice.equalsIgnoreCase("5"))
        {
        String anotherWord = "";
         System.out.println("please enter another word");
            anotherWord = userInput.next();
            if (theWord.equalsIgnoreCase(anotherWord))
            {
               System.out.println("Yaaay, they are the same"); 
            }else{
                     System.out.println("Yaaay, they are NOT the same");
                    
                    }
        
        }
        else if (userChoice.equalsIgnoreCase("6")){
        String fileExtension = "";
        //int lastPos = theWord.length() - 1;
        int thirdLast = theWord.length() - 3 ;
        
         //System.out.println(theWord.charAt(lastPos)+"\n "+ theWord.charAt(thirdLast));
        //fileExtension = theWord.substring(thirdLast, lastPos);
        fileExtension = theWord.substring(thirdLast);
        // contains
        //replaceAll
        //replaceFirst
          System.out.println("The extension is "+ fileExtension);
        
        if (fileExtension.equalsIgnoreCase("txt"))
        {
        System.out.println("its a text file ");
        }
        else if (fileExtension.equalsIgnoreCase("png"))
                {
                  System.out.println("its a image file ");  
                }
        else
        {
        // UnKnown
             System.out.println("UnKnown file "); 
        }
        
        }
        else
        {
        // INVALID option
        }
            
        //then display the menu
        theMenu();
        //then ask the user for choice
        userChoice = userInput.next();
        }
        
        
        
        
        
    }
    
    public static void theMenu(){
    
   // String menu = "";
    String menu = "\n" + "press 1 to make all letters upper case" +"\n" +
" press 2 to make all letters lower case" +"\n" +
"press 3 to know the position of a letter" +"\n" +
"press 4 to know the letter in a position" +"\n" +
"press 5 to check if the word is the same as another word" +"\n" +
"press 6 to know if the word is a name of image or document" +"\n"+
"home work" + "\n" +"use  the contains method to check if the word is a true email" + "n\"+" +
            "\n" +"use  the replaceAll method to change a letter in the word" + "n\"+" +
            "\n" +"use  the replaceFirst method to change a letter in the First letter" + "n\"+" +
  
"Press X to exit";
    
    System.out.println(menu);
    
    
    }
    
}
