package prp;
import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int temp=a;
	String s=Integer.toString(a);
	int sum=0,rem=0;
	while(a>0)
	{
		rem=a%10;
		sum=((int)Math.pow(rem,s.length()))+sum;
		a=a/10;
	}
	if(temp==sum){
		System.out.println("yes");
	}
	else{
		System.out.println("No");
	}
	in.close();
}
}
