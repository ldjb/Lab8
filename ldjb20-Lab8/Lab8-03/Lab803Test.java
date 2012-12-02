public class Lab803Test {
	
	public static void main(String[] args) {
	
		CircleList clist = new CircleList();
		System.out.println("* Add Circle:");
		clist.add(new Circle());
		System.out.println("* Add Circle:");
		clist.add(new Circle());
		Circle c = new Circle();
		c.changeColor("red");
		System.out.println("* Add Circle at specified index:");
		clist.add(1, c);
		System.out.println("* Remove Circle at specified index:");
		clist.remove(0);
		System.out.println("* Clear the Vector:");
		clist.clear();
	
	}
	
}