package abstractFactory.listfactory;

import abstractFactory.factory.Item;
import abstractFactory.factory.Tray;

public class ListTray extends Tray {

	public ListTray(String cation) {
		super(cation);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<li>\n");
		sb.append(caption);
		sb.append("\n<ul>\n");
		for(Item item : tray) {
			sb.append(item.makeHTML());
		}
		sb.append("</ul>\n");
		sb.append("</li>\n");
		return sb.toString();
	}
}
