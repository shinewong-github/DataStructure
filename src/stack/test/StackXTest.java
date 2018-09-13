package stack.test;

import stack.StackArray;
import org.junit.Test;

public class StackXTest {

	@Test
	public void test() {
		    int theNumber;
		    StackArray theStackX=new StackArray(5); 
		    theStackX.push(1);
		    theStackX.push(10);
		    theStackX.push(20);
		   int temp= theStackX.pop();
		   System.out.println("出栈的元素为:"+temp);
		   int peak=theStackX.peek();
		   System.out.println("栈顶元素为:"+peak);
		
	}

}
