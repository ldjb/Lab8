import java.util.Random;

public class NumberList {

	private double list[];
	
	public NumberList(int arrLen) {
		list = new double[arrLen];
	}
	
	public void print() {
		for (double item : list) {
			System.out.println(item);
		}
	}
	
	public void randomFill() {
		Random rand = new Random();
		for (int i=0; i < list.length; i++) {
			list[i] = rand.nextDouble();
		}
	}

}