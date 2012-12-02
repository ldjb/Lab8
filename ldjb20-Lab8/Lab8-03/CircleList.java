import java.util.Vector;

public class CircleList {

	private Vector<Circle> clist;
	
	public CircleList() {
		clist = new Vector<Circle>();
	}
	
	public void add(Circle c) {
		clist.add(c);
	}
	
	public void add(int index, Circle c) {
		clist.add(index, c);
	}
	
	public void remove(int index) {
		clist.remove(index);
	}
	
	public void clear() {
		clist.clear();
	}

}