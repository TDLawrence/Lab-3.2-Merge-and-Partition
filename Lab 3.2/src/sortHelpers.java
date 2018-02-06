
public class sortHelpers {

	public static String[] merge(String[]list1,String[]list2)
	{String[]merged=new String[list1.length+list2.length];
	  for(int n=0;n<merged.length;n++)
	  {int l=0;
	   int r=0;
	   
	      {if((l<list1.length)&&(r<list2.length)&&(list1[l].compareTo(list2[r])<0))
	    	{merged[n]=list1[l];
	        l++;}
	      }
	      {if((r<list2.length)&&(r<list2.length)&&(list1[l].compareTo(list2[r])>0))
	      {merged[n]=list2[r];  
	       r++;
	      }
		  
	      }
	      {if((r<list2.length)&&(r<list2.length)&&(list1[l].compareTo(list2[r])==0))
	      {merged[n]=list2[r];  
	       r++;
	       l++;
	       n++;
	      }
		  
	      }
	      {if(l>list1.length)
		     {merged[n]=list2[r];
			   
		     }
		   }
	      {if(r>list2.length)
	       {merged[n]=list1[l];
	       }
		  
	  }
	  	
	}
	  return merged;
}
	public static int partition(int[]list1)
	{
	 
	 int x=0;
     int y=list1.length;
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

