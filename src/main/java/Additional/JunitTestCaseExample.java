package Additional;
import java.util.ArrayList;  
import java.util.List;  
public class JunitTestCaseExample {

	private List<String> students = new ArrayList<String>();  
	  
    public void remove(String name) {  
        students.remove(name);  
    }  
      
    public void add(String name) {  
        students.add(name);  
    }  
      
    public void removeAll(){  
        students.clear();  
    }  
      
    public int sizeOfStudent() {  
        return students.size();  
    }  
      


public static void main(String[]args) {
	
	JunitTestCaseExample t = new JunitTestCaseExample();
	
	t.add("vinit");
	t.add("Gowtham");
	t.add("MUTHUUUUU");
	System.out.println(t.students);
}
}
