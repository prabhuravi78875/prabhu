import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int sum=0;
	while(a!=0)
	{
		a=a/10;
		sum=sum+1;
	}
	System.out.println(sum);
	in.close();
}
}
