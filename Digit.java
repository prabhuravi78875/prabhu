import java.util.*;
public class guvi {
	public static void main(String[] arg)
    {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String s1[]=s.split("[^A-Za-z!@#$%^&*()]");
		if(s1.length==0){
			System.out.println("yes");
		}		
		else{
			System.out.println("no");
		}
		in.close();
    }
}
