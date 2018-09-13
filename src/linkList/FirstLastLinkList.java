package linkList;

/**
 * 双端链表,增加对空的判断.
 * @author ShineWong
 *
 */
public class FirstLastLinkList {

	 private Link first;
	 private Link last;
/**
 * 
 * @return
 */
	    public boolean isEmpty() {
	        return (first == null);
	    }
/**
 * 
 * @param data
 */
	    public void insertFirst(int data) {
	        Link Newlink = new Link(data);
	        if(isEmpty())//如果初始链表为空,last -->  Newlink;
	        	last = Newlink;
	        Newlink.next = first;
	        first = Newlink;
	   System.out.println("从链头插入成功"+Newlink);
	    }
/**
 * 
 * @param data
 */
	    public void insertlast(int data) {
	        Link Newlink = new Link(data);
	        if(isEmpty()) {
	            first = Newlink;
	            last = Newlink;
	        } else {
	        	last.next = Newlink;
	            last = Newlink;
	        }
	        System.out.println("从链尾插入成功"+Newlink);
	    }
/**
 * 
 * @return
 */
	    public Link deleteFirst() {
	        Link temp = first;
	        first = first.next;
	        if(isEmpty())
	            last = null;
	        System.out.println("从链头删除成功"+temp.iData);
	        return temp;
	    }
/**
 * 
 */
	    public void displayList() {
	        Link current;
	        current = first;
	        while(current != null) {
	            System.out.println("the Link: " + current.iData);
	            current = current.next;
	        }
	    }
}
