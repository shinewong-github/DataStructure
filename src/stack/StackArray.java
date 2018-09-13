package stack;

/**
 * 用链表实现的Stack
 * 初始时:top = -1
 * push:++top
 * pop:top--
 * @author ShineWong
 * 
 */
public class StackArray {
	private int maxSize; // size of StackX array
	private int[] stackArray;
	private int top; // top of stack

	public StackArray(int s) // constructor
	{
		maxSize = s; // set array size
		stackArray = new int[maxSize]; // create array
		top = -1; // no items yet
	}

/**
 * 
 * @param p
 */
	public void push(int p) // put item on top of stack
	{
		stackArray[++top] = p; // increment top, insert item
	}

/**
 * 
 * @return
 */
	public int pop() // take item from top of stack
	{
		return stackArray[top--]; // access item, decrement top
	}

/**
 * 栈顶元素.
 * @return
 */
	public int peek() // peek at top of stack
	{
		return stackArray[top];
	}
}
