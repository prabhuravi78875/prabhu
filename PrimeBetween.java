package prp;
import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int c;
	for(int i=a+1;i<b;i++)
	{
		c=0;
		for(int j=1;j<=i;j++)
		if(i%j==0)
		{
			c++;
		}
		if(c==2){
			System.out.print(i+"\t");
		}
	}
	in.close();
}
}
