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

}