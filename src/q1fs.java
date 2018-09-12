import java.util.*;
public class q1fs {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//System.out.println(a);
		//System.out.println(b);
		int c,sum=0;
		for(int i=1;i<=5;i++)
		{
			c=a+b;
			a=b;
			b=c;
			sum=sum+c;
			//System.out.println(sum);
			
		}
		System.out.println("the total fib numbers " +sum);
		
	}
}
