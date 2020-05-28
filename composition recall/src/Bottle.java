public class Bottle {
	private int capacity;
	private String colour;
	public Water waterbottle;
	public Bottle(int capacity, String colour, Water waterbottle) {
		this.capacity = capacity;
		this.colour = colour;
		this.waterbottle = waterbottle;
	}
	public int getCapacity() {
	return capacity;
	}
	public String getColour() {
		return colour;
		}
	public Water getWaterbottle() {
		return waterbottle;
		}

}
