package prp;
import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=0;
	for(int i=1;i<6;i++){
		b=i*a;
		System.out.print(b+"	");
	}
	in.close();
}
}
