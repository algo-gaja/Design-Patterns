package abstractFactory.divfactory;

import abstractFactory.factory.Link;

public class DivLink extends Link {

	public DivLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<div class=\n\"LINK\"><a href=\"" + url + "\">" + caption + "</a></div>\n";
	}
}
