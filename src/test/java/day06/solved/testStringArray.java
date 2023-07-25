package day06.solved;

import java.util.Arrays;

public class testStringArray {
	 public static void main(String [] args){
	        String[] cityArr = new String[3];
	        cityArr[0] = "Chennai";
	        cityArr[1] = "Bangalore";
	        cityArr[2] = "Mumbai";
	        cityArr = addElement(cityArr,"delhi");
	        cityArr = addElement(cityArr,"Bombay");
	        System.out.println(Arrays.toString(cityArr)); //[Chennai, Bangalore, Mumbai, delhi, Bombay]
	        cityArr = deleteElement(cityArr,"Chennai"); // [Bangalore, Mumbai, delhi, Bombay]
	        System.out.print(Arrays.toString(cityArr));



	    }
}
