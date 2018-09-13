package sequeue;

import java.util.Scanner;

/**
 * 测试数组实现的顺序表
 * @author ShineWong
 *
 */
public class Main {
	/**
	 * 主函数测试以上数据
	 * 使用Main进行测试
	 */
	public static void main(String[] args)
	{
		int i;
	  SLType sl=new SLType();
		Data pdata;
		String key;
		System.out.println("顺序表操作演示！");
		sl.SLInit(sl);//初始化一张空表
		System.out.println("初始化顺序表完成！\n");
	Scanner input=new Scanner(System.in);
	do
	{
			System.out.println("请添加节点（学号，姓名，年龄）:");
			Data data=new Data();
			data.key=input.next();
			data.name=input.next();
			data.age=input.nextInt();
		if(data.age!=0)
		{
			if(sl.SLAdd(sl,data)==0)
			{
				break;
			}
		}
		else
		{
			break;
		}
	}while(true);
		sl.SLAll(sl);
		
		System.out.print("要取出节点的序号： ");
		i=input.nextInt();
		pdata=sl.SLFindByNum(sl,i);
		if(pdata!=null)
		{
			System.out.print(pdata.key+" "+pdata.name+" "+pdata.age);
		}
		else
		{
			System.out.print("节点不存在");

		}
		
		System.out.print("\n 要查找节点的关键字： ");
		key=input.next();
		i=sl.SLFindByCont(sl, key);
		pdata=sl.SLFindByNum(sl, i);
		if(pdata!=null)
		{
			System.out.println(pdata.key+" "+pdata.name+" "+pdata.age);
		}
		else
		{
			System.out.println("节点不存在");

		}
		System.out.print("\n 要删除的节点的序号： ");
		i=input.nextInt();
		sl.SLDelete(sl, i);
		System.out.print("剩下节点为： ");
		sl.SLAll(sl);
		System.out.println("目前顺序表的长度为"+sl.ListLen+"查入节点时，指定序号不能超过"+sl.ListLen);
		System.out.println("输入指定序号插入一个节点： ");
		System.out.println("输入指定序号： ");
		i=input.nextInt();
		System.out.println("输入节点数据： ");
		Data data=new Data();
		data.key=input.next();
		data.name=input.next();
		data.age=input.nextInt();
		sl.SLInsert(sl, i, data);
		System.out.println("更新节点为： ");
		sl.SLAll(sl);
		System.out.println("追加一个节点： ");
		Data data1=new Data();
		data1.key=input.next();
		data1.name=input.next();
		data1.age=input.nextInt();
		sl.SLAdd(sl, data1);
		System.out.println("更新节点为： ");
		sl.SLAll(sl);
		System.out.println("根据关键字查询节点的序号： ，请输入节点关键字");
	
		String key1=input.next();
		int a=sl.SLFindByCont(sl,key1);
		System.out.println("查询到的下标为"+a);
		
		
		 
		
	}
}