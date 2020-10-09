/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lifesimulation.util;

import java.util.Scanner;

/**
 *
 * Created by ivanaazuka
 * phone number : 081286862637
 */
public class Helper {

    public static void print(String text)  {
        System.out.println(text);
    }
    
    public static String scanText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
    
}
