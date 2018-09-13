package linkList;

/**
 *   <strong>基础数据结构之基本链表：</strong>
 * <p>概述:
 *  <pre>
 *    
 *  </pre>
 * <p>算法:
 *  <pre>
 *   1:增删查改
 *   2:
 *  
 *    
 *  </pre>
 *
 *<strong>代码实现的逻辑思路步骤:</strong>
 * <pre>
 * <p>方式一: @{@link #}
 * <p>方式二:@{@link #}
 * </pre>
 
 *<strong>编程技巧获得:</strong>
 *<pre>
 * <code>
 * <p>1:Link newLink=new Link(id,dd);//初始化一个数据节点
			newLink.next=first;//将这个节点赋值给头节点
			first=newLink;//将该节点作为第一个节点，也就是说 对first实例
 * <p>2:遍历链表节点:current=current.next;
 *
 *  </code>
 *  </pre>
 *  
 *
 *  <p>使用场合:
 * @author ShineWong
 *
 */
public class LinkList{//连表运算
	private Link first;//指向为null,没有实例节点指向
	public LinkList(){//初始化为一张空连表
		first=null;
	}
/**
 * 判断链表是否为空
 * @return
 */
	public boolean isEmpty(){
		return(first==null);
	}
/**
 * 在头节点处插入新的节点
 * 当连表中没有数据时，则指向为空，当有节点时，则指向的是第一个节点，first本生指的是第一个节点
 * @param id
 * @param dd
 */
	public void insertFirst(int id,double dd){//插入第一个节点
			Link newLink=new Link(id,dd);//初始化一个数据节点
			newLink.next=first;//将这个节点赋值给头节点
			first=newLink;//将该节点作为第一个节点，也就是说 对first实例
			System.out.println("插入节点成功"+first.toString());
		}
/**
 * 
 * @return
 */
		public Link deleteFirst(){//删除第一个节点，将第一个节点数据付给temp一个临时节点，然后
			Link temp=first;
			first=first.next;//first.next为空
System.out.println("删除当前头节点"+temp);
			return temp;//删除的节点
			
		}
/**
 * 删除指定的关键字	
 * previous.next=current.next;//删除指定的节点
 * @param Key
 * @return
 */
		public Link delete(int Key){
			Link previous=first;//指向当前节点
			Link current=first;//指向下一个节点
			while(current.iData!=Key){
				if(current.next==null)
					return null;
				else{
					previous=current;
					current=current.next;
				}
			}//如果找到指定的节点则跳出循环,current是当前的所需的节点.
			if(current==first)//如果查找的节点是在第一个节点处则删除该节点
				first=first.next;
			else//previous为while循环找到的符合的节点
System.out.println("删除指点的当前节点是:"+current+current.iData);
				previous.next=current.next;//删除指定的节点
			return current;
		}
/**
 * 查找指定节点
 * @param Key
 * @return
 */
	public Link find(int Key){
		Link current=first;
		while(current.iData!=Key){
			if(current.next==null)
				return null;
			else
				current=current.next;
//			return current;
		}
System.out.println("找到的节点为"+current+'\n'+current.iData);
		return current;
	}
/**
 * 遍历节点
 */
	public void displayList(){
		System.out.println("List(first--->last): ");
			Link current=first;
			while(current!=null){
				current.disPlayList();
				current=current.next;//将下一个节点赋值为下一个节点
			}
			System.out.println("");
	}
		
	}