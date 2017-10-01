package display;

import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

import floor.Level;

public class Display {
	public static final int xWidth = 1200;
	public static final int yWidth = 800;

	public static void start() {
    	JFrame jf = new JFrame("Survival Game");
	    jf.setSize(xWidth+50,yWidth+50);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    jf.addKeyListener(new keyEvent());
	    jf.setVisible(true);
	}
}

class keyEvent implements KeyListener {
	
	public keyEvent () {
	}
	
	public void keyPressed(KeyEvent k) {
		// System.out.println(k.getKeyCode());
		switch(k.getKeyCode()) {
			// case 84 : { map.mapBioCount(); System.out.println("animals: "+SimMap.totalFauna+" plants: "+SimMap.totalFlora); } //t key
			// break;
			// case 85 : map.mapUpdate(); // u key
			// break;
			// case 73 : map.mapUpdate(100); //i key
			// break;
			// case 68 : { map.mapDisplay(); System.out.println(SimMap.counter); }// d key 
			// break;
			// case 88 : map.mapIncreaseSpecies(1); //z key
			// break;
			// case 90: map.mapIncreaseSpecies(2); //x key
			// break;
			case 27 : System.exit(0); //esc key
			break;
		}
	}
	public void keyReleased(KeyEvent k) {
	}
	public void keyTyped(KeyEvent k) {
	}
}