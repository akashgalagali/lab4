package exer1;

public class Account {
private long accNum;
private double balance;
private Person accHolder;
public long getAccNum() {
	return accNum;
}
public void setAccNum(long accNum) {
	this.accNum = accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Person getAccHolder() {
	return accHolder;
}
public void setAccHolder(Person accHolder) {
	this.accHolder = accHolder;
}

public void deposit(int n) {
	setBalance(getBalance()+n);
}
public void withdraw(int n) {
	setBalance(getBalance()-n);
}
public void display() {
	System.out.println("=====Details of account=====");
	System.out.println("Name of Account Holder: "+accHolder.getName());
	System.out.println("Age of Account Holder: "+accHolder.getAge());
	System.out.println("Account number : "+getAccNum());
	System.out.println("Balance : "+getBalance());
}
}

class SavingsAccount extends Account {
	private double minBal;
	@Override
	public void withdraw(int n){
		if(minBal<super.getBalance())
			super.setBalance(getBalance()-n);
	}
}
class CurrentAccount extends Account{
	private double overdraftLimit;
	@Override
	public void withdraw(int n){
		if(overdraftLimit<=super.getBalance())
			System.out.println("Limit Reached");
	}
}