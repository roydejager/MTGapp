package gui.methods;

public class LifeMethods {
	int lifetotal = 20;
	
	public int getTotalHealth() {
		return lifetotal;
	}
	
	public int plusOneLife() {
		lifetotal = lifetotal + 1;
		return lifetotal;
	}
	
	public int minusOneLife() {
		lifetotal = lifetotal - 1;
		return lifetotal;
	}
	
	public int resetLife() {
		lifetotal = 20;
		return lifetotal;
	}
}