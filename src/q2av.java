import java.util.*;
public class q2av {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int temp,l=0,sum=0;
	
	{
		while(n!=0)
		{
			temp=n%10;
			sum=sum+temp;
			n=n/10;
			l++;
		}
		System.out.println(sum/l);
		
	}
}
}
