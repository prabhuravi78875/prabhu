package prp;
import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	for(int i=a+1;i<b;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
	in.close();
}
}
