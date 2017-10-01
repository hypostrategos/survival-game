package floor;

public class Tile {
	public int id;
	public boolean traversable=false;
	public Tile(int id) {
		Level.rand.nextInt(10);
		this.id = id;
	}
	public void setTraversable(boolean traversable) {
		this.traversable=traversable;
	}

    @Override
    public String toString() {
        return (traversable?id:"  ")+
        ((id+1)%Level.tileWidth==0?"\n":" ")
        ;
    }
}