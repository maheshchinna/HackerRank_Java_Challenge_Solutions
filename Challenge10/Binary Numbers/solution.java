import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");/*
        int counter = 0, max =0;
            while (n > 0) {
                int rem = n%2;
                if (rem==1) counter++; 
                else counter=0;
                max = Math.max(counter, max);
                n/=2;
                System.out.println(max);
            }
             */
            int max=0;
            String strBinary = Integer.toString(n, 2);
            // above is binary of given in in string
            String[] strparts = strBinary.split("0");
            //above we get all strings of ones, below find max from them
            for(int i=0;i<strparts.length;i++ )
            {
            if (max < strparts[i].length())
             max = strparts[i].length();
            }System.out.print(max);
        scanner.close();
    }
}
