/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roman;

import java.util.Scanner;

/**
 *
 * @author SWE
 */
public class second_class {
    public static void main(String[] args) {
        System.out.println("Welcome to java class");
        
//        int a,b,result;
//       Scanner input = new  Scanner (System.in);
//       
//        System.out.print("Enter first number :");
//        a =input.nextInt();
//        
//        System.out.println("Enter second number :");
//        b =input.nextDouble();
//      int i=1;
//        if (a>1 && a<10) {
//            System.out.println("true");
//            while(i<10){
//                System.out.println("X"+i);
//                i++;
//            
//            }
//        }
//        else{
//            System.out.println("false");
//        }
//for (int i = 1; i <a ; i++) {
//            for (int j = 1; j < 10+1; j++) {
//                System.out.println(i+" X "+j+" = "+i*j);
//    }
//            System.out.println(" ");
//        }
        
      int i,n;

    System.out.print("Input number of terms : ");
    Scanner in = new Scanner(System.in);
		    n = in.nextInt();

     for(i=1;i<=n;i++)
     {
     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));    


    }
    
}
}
