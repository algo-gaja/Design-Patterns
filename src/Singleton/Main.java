package Singleton;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInSingleton();
		Singleton obj2 = Singleton.getInSingleton();
		if(obj1 == obj2) {
			System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
		} else {
			System.out.println("obj1과 obj2는 같은 인스턴스가 아닙니다.");
		}
		System.out.println("End.");
	}
}
