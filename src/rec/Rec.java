/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package rec;


/**
 *
 * @author pc
 */

public class Rec {

    static double average(int a[], int n)
    {
         
        // Find sum of array element
        int sum = 0;
         
        for (int i = 0; i < n; i++)
            sum += a[i];
     
        return (double)sum / n;
    }
     
    //driver code
    public static void main (String[] args)
    {
         
        int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
     
        System.out.println(average(arr, n));
    }
}
