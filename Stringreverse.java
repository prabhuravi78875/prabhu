import java.util.*;
public class guvi {
	public static void main(String[] arg)
    {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String a=new StringBuffer(s).reverse().toString();
		System.out.print(a);
		in.close();
    }
}
