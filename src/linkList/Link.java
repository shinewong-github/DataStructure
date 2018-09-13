package linkList;

/**
 * 定义一个链表节点
 * @author ShineWong
 *
 */
public class Link {//连表节点
	public int iData;
	public double dData;
	public Link next;
	
	public Link(int id){
		this.iData=id;
	}
	public Link(int id,double dd){
		this.dData=dd;
		this.iData=id;
	}
	
	public void disPlayList(){
		System.out.println("{"+iData+","+dData+"}");
	}
}
