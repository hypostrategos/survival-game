package floor;
import java.util.*;
import java.util.stream.*;

public class Level {
	public static final int totalTiles = 1000;
	public static final int tileWidth = 100;
	public static int lowestFloor = 0;
	
	private List<Tile> tileList;
	private int floor;

	public Level() {
		this.floor = ++lowestFloor;
		mapGen();
	}
	public void mapGen() {
		tileList = new ArrayList<>(totalTiles);
		Stream.iterate(0, x->x+1)
		.limit(totalTiles)
		.forEach(x->tileList.add(new Tile(x)));
	}
}