public class Lab802Test {
	
	public static void main(String[] args) {
	
		for (int i = 0; i < 5; i++) {
			Circle c = new Circle();
			System.out.println("New Circle created with InstanceID " +
				Integer.toString(c.getInstanceID()) + ".");
		}
		System.out.println("In total, there are "
			+ Integer.toString(Circle.getNumInstances()) + " Circles.");
	
	}
	
}