/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Fact {
    private static int n;

 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int n=5;
       int fact=n;
       for(int i=(n-1);i>1;i--)
       {
           fact=fact*i;
       }
        System.out.println("fact of no is"+fact);
       }
    }

