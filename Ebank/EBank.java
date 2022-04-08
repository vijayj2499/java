import java.util.Scanner;

public class EBank {

	public String display() {
		return "EBank [acc_no=" + acc_no + ", name=" + name + ", email=" + email + ", phone=" + phone + ", balance="
				+ balance + "]";
	}
	
	int acc_no;
	String name;
	String email;
	String phone;
	double balance;

	Scanner sc = new Scanner(System.in);

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void accept() throws InterruptedException {
		System.out.println("enter name");
		String name = sc.next();
		setName(name);
		System.out.println("enter account number ");
		int acc_no = sc.nextInt();
		setAcc_no(acc_no);
		System.out.println("enter email");
		String email = sc.next();
		setEmail(email);
		System.out.println("enter phone");
		String phone = sc.next();
		setPhone(phone);
		System.out.println("enter balance");
		double bal = sc.nextInt();
		setBalance(bal);
		System.out.print("please wait");
		for (int k = 0; k < 20; k++) {
			System.out.print(".");
			Thread.sleep(100);
		}
		System.out.println("\naccount created succesfully!!");
		System.out.println("\nACCOUNT DETAILS:");
		System.out.println(this.display());
	}
	public void withdraw()
	{
		System.out.println("enter amount :");
		double wtamt=sc.nextDouble();
		if(!(wtamt<=this.balance))
		{
		System.out.println("sorry not enough balance");	
		}
		else
		{
			double new_bal=this.balance-wtamt;
			System.out.println("your new balance is"+new_bal);
			this.setBalance(new_bal);
		}
		
	}
	boolean withdraw(double witamt)
	{
	if(this.balance<witamt)
	{
		return false;
	}
	else
	{
		double new_bal=this.balance+witamt;
		System.out.println("your new balance is"+new_bal);
		this.setBalance(new_bal);
		return true;
	}
	}
	public void deposit()
	{
		System.out.println("enter amount :");
		double dtamt=sc.nextDouble();
		
			double new_bal=this.balance+dtamt;
			System.out.println("your new balance is"+new_bal);
			this.setBalance(new_bal);
	}
	public void deposit(double bal)
	{
	
			double new_bal=this.balance+bal;
			this.setBalance(new_bal);
	}
	public void transfer()
	{
System.out.println("enter amount");

	}
		
	

}
