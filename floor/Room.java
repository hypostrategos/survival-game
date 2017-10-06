package floor;
import java.util.*;

public class Room {
	private final int maxRoomSize=20;
	private int roomSize;
	private int origin;
	// private Set<Integer> tiles = new HashSet<>();

	public Room(int[] tileList, List<Room> roomList) {
		roomSize=Math.min(Level.rand.nextInt(maxRoomSize-2)+3, Level.tileWidth);
		while (tileList[origin]!=0) {
			origin=Level.rand.nextInt(tileList.length);
		}

		int x=0, y=0;
		int xMin = origin%Level.tileWidth, yMin = origin/Level.tileWidth;
		int maxWidth = Level.tileWidth-1; int maxHeight = Level.totalTiles/Level.tileWidth-1;
		int tile=0;

		for (int j=0; j<roomSize; j++) {
			y = Math.min(yMin+j, maxHeight);
			for (int i=0; i<roomSize; i++) {
				x = Math.min(xMin+i, maxWidth);
				tile = x+y*Level.tileWidth;
				if (i==0||j==0||x==maxWidth||y==maxHeight||i==roomSize-1||j==roomSize-1)
					tileList[tile]=2;
				else 
					tileList[tile]=1;
			}
		}
	}
}