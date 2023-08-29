package abstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item {
	protected List<Item> tray = new ArrayList<>();
	
	public Tray(String cation) {
		super(cation);
	}
	
	public void add(Item item) {
		tray.add(item);
	}
}
