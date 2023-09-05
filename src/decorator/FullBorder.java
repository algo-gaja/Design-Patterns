package decorator;

public class FullBorder extends Border {
	public FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumns() {
		// 문자 수는 내용물 양쪽에 좌우 장식 문자만큼 더한 것
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		// 행수는 내용물의 행수에 상하 장식 문자만큼 더한 것
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) {
		// 상단 테두리
		if(row == 0) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		}
		// 하단 테두리
		else if(row == display.getRows() + 1) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		}
		else {
			return "|" + display.getRowText(row - 1) + "|";
		}
	}

	// 문자 ch로 count 수만큼 연속한 문자열을 만든다
	private String makeLine(char ch, int count) {
		StringBuilder line = new StringBuilder();
		for(int i = 0 ; i < count ; i++) {
			line.append(ch);
		}
		return line.toString();
	}
}
