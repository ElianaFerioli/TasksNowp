package Task2;



public class Airplane {
	
	public int consumption;
	public Pair<Integer, Integer> position;
	public float fuel_level;
	
	
	public Airplane(Pair<Integer, Integer> position, int consumption, float fuel_level) {
		super();
		this.position = position;
		this.consumption = consumption;
		this.fuel_level = fuel_level;
	}


	public int getConsumption() {
		return consumption;
	}


	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}


	public Pair<Integer, Integer> getPosition() {
		return position;
	}


	public void setPosition(Pair<Integer, Integer> position) {
		this.position = position;
	}


	public float getFuel_level() {
		return fuel_level;
	}


	public void setFuel_level(float fuel_level) {
		this.fuel_level = fuel_level;
	}

	public boolean go_to(int x, int y) {
		boolean can_move = false;
		Pair<Integer, Integer> initial_position = this.getPosition();
		double x1 = (double)initial_position.getKey();
		double y1 = (double)initial_position.getValue();
		double x2 = (double)x;
		double y2 = (double)y;
		int distance = (int)Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));	
		int needed_fuel = distance * this.getConsumption();
		
		if(needed_fuel <= this.getFuel_level()) {
			can_move = true;
		}
		
		return can_move;	
	}
	
	public void refuel(int litres) {
		this.setFuel_level(litres);
	}
	

}
