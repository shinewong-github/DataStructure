package sequeue;

/**
 * 数组实现的顺序表
 * @author ShineWong
 *
 */
	class SLType
	{
		static final int MAXILEN=100;
		Data[] ListData=new Data[MAXILEN];
	   int ListLen;
/**
 * 初始化一张空表
 * @param SL
 */
	   void SLInit(SLType sl)
	    {
		   sl.ListLen=0;
	    }
/**
 * 获取表的长度
 * @param SL
 * @return
 */
	   int SLLength(SLType sl)
	   {
		   return(sl.ListLen);
	   }
/**
 * 按指定的数组下标，插入准备好的元数据
 * @param SL
 * @param n
 * @param data
 * @return
 */
   int SLInsert(SLType sl,int n,Data data)
     {
    	int i;
    	if(sl.ListLen>=MAXILEN)
    	{
    		System.out.println("顺序表已满了，不能接受插入节点操作");
    		return 0;
    	}
    	if(n<0 || n>sl.ListLen-1)
    	{
    		System.out.println("插入的元素节点错误，不能插入元素！");
    		return 0;
    	}
    	for(i=sl.ListLen-1;i>=n;i--)
    	{
    		sl.ListData[i+1]=sl.ListData[i];
    	}
    	  sl.ListData[n]=data;
    	  sl.ListLen++;
       return 1;
     }
 /**
  * 在顺序表的末尾追加节点
  * @param SL
  * @param data
  * @return
  */
	   int SLAdd(SLType sl,Data data)
	   {
		   if(sl.ListLen>=MAXILEN)
		   {
			   System.out.println("顺序表已满，不能再追加节点");
		   }
		   sl.ListData[sl.ListLen++]=data;
		   return 1;
	   }
/**
 * 指定数组下标，删除节点。
 * @param SL
 * @param n
 * @return
 */
	   int SLDelete(SLType sl,int n)
	   {
		   int i;
		   if(n<0 || n>sl.ListLen-1)
		   {
			   System.out.println("删除的节点序好错误，不能删除节点！");
		   }
		   for(i=n;i<sl.ListLen-1;i++)
		   {
			   sl.ListData[i]=sl.ListData[i+1];
		   }
		   sl.ListLen--;
		   return 1;
	   }
/**
 * 指定返回下标节点元素
 * @param SL
 * @param n
 * @return
 */
	  Data SLFindByNum(SLType sl,int n)
	  {
		  if(n<0 || n>sl.ListLen-1)
		  {
			  System.out.println("节点序号有错误，不能返回节点！\n");
		     return null;
		  }
		  return sl.ListData[n];//根据下标返回Data元数据,从1开始
	  }
/**
 * 根据指定的属性来返回数组的下标值
 * @param SL
 * @param key
 * @return
 */
	  int SLFindByCont(SLType sl,String key)
	  {
		  int i;
		  for(i=0;i<=sl.ListLen-1;i++)
		  {
			  if(sl.ListData[i].key.compareTo(key)==0)
			  {
				  return i;
			  }
		  }
		  return 0;
	  }
	  
	  int SLAll(SLType sl)
	  {
		  int i;
		  for(i=0;i<=sl.ListLen-1;i++)
		  {
			  System.out.println("节点为："+sl.ListData[i].key+" "+sl.ListData[i].name+" "+sl.ListData[i].age);
		  } 
		  return 0;
	  }
 }
	
