package floor;
import java.util.*;
import java.util.stream.*;

public class Level {
	public static final int totalTiles = 400;
	public static final int tileWidth = 20;
	public static int lowestFloor = 0;
	public static Random rand = new Random();
	
	private List<Tile> tileList;
	private int floor;

	public Level() {
		this.floor = ++lowestFloor;
		levelGen();
	}
	public void levelGen() {
		tileList = new ArrayList<>(totalTiles);
		Stream.iterate(0, x->x+1)
		.limit(totalTiles)
		.forEach(x->tileList.add(new Tile(x)));

		path().stream()
		.forEach(trav->tileList.get(trav).setTraversable(true));

		tileList.stream()
		.forEach(System.out::print);
	}
	public Set<Integer> path() {
		Set<Integer> path = new TreeSet<>();
		int maxWidth=tileWidth-1, maxHeight=totalTiles/tileWidth-1;
		int x=tileWidth/2, y=totalTiles/(2*tileWidth);
		int counter=0;

		// Stream.iterate(0, iter->iter+1)
		// .limit(totalTiles-1)
		// .filter(tile->rand.nextInt(10)>8)
		// .forEach(tile-> {
		// 	path.add(Math.max(tile-1-maxWidth,0));
		// 	path.add(Math.max(tile-maxWidth,0));
		// 	path.add(Math.max(tile+1-maxWidth,0));
		// 	path.add(Math.max(tile-1,0));
		// 	path.add(tile);
		// 	path.add(Math.min(tile+1,totalTiles));
		// 	path.add(Math.min(tile-1+maxWidth,totalTiles-1));
		// 	path.add(Math.min(tile+maxWidth,totalTiles-1));
		// 	path.add(Math.min(tile+1+maxWidth,totalTiles-1));
		// } );
		while(counter<totalTiles/4) {
			counter++;
			// System.out.print(x+" "+y+" "+(x+y*tileWidth)+" -> ");
			x=Math.min(Math.max((x-1+rand.nextInt(3)),0),maxWidth);
			y=Math.min(Math.max((y-1+rand.nextInt(3)),0),maxHeight);
			path.add(x+y*tileWidth);
			// System.out.println(" "+x+" "+y+" "+(x+y*tileWidth));
		}

		return path;
	}
	public void layout(int size) {
	}
}