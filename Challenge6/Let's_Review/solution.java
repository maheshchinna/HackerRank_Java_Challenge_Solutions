Solution 1:

import java.io.*;
import java.util.*;

public class Solution {
     
    public static void main(String[] args) {
        String even_Chars = "",odd_Chars = "";
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.skip("\n");
        for (int i = 0; i < T; i++) {
            String input_string = sc.nextLine();
            for(int j=0;j<input_string.length();j++){ 
                if(j%2==0)
                    even_Chars=even_Chars+(input_string.charAt(j));
                else 
                    odd_Chars=odd_Chars+(input_string.charAt(j));
            }
            System.out.println(even_Chars+" "+odd_Chars);
            even_Chars = "";odd_Chars = "";
        } sc.close();
    }
}
____________________________________________________________________________________________
Solution 2:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException{
    int T;
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    String input_string,even_Chars = "",odd_Chars = "";
    T=Integer.parseInt(reader.readLine());
    for(int i=1;i<=T;i++){ 
         input_string=reader.readLine();
       	 for(int j=0;j<input_string.length();j++){ 
            if(j%2==0)
                    even_Chars=even_Chars+(input_string.charAt(j));
            else 
                    odd_Chars=odd_Chars+(input_string.charAt(j));
          }
            System.out.println(even_Chars+" "+odd_Chars);
            even_Chars = "";odd_Chars = "";
    	}
    }
}
____________________________________________________________________________________________
Solution 3:

import java.io.*;
import java.util.*;

public class Solution {
    private String input_string,even_Chars = "",odd_Chars = "";
        public void display(String input_string) {
            for(int j=0;j<input_string.length();j++){ 
            if(j%2==0)
                    even_Chars=even_Chars+(input_string.charAt(j));
            else 
                    odd_Chars=odd_Chars+(input_string.charAt(j));
            }
            System.out.println(even_Chars+" "+odd_Chars);
        }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.skip("\n");
        for (int i = 0; i < T; i++) {
            String input_string = sc.nextLine();
            Solution p = new Solution();
            p.display(input_string);
        }
        sc.close();
    }
}
