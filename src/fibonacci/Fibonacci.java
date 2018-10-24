/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

        input = JOptionPane.showInputDialog(
                "The first nine Fibonacci numbers are as follows:\n"
                + "1,1,2,3,5,8,13,21,34, ...\n" + 
                "What Fibonacci number would you like to see?");
        
        n = Integer.parseInt(input);
        
        if (n == 1){
            JOptionPane.showMessageDialog(null, "The " + n + "st number in the fibonacci"
                    + " number set is 1");
        }else if (n == 2){
            JOptionPane.showMessageDialog(null, "The " + n + "nd number in the fibonacci"
                    + " number set is 1");
        }else if (n == 3){
            JOptionPane.showMessageDialog(null, "The " + n + "rd number in the fibonacci"
                    + " number set is 2");
        }else if(n == 0){
            JOptionPane.showMessageDialog(null, "There is no fibonacci number for the place 0");
        }else{
                
        }
    }
    
}
