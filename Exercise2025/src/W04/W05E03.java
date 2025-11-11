/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W04;

import java.util.Scanner;

/**
 *
 * @author MelodyCloud
 */
public class W05E03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String response;
        boolean valid = true;
        
        do {
            if (valid){
                System.out.print("Do you want to continue: ");
                
                
            } else{
                System.out.print("enter yes or no only: ");
            }
            response = sc.next();
            
            if (response.equalsIgnoreCase("yes")){
                valid = true;
            } else {
                valid = false;
            }
            
            
            
        } while (!response.equalsIgnoreCase("No"));
    }
}
