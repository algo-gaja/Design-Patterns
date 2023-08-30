package bridge.exam1;

import bridge.StringDisplayImpl;

public class Main {
	public static void main(String[] args) {
		RandomCountDisplay display = new RandomCountDisplay(new StringDisplayImpl("Hello, Universe."));
		display.randomDisplay(5);
		
		RandomCountDisplayResult result = new RandomCountDisplayResult(new StringDisplayImpl("Hello, Korea."));
		result.randomDisplay(10);
	}
}
