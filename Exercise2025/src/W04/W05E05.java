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
public class W05E05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("how many numbers will you enter?: ");
        int n = sc.nextInt();
        int countO = 0, countE = 0;
        for (int i=0; i<n; i++){
            System.out.printf("Enter number %d ", i);
            int number = sc.nextInt();
            if (number % 2 == 0){
                countE += 1;
                
            } else {
                countO += 1;
                
            }
        }
        int sum_o_e = countE + countO;
        System.out.printf("Total even numbers: %d", countE);
        System.out.println();
        System.out.printf("Total odd numbers: %d", countO);
        System.out.println();
        System.out.printf("Total sum of odd and even number %d", sum_o_e);
    }
}
