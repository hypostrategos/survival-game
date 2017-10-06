package floor;
import java.util.*;
import java.util.stream.*;

public class Level {
	public static final int totalTiles = 100;
	public static final int tileWidth = 10;
	public static int lowestFloor = 0;
	public static int numberOfRooms = 2;
	public static Random rand = new Random();
	
	private int[] tileList;
	private List<Room> roomList;
	private int floor;

	public Level() {
		this.floor = ++lowestFloor;
		levelGen();
	}
	public void levelGen() {
		tileList = new int[totalTiles];
		roomList = new ArrayList<>(numberOfRooms);
		for (int i=0;i<numberOfRooms;i++) {
			roomList.add(new Room(tileList));
		}
		Arrays.stream(tileList)
		.forEach(System.out::println);

		// Stream.iterate(0, x->x+1)
		// .limit(totalTiles)
		// .forEach(x->tileList.add(new Tile(x)));

		// Set<Integer> path = new TreeSet<>();
		// setPath(path).stream()
		// .forEach(trav->tileList.get(trav).setTraversable(true));

		// tileList.stream()
		// .forEach(System.out::print);
	}
	// public Set<Integer> setPath(Set<Integer> path) {
	// 	int maxWidth=tileWidth-1, maxHeight=totalTiles/tileWidth-1;
	// 	int x=rand.nextInt(tileWidth), y=rand.nextInt(maxHeight+1);
	// 	int counter=0;

	// 	while(counter<totalTiles) {
	// 		counter++;
	// 		// System.out.print(x+" "+y+" "+(x+y*tileWidth)+" -> ");
	// 		x=Math.min(Math.max((x-1+rand.nextInt(3)),0),maxWidth);
	// 		y=Math.min(Math.max((y-1+rand.nextInt(3)),0),maxHeight);
	// 		path.add(x+y*tileWidth);
	// 		// System.out.println(" "+x+" "+y+" "+(x+y*tileWidth));
	// 	}

	// 	return path;
	// }
	public void layout(int size) {
	}
}