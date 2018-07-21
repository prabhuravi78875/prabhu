import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int mul=1;
	for(int i=0;i<b;i++)
	{
		mul=mul*a;
	}
	System.out.println(mul);
	in.close();
}
}
