import java.util.*;
public class guvi {
	public static void main(String[] arg)
    {
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		int n1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			n1[i]=in.nextInt();
		}
		Arrays.sort(n1);
		for(int j=0;j<n;j++)
		{
       System.out.print(n1[j]);
	}
		in.close();
    }
}
