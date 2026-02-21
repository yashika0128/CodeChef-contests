package Starters_226_DIV4;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Sub_A_Add_B {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T>0){
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            while(N>=A){
                N= (N-A)+B;
            }
            System.out.println(N);
            T--;
        }

    }
}
