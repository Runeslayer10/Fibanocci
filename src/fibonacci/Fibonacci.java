/*
 * Blake Hadaway
 * Oct 30th, 2018
 * to find out a number in the fibonacci number set.
 */

package fibonacci;
import javax.swing.*;
/**
 *
 * @author blhad3491
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        int n = 0;
        
        // initial input screen
        input = JOptionPane.showInputDialog(
                "The first nine Fibonacci numbers are as follows:\n"
                + "1,1,2,3,5,8,13,21,34, ...\n" + 
                "What Fibonacci number would you like to see?");
        
        // parsing 
        n = Integer.parseInt(input);
        
        // displaying answer
        JOptionPane.showMessageDialog(null, "The " + n + "th fibonacci number is " + fNum(n));
        
    }   
    public static int fNum(int n){
    if(n<= 2) {
      return 1;
    }
    else {
      return fNum(n - 1) + fNum(n - 2);
    }
    }
    
}

        
    
    

