package encapsulation;
class Temperature{
	private double celsius;
	private double farenheit;
	public double getCelsius() {
		return celsius;
	}
	public double getFarenheit() {
		return farenheit;
	}
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	public void setFarenheit(double farenheit) {
		this.farenheit = farenheit;
	}
	public boolean chk(double c,double f) {
		if(f==(c*(9/5) +32))
				return true;
		else 
			return false;
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature t=new Temperature();
		t.setCelsius(0);
		t.setFarenheit(32);
		System.out.println("celcius corresponds farenheit? "+t.chk(t.getCelsius(),t.getFarenheit() ));
	}

}
