package Additional;

import java.util.Scanner;

public class PatternStarExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str1");
        String str1 = sc.nextLine();
        System.out.println("Enter str2");
        String str2 = sc.nextLine();
        
        int result = isSubsequence(str1, str2);
        System.out.println(result);
        
        sc.close();
    }
    
    public static int isSubsequence(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        
        int i = 0; 
        int j = 0; 
        
        while (i < len1 && j < len2) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++; 
            }
            i++; 
        }
        
        
        return (j == len2) ? 1 : 0;
    }
}







