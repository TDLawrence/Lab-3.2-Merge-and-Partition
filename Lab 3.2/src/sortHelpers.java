import java.util.Arrays;

public class sortHelpers {
    public static void main(String[]args)
    {String[]test1= {"cat","dog","hamster","zebra"};
     String[]test2= {"aardvark","cat","horse","pig"};
     int[]test3= {2,1,5,6,9,3,7};
     System.out.println(Arrays.toString(merge(test1,test2)));
     System.out.println(partition(test3));
    	
    }
	
	
	
	public static String[] merge(String[]list1,String[]list2)
	{String[]merged=new String[list1.length+list2.length];
	  int l=0;
	   int r=0;
	  for(int n=0;n<merged.length;n++)
	  {
	   
	      if((l<list1.length)&&(r<list2.length)&&(list1[l].compareTo(list2[r])<0))
	    	{merged[n]=list1[l];
	         l++;}
	      
	      else if((l<list1.length)&&(r<list2.length)&&(list1[l].compareTo(list2[r])>0))
	      {merged[n]=list2[r];  
	       r++;
	      }
		  
	      
	      else if((l<list1.length)&&(r<list2.length)&&(list1[l].compareTo(list2[r])==0))
	      {merged[n]=list2[r]; 
	       merged[n+1]=list1[l];
	       r++;
	       l++;
	       n++;
	      }
		  
	      
	      else if((l>=list1.length)&&(r<list2.length))
		     {merged[n]=list2[r];
			   r++;
		     }
		   
	      else if((r>=list2.length)&&(l<list1.length))
	       {merged[n]=list1[l];
	       l++;}
	       
		  
	  }
	  return merged;
	}
	

	public static int partition(int[]list1)
	{
	 
	 int x=0;
     int y=list1.length-1;
	 while(x!=y)
	     { int j=0;
		   int z=0;
	       int n=1;
	       if (list1[n]<list1[0])
	       {j=list1[n];
	        list1[n]=list1[x];
	        list1[x]=j;
	       x++;
	       n++;}
	       
	       if (list1[n]>list1[0])
		  {j=list1[n];
		   list1[n]=list1[y];
		   list1[y]=j;
		   y--;
		   n++;}
	       if(list1[n]==list1[0])
	      {z++;
	       list1[n]=list1[z];	   
	       n++;
	      }
		 
	     }
	 return x;
	 }
	
}

