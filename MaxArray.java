import java.util.*;
public class guvi {
	public static void main(String[] arg)
    {
			int n, max;
	        Scanner in=new Scanner(System.in);
	        //System.out.print("Enter number of elements in the array:");
	        n = in.nextInt();
	        int a[]=new int[n];
	        //System.out.println("Enter elements of array:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i]=in.nextInt();
	         }
	        max = a[0];
	        for(int i=0;i<n;i++)
	        {
	            if(max<a[i])
	            {
	                max=a[i];
	            }
	        }
	        System.out.println("Maximum value:"+max);
		 in.close();
    }
}
