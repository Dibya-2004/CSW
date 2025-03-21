package oops;

//setter getter always public

class A{
	private int svalue;
	private int eage;
	private String sname;
	public void setSvalue(int svalue) {
		this.svalue = svalue;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSvalue() {
		return svalue;
	}
	public int getEage() {
		return eage;
	}
	public String getSname() {
		return sname;
	}
	
}
public class GetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.setSvalue(10);
		a.setEage(24);
		a.setSname("Binod");
		System.out.println(a.getSvalue());
		System.out.println(a.getEage());
		System.out.println(a.getSname());
	}

}
