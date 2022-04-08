import java.util.ArrayList;
import java.util.Scanner;

public class AccountUtils {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int ch, i = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<EBank> user = new ArrayList<EBank>();
		do {
			System.out.println("1. Add Account\r\n" + "2. Display an Account\r\n" + "3. Display All Accounts\r\n"
					+ "4. Remove an Account by email\r\n" + "5. withdraw\r\n" + "6. deposit\r\n" + "7. transfer\r\n"
					+ "8. search account using name\r\n" + "9. search account using email\r\n"
					+ "10.search account using phone\r\n" + "11. exit.");
			System.out.println("enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				user.add(new EBank());
				user.get(i).accept();

				i++;
				break;
			case 2:
				System.out.println(user.get(i - 1).display());
				break;
			case 3:
				for (EBank e : user) {
					System.out.println(e.display());
				}

				break;
			case 4:
				System.out.println("enter email:");
				String email0 = sc.next();
				for (int e = 0; e < user.size(); e++) {
					if ((user.get(e).email).equals(email0)) {
						user.remove(e);
						System.out.println("account removed successfully!!");
					}
				}
				break;
			case 5:
				System.out.println("enter account number");
				int accnum = sc.nextInt();

				for (int l = 0; l < user.size(); l++) {
					if ((user.get(l).acc_no) == accnum) {
						user.get(l).withdraw();
					}
				}
				break;
			case 6:
				System.out.println("enter account number");
				int accnum0 = sc.nextInt();

				for (int h = 0; h < user.size(); h++) {
					if ((user.get(h).acc_no) == accnum0) {
						user.get(h).deposit();
					}
				}
				break;
			case 7:
				System.out.println("enter your account number");
				int accnum01 = sc.nextInt();

				for (int d = 0; d < user.size(); d++) {
					if ((user.get(d).acc_no) == accnum01) {
						System.out.println("enter amount :");
						double amount=sc.nextDouble();
						boolean status=user.get(d).withdraw(amount);
						if(status)
						{
						System.out.println("enter beneficiary account number ");
						int accnum02 = sc.nextInt();
						for (int f = 0; f < user.size(); f++) {
							if ((user.get(f).acc_no) == accnum02) {
								
								
								double transfer_amount = sc.nextDouble();
								user.get(f).deposit(transfer_amount);
							}

						}
					}
						else
							System.out.println(" sorry you dont have enough balance");
					}

				}
				break;
			case 8:
				System.out.println("enter name:");
				String Name=sc.next();
				for (int n = 0; n < user.size(); n++) {
					if ((user.get(n).name).equals(Name)) {
						System.out.println(user.get(n).display());
					}
				}
				break;
			case 9:System.out.println("enter email:");
			String Email=sc.next();
			for (int x = 0; x < user.size(); x++) {
				if ((user.get(x).email).equals(Email)) {
					System.out.println(user.get(x).display());
				}
			}
			break;
			case 10:System.out.println("enter phone:");
			String Phone=sc.next();
			for (int u = 0; u < user.size(); u++) {
				if ((user.get(u).phone).equals(Phone)) {
					System.out.println(user.get(u).display());
				}
			}
			break;
			
			}
		} while (ch != 11 &&(ch>0&&ch<=10));// do closed
	}// main closed
}// class closed