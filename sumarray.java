import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int[] c=new int[a];
	int sum=0;
	for(int i=0;i<a;i++)
	{
		c[i]=in.nextInt();
	}
	for(int j=0;j<b;j++)
	{
		sum=sum+c[j];
	}
	System.out.println(sum);
	in.close();
}
}
