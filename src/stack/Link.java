package stack;

/**
 * 用数组实现的Stack
 * 初始时:top = -1
 * push:++top
 * pop:top--
 * @author ShineWong
 * 
 */

public class Link {
	public int iData;
	public Link next;
	public Link(int iData){
		this.iData=iData;
	}
	public void disPlayLink(){
		System.out.println(iData+"");
	}
}
