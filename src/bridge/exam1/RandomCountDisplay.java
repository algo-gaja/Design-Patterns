package bridge.exam1;

import bridge.Display;
import bridge.DisplayImpl;

public class RandomCountDisplay extends Display {

	public RandomCountDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	public void randomDisplay(int times) {
		if(Math.random() * 10 < times) {
			display();
		};
	}
}
