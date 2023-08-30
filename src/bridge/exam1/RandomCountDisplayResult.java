package bridge.exam1;

import java.util.Random;

import bridge.CountDisplay;
import bridge.DisplayImpl;

public class RandomCountDisplayResult extends CountDisplay {
	private Random random = new Random();
	
	public RandomCountDisplayResult(DisplayImpl impl) {
		super(impl);
	}
	
	public void randomDisplay(int times) {
		multiDisplay(random.nextInt(times));
	}
}
