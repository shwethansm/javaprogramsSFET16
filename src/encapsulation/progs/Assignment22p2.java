package encapsulation.progs;
class Account
{
	private long accountnumber;
	private float accountbalance;
	Account(long accountnumber,float accountbalance)
	{
		this.accountnumber=accountnumber;
		this.accountbalance=accountbalance;
	}
	public long getaccountnumber()
	{
		return accountnumber;
	}
	public float getaccountbalance()
	{
		return accountbalance;
	}
	public void setaccountnumber(long accountnumber)
	{
		this.accountnumber=accountnumber;
	}
}

public void setaccountbalance(float accountbalance)
{
	this.accountbalance=accountbalance;
}

public class Assignment22p2 {
	public static void main(String[] args) {
		System.out.println("start of java code");
		Account a1=new Account(2339049L,2000.4f);
		System.out.println("accountnumber="+a1.getaccountnumber());
		System.out.println("accountbalance="+a1.getaccountbalance());
		a1.setaccountnumber(24567890l);
		a1.setaccountbalance(3000.45f);
		System.out.println("accountnumber="+a1.getaccountnumber());
		System.out.println("accountbalance="+a1.getaccountbalance());
		System.out.println("end of java code");
	}

}
