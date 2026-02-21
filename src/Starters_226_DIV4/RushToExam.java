package Starters_226_DIV4;
import java.util.*;
import java.lang.*;
import java.io.*;
public class RushToExam {
    public static void main(String[] args)throws java.lang.Exception {

        // Scanner sc = new Scanner(System.in);
        // int n = 3;
        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // int i = 0;
        // int j = n - 1;

        // int mult = arr[i] * arr[j];
        // if (mult == arr[i + 1]) System.out.println("Yes");
        // else System.out.println("No");

        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M = sc.nextInt();
        int A = sc.nextInt();

        if(N*A>=M) System.out.println("Yes");
        else System.out.println("No");
    }
}
