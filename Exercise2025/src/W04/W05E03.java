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
        
        System.out.print("Do you want to continue? (yes/no): ");
        String response = sc.next();
        while (! response.equals("yes") && ! (response.equals("no"))){
            System.out.print("Enter yes or no only: ");
            response = sc.next();
        }
    }
}
