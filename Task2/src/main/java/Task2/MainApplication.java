package Task2;


public class MainApplication {
	
	public static void main(String[] args) {
		
		Pair<Integer, Integer> pair = new Pair<>(1, 2);
		
		Airplane airplane = new Airplane(pair, 3, 2);
		
		System.out.println(airplane.go_to(4, 8));
		
		airplane.refuel(23);
		
		System.out.println(airplane.go_to(4, 8));
		
	}

}
