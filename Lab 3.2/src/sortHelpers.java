
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
	{int[]ordered=new int[list1.length];
	 int index=0;
	for(int n=1;n<list1.length;n++)
	     { int x=0;
	       int y=list1.length;
		   
	       if (list1[n]<list1[0])
	       {list1[n]=ordered[x];
	       x++;}
	       
	       if (list1[n]>list1[0])
		  {list1[n]=ordered[y];
		   y--;}
	     index=x+1;	 
	     }
	 return index;
	 }
	
}

