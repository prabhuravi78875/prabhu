import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int c=in.nextInt();
	if(a==b)
	{if(a>c)
		System.out.println(a);
	else
		System.out.println(c);
	}
	else if(b==c){
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}
	else{
	if((a>b)&&(a>c))
	{
		System.out.println(a);
	}
	else if((b>a)&&(b>c))
	{
		System.out.println(b);
	}
	else
	{
		System.out.println(c);
	}
	}
	in.close();
}
}
