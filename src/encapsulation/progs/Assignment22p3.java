package encapsulation.progs;
class Cable
{
	private String channelname;
	private int channelnumber;
	private int customerid;
	Cable(String channelname,int channelnumber,int customerid)
	{
		this.channelname=channelname;
		this.channelnumber=channelnumber;
		this.customerid=customerid;
	}
	public String getchannelname()
	{
		return channelname;
	}
	public int getchannelnumber()
	{
		return channelnumber;
	}
	public int getcustomerid()
	{
		return customerid;
	}
	public void setchannelname(String channelname)
	{
		this.channelname=channelname;
	}
	public void setchannelnumber(int channelnumber)
	{
		this.channelnumber=channelnumber;
	}
	public void setcustomerid(int customerid)
	{
		this.customerid=customerid;
	}

}

public class Assignment22p3 {
	public static void main(String[] args) {
		System.out.println("start of java code");
		Cable ca1=new Cable("suntv",34,1224);
		System.out.println("channelname="+ca1.getchannelname());
		System.out.println("channelnumber="+ca1.getchannelnumber());
		System.out.println("customerid="+ca1.getcustomerid());
		ca1.setchannelname("pogo");
		ca1.setchannelnumber(54);
		ca1.setcustomerid(4565);
		System.out.println("channelname="+ca1.getchannelname());
		System.out.println("channelnumber="+ca1.getchannelnumber());
		System.out.println("customerid="+ca1.getcustomerid());
		System.out.println("end of java code");
	}
}
