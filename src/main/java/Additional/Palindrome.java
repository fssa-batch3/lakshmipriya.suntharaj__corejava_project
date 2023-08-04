package Additional;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(" ");

       // StringBuilder str2 = new StringBuilder();
        List<String>  str2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                str2.add(arr[i]);
            }
            str2.add(" ");
        }

        
        
        
        for(String s : str2) {
        	if(!s.equals(" ")) {
        		System.out.print(s + " ");	
        	}
        }
    }
    
    
    

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) == word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}









