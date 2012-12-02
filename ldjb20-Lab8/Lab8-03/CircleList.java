import java.util.Vector;

public class CircleList {

	private Vector<Circle> clist;
	
	public CircleList() {
		clist = new Vector<Circle>();
	}
	
	public void add(Circle c) {
		clist.add(c);
		printDetails();
	}
	
	public void add(int index, Circle c) {
		clist.add(index, c);
		printDetails();
	}
	
	public void remove(int index) {
		clist.remove(index);
		printDetails();
	}
	
	public void clear() {
		clist.clear();
		printDetails();
	}
	
	public void printDetails() {
		int i = 0;
		for (Circle c: clist) {
			System.out.print("[" + Integer.toString(i) + "] ");
			c.toString();
			i++;
		}
	}

}