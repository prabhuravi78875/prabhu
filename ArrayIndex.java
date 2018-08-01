import java.util.*;
public class guvi {
	public static void main(String[] arg)
    {
		int a;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		a=in.nextInt();
		int b[]=new int [a];
		System.out.println("Enter all Element : ");
		for(int i = 0 ; i < a ; i++){
			b[i] = in.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+ " "+i);
		}
		in.close();
    }
}
