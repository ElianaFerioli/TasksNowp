package Task2;

public class Pair<T1, T2> {
    
	public final int x;
    public final int y;

    public Pair(int x , int y) { 
        this.x = x;
        this.y = y;
    }

	public double getKey() {
		return this.x;
	}

	public double getValue() {
		return this.y;
	}
    

}
