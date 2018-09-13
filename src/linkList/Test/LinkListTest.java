package linkList.Test;

import linkList.Link;
import linkList.LinkList;

import org.junit.Test;

public class LinkListTest {

	@Test
	public void test() {
		LinkList thelist=new LinkList();
		 thelist.insertFirst(1, 1.11);
		 thelist.insertFirst(2, 2.22);
		 thelist.insertFirst(3, 3.33);
		 thelist.insertFirst(4, 4.44);
		 thelist.insertFirst(5, 5.55);
		 thelist.insertFirst(6, 6.66);
		 thelist.insertFirst(7, 7.77);
		 
		 thelist.displayList();
		 thelist.isEmpty();
//		 thelist.deleteFirst();
//		 thelist.delete(4);
//		 thelist.find(4);
		 /*删除所有的节点,直到链表为空.*/
//		 while(!thelist.isEmpty()){
//			 Link aLink=thelist.deleteFirst();
//			 System.out.print("列出被删除的头节点Delete:");
//			 aLink.disPlayList();
//			 System.out.println(" ");
//			 
//		 }
		 thelist.displayList();
	}

}
