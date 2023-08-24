package Singleton.exam2;

public enum Triple2 {
	ALPHA, BETA, GAMMA;
	
	private Triple2() {
		System.out.println("The instance " + this + " is created.");
	}
	
	public static Triple2 getInstance(String name) {
		return valueOf(name);
	}
}
