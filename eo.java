import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int x=in.nextInt();
	if(x>0){
	if(x%2==0)
	{
		System.out.println("even");
	}
	else
	{
		System.out.println("odd");
	}}
	else
	{
		System.out.println("Invalid");
	}
	in.close();
}
}

