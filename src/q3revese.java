import java.util.*;
public class q3revese {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=0,a;
		while(n!=0)
		{
			a=n%10;
			temp=temp*10+a;
			n=n/10;		
		}
		System.out.println(temp);
		
	}

}
