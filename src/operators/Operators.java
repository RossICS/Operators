/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operators;

/**
 *
 * @author rkaune
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum1 = 10 + 20;      // adding two constant values
        int sum2 = sum1 + 33;    // adding a variable and a constant
        int sum3 = sum2 + sum2;  // adding two variables
        int result = 10;
        result += 20;
        int result2 = 200;
        result2 -= 10;
        int result3 = 10;
        result3 *= 20;
        int result4 = 100;
        result4 /= 5;
        int result5 = 100;
        result5 %= 9;
        int result6 = 100 * 100 / 5 + 200 * 3 / 2; // order of operations
        int result7 = 100 / 8; // Integer Division
        double result8 = 100 / 8; // Real Division
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        }
    
}
