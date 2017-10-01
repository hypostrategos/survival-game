package floor;
import java.util.*;
import java.util.stream.*;

public class Level {
	public static final int totalTiles = 100;
	public static final int tileWidth = 10;
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
		int x=0, y=0;
		// int height=totalTiles/tileWidth;
		// for (int i=0;i<tileWidth;i++) {
		// 	for (int j=0;j<height;j++) {
		// 		if (x==i&&y==j) {
		// 			path.add(i+j*tileWidth);
					
		// 			x=Math.min(Math.max((x-1+rand.nextInt(3)),1),tileWidth-1);
		// 			y=Math.min(Math.max((y-1+rand.nextInt(3)),1),height-1);
		// 		} else if(x<i&&y<j) {
		// 			i=x;
		// 			j=y-1;
		// 		}
		// 	}
		// }
		int maxWidth=tileWidth-1, maxHeight=totalTiles/tileWidth-1;
		while(x<maxWidth&&y<maxHeight) {
			System.out.print(x+" "+y);
			path.add(x+y*tileWidth);
			x=Math.min(Math.max((x-1+rand.nextInt(3)),0),maxWidth);
			y=Math.min(Math.max((y-1+rand.nextInt(3)),0),maxHeight);
			System.out.println(" "+x+" "+y);
		}
		System.out.println(path);
		return path;
	}
	public void layout(int size) {
	}
}