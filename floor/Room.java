package floor;

public class Room {
	private final int roomSize=4;

	public Room(int[] tileList) {
		int origin;
		while (tileList[origin=Level.rand.nextInt(tileList.length)]!=1) {
			tileList[origin]=1;
			break;
		}
		int x=0, y=0;
		for (int j=0; j<roomSize; j++) {
			y=Math.min((origin+j*Level.tileWidth),Level.totalTiles/Level.tileWidth);
			for (int i=0; i<roomSize; i++) {
				x=Math.min((origin+i),Level.tileWidth-1);
				tileList[x+y-origin]=1;
				System.out.println(x+" "+y);
			}
		}
	}
}