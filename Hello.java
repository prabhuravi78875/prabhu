import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	String s="Hello";
	if(a<=0)
	{
		System.out.println("");
	}
	else{
		for(int i=0;i<a;i++)
		{
			System.out.print(s);
		}
	}
	in.close();
}
}
