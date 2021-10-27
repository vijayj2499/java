import java.util.Scanner;
 
public class Main
{
	public static void main(String[] args) 
	{
	    int temp;
	Scanner sc=new Scanner(System.in);
    System.out.println("enter A:");
	int a=sc.nextInt();
    System.out.println("enter B:");
	
	int b=sc.nextInt();
	temp=b;
	b=a;
	a=temp;
    System.out.println("A:"+a);
    System.out.println("B:"+b);
	
}
}
