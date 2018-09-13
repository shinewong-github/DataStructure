package linkList.Test;

import linkList.FirstLastLinkList;
import linkList.Link;
import linkList.LinkList;

import org.junit.Test;

public class DoubleEndLinkListTest {

	@Test
	public void test() {
		FirstLastLinkList firstLastLinkList=new FirstLastLinkList();
		firstLastLinkList.insertFirst(1);
		firstLastLinkList.insertFirst(2);
		firstLastLinkList.insertFirst(3);
		firstLastLinkList.insertlast(4);
		firstLastLinkList.deleteFirst();
		firstLastLinkList.displayList();
	}

}
