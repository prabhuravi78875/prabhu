import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int r,sum=0,temp;
	temp=a;
	while(a>0)
	{
		r=a%10;
		sum=(sum*10)+r;
		a=a/10;
	}
	if(temp==sum)
		System.out.println("yes");
	else
		System.out.println("no");

	in.close();
}
}
