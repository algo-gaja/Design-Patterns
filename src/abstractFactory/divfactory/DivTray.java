package abstractFactory.divfactory;

import abstractFactory.factory.Item;
import abstractFactory.factory.Tray;

public class DivTray extends Tray {

	public DivTray(String cation) {
		super(cation);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<p><b>");
		sb.append(caption);
		sb.append("</b></p>\n");
		sb.append("<div class=\"TRAY\">");
		for(Item item : tray) {
			sb.append(item.makeHTML());
		}
		sb.append("</div>\n");
		return sb.toString();
	}
}
