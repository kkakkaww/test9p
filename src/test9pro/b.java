package test9pro;
import java.util.Random;
public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(1000);
		for (int i=0;i<50;i++) {
			System.out.print(r.nextInt(100)+" ");
		}
	}

}
