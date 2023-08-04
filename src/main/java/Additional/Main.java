package Additional;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<>();
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		while (check) {
			String str = sc.nextLine();
			if (str.equals("###")) {
				check = false;
			} else {
				stringList.add(str);
			}
		}
		Object[] strArr = stringList.toArray();
		System.out.println(strArr[0]);
		for (int i = 1; i < strArr.length; i++) {
			int len = ((String) strArr[i - 1]).length() - 1;
			char l = ((String) strArr[i - 1]).charAt(len);
			char f = ((String) strArr[i]).charAt(0);
			if (f == l) {
				System.out.println(strArr[i]);
			}
		}
	}
}







