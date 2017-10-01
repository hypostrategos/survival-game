import java.util.*;
import floor.Level;

public class Main {
	public static Random rand = new Random();

	public static void main(String[] args) {
		Level level = new Level();
		level.mapGen();
	}
}