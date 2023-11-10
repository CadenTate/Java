// Copyright CompuScholar, Inc.
// Do not distribute or post in any public or private venue.

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

// ArtPanel extends JPanel so we can override the paintComponent method
public class ArtPanel extends JPanel
{
	// these class constants set the width and height of the overall 
	// panel, of each ellipse that make up a piece of a cloud, and
	// the starting recursion level.
	final int PANEL_WIDTH = 600;
	final int PANEL_HEIGHT = 400;

	final int ELLIPSE_WIDTH = 50;
	final int ELLIPSE_HEIGHT = 30;
	
	final int STARTING_LEVEL = 3;

	// declare a Random object for use in selecting random positions
	Random rand = new Random();
	
	// this variable will hold the bitmap image loaded from disk
	BufferedImage sunImage;

	// The student will implement this method to load the sunImage
	// ArtPanel constructor
	public ArtPanel()
	{
		
	}
	
	// This function is provided complete in the activity starter.
	// Returns the ArtPanel preferred size.
	public Dimension getPreferredSize() 
	{
		return new Dimension(PANEL_WIDTH,PANEL_HEIGHT);
	}	

	// The student will implement this method as part of the activity 
	// override the paintComponent() method to do 
	// all of the custom graphics work
	protected void paintComponent(Graphics g) 
	{
		// always call the base class paintComponent() first
		super.paintComponent(g);       

		// cast the Graphics object to a Graphics2D object
		Graphics2D myGraphics = (Graphics2D) g;
		
	}
	
	// The student will implement this method as part of the activity 
	// this function will draw a cloud by recursively drawing a 
	// series of overlapping white ellipses
	void drawCloud(Graphics2D myGraphics, Point2D.Double startingPoint, int level)
	{

	}
}
