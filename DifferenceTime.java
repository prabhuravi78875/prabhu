import java.util.*;
public class guvi {
	public static void main(String[] arg)
    {
		Scanner in=new Scanner(System.in);
		int hh=in.nextInt();
		int mm=in.nextInt();
		int h=in.nextInt();
		int m=in.nextInt();
		System.out.print(Math.abs(hh-h)+" ");
		System.out.print(Math.abs(mm-m));
		in.close();
    }
}
