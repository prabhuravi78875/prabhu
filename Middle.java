import java.util.*;
public class guvi {
	public static void main(String[] arg)
    {
		 int n, temp;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = sc.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = sc.nextInt();
	        }
	        for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	       if(n%2!=0)
	            System.out.print(a[n/2]);
	       else
	    	   System.out.println(a[(n/2-1)]);
		 sc.close();
    }
}
