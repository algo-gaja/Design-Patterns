package prototype.exam;

import prototype.exam.framework.Product;

public abstract class ConcreteProduct implements Product {
	
	@Override
	public abstract void use(String s);

	@Override
	public final Product createCopy() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
