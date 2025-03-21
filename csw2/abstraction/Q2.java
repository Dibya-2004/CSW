package abstraction;
abstract class Bank{
	void calculateInterest() {}
}
class SavingsAccount extends Bank{
	void calculateInterest(int p, int r) {
		int interest=p*r;
		System.out.println("Interest by savings is "+interest);
	}
}
class FixedAccount extends Bank{
	void calculateInterest(int p, int r, int t) {
		int interest=p*r*t;
		System.out.println("Interest by fixed is "+interest);
	}
}
public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s=new SavingsAccount();
		FixedAccount f=new FixedAccount();
		s.calculateInterest(10000,3);
		f.calculateInterest(10000,6,1);
	}
}

