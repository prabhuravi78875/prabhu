import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int i,c=0;
	if(a<=1000)
	{
	for(i=1;i<=a;i++)
	{
	if(a%i==0)
	{
		c++;
	}
	
	}
	if(c>=2)
		System.out.println("yes");
	else
		System.out.println("no");
	}
	else
	{
		System.out.println("no");
	}
	in.close();
}
}
