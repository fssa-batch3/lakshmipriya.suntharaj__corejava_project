package Additional;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunitTestCaseexamples {

	
JunitTestCaseExample obj = new JunitTestCaseExample();

@Test  
public void testAdd() {  
    obj.add("Emma");  
    obj.add("Ronan");  
    obj.add("Antonio");  
    obj.add("Paul");  
    assertEquals("Adding 4 student to list", 4, obj.sizeOfStudent());  
}  



}