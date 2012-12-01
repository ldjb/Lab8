public class Lab801Test {
	
	public static void main(String[] args) {
	
		Notebook nb = new Notebook();
		nb.storeNote("The quick brown fox jumps over the lazy dog.");
		nb.storeNote("Five quacking zephyrs jolt my wax bed.");
		nb.storeNote("Jackdaws love my big sphinx of quartz.");
		nb.storeNote("Cozy lummox gives smart squid who asks for job pen.");
		nb.storeNote("Grumpy wizards make toxic brew for the evil Queen and Jack.");
		nb.search("the");
	
	}
	
}