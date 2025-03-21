package inheritance;
class BankAccount{
	double balance=10000;
}
class SavingsAccount extends BankAccount{
	void calculateInterest(double r) {
		double i=(double)(r/100)*balance;
		balance+=i;
		System.out.println("Interest at "+r+" is : "+i);
	}
}
class CheckingAccount extends BankAccount{
	void deductMonthlyfee(double with) {
		double fee=balance-with;
		System.out.println("Deduct fee with withdraw "+with+" is :"+fee);
	}
}
public class Q2 {
	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount();
		CheckingAccount c=new CheckingAccount();
		s.calculateInterest(50);
		c.deductMonthlyfee(243.9);
	}
}