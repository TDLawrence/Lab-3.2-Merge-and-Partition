
public class sortHelpers {

	public static int[] merge(int[]list1,int[]list2)
	{int[]merged=new int[list1.length+list2.length];
	  for(int n=0;n<merged.length;n++)
	  {int l=0;
	   int r=0;
	   
	      {if((l<list1.length)&&(r<list2.length)&&(list1[l]<list2[r]))
	    	{merged[n]=list1[l];
	        l++;}
	      }
	      {if((r<list2.length)&&(r<list2.length)&&(list1[l]>list2[r]))
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
}