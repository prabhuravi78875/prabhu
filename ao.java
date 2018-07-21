import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	char x=in.next().charAt(0);
	if((x>=65&&x<=90)||(x>=97&&x<=122))
		{
		System.out.println("Alphabet");
		}
	else
		{
		System.out.println("no");
		}
	in.close();
}
}
