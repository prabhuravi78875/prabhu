package prp;
import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int n,sum=0,d=0;
    for(int i=a; i <= b; i++)
     {
         n=i;
         while(n > 0)
         {
             d=n%10;
             sum=sum+((int)Math.pow(d, Integer.toString(i).length()));
             n=n/10;
         }
         if(sum==i)
         {
             System.out.print(i+" ");
         }
         sum = 0;
     }
	in.close();
}
}
