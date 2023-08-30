package bridge.exam2;

import bridge.CountDisplay;

public class Main {
	public static void main(String[] args) {
		CountDisplay d = new CountDisplay(new FileDisplayImpl("star.txt"));
		d.multiDisplay(3);
	}
}
