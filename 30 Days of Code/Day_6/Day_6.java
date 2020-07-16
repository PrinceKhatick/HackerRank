import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<n;i++)
        {
            String even="",odd="";
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            for(int j = 0;j<ch.length;j+=2)
            {
                even = even + ch[j];
            }
            for(int k = 1;k<ch.length;k+=2)
            {
                odd = odd + ch[k];
            }
            System.out.println(even+" "+odd);
        }
    }
}