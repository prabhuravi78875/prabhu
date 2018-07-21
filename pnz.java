import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int x=in.nextInt();
	if(x>0)
	{
		System.out.println("Positive");
	}
	else if(x==0)
	{
		System.out.println("zero");
	}
	else
	{
		System.out.println("Negative");
	}
	in.close();
}
}
