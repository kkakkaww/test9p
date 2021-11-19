package test9pro;
import java.util.Date;
public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString());
		Date d1 = new Date(d.getTime()+10000);
		System.out.println(d1.toString());
		Date d2 = new Date(d.getTime()+100000);
		System.out.println(d2.toString());
		Date d3 = new Date(d.getTime()+1000000);
		System.out.println(d3.toString());
		Date d4 = new Date(d.getTime()+10000000);
		System.out.println(d4.toString());
		Date d5 = new Date(d.getTime()+100000000);
		System.out.println(d5.toString());
	}

}
