import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	char x=in.next().charAt(0);
		if((x>=65&&x<=90)||(x>=97&&x<=122))
	{
		if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
		System.out.println("vowel");
		}
		else{
			System.out.println("consonant");
		}
	}
	
	else
	{
		System.out.println("Invalid");
	}
	in.close();
}
}
