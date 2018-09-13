package stack;

/**
 * 用数组实现的Stack Link节点
 * @author ShineWong
 * 
 */
public class StackLink {
	private Link first;
	

	public StackLink() // constructor
	{
		first=null;
	}

/**
 * 
 */
	public boolean isEnpty(){
		return (first==null);
	}
	

}
