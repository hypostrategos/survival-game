package floor;

public class Tile {
	public int id;
	public boolean traversable;
	public Tile(int id) {
		this.id = id;
		System.out.println(id);
	}
}