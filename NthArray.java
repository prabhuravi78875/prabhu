import java.util.*;
public class guvi {
	public static void main(String[] arg)
    {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[n/2]);
        in.close();
    }
}
