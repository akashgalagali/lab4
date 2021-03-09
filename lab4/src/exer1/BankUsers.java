package exer1;
import java.util.*;
public class BankUsers {

	public static void main(String[] args) {
Random rand = new Random();
	
	Person smith =new Person();
	Person kathy= new Person();
	Account smithacc =new Account();
	Account kathyacc= new Account();
	smith.setAge(20);
	smith.setName("Smith");
	kathy.setAge(25);
	kathy.setName("Kathy");
	smithacc.setAccHolder(smith);
	kathyacc.setAccHolder(kathy);
	smithacc.setAccNum(rand.nextInt(100));
	kathyacc.setAccNum(rand.nextInt(100));
	smithacc.setBalance(2000);
	kathyacc.setBalance(3000);
	smithacc.display();
	kathyacc.display();
	smithacc.deposit(2000);
	kathyacc.withdraw(2000);
	System.out.println("Smith account balance after deposite:"+smithacc.getBalance());
	System.out.println("kathy account Balance after withdraw: "+kathyacc.getBalance());
	
	}

}
