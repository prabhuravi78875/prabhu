import java.util.*;
public class guvi {
	public static void main(String[] arg)
    {
		 Scanner in=new Scanner(System.in);
		 System.out.println("No of terms:");
		 int n= in.nextInt();
		 System.out.println("First term:");
		 int a=in.nextInt();
		 System.out.println("Common Difference:");	
		 int d= in.nextInt();
		 int sum=0;
		 sum = n* (2 * a+ (n- 1) * d)/2;
		 System.out.println(sum);
		 in.close();
    }
}
