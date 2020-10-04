import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

int [] ele=new int[100];
     int l;
   public Difference(int a[])
   {   l=a.length;
       int i;
       for(i=0;i<l;i++)
       { 
         ele[i]=a[i]; 
         }
    } 
   
  public void computeDifference()
  {   int i,j;int diff=0; 
      for(i=0;i<l-1;i++)
      {
          for(j=0;j<l-1;j++)
          {
              if(ele[j]>ele[j+1])
              {
                  int t=ele[j];
                  ele[j]=ele[j+1];
                  ele[j+1]=t;
              }
          }
      }
     
     //  for(i=0;i<l;i++)
       //{ 
         // System.out.print("\t"+ele[i]+" "); 
         //}
    

        int dif=ele[0]- ele[l-1];     
      maximumDifference=Math.abs(dif);         
     
   
  }

  
} // End of Difference class