package SkyArt;

// Copyright CompuScholar, Inc.
// Do not distribute or post in any public or private venue.

import javax.swing.*;

// This class is fully implemented as part of the activity starter.
// No student modification is necessary.
public class SkyArt 
{
	// main() method
	public static void main(String[] args)
	{
		// create instance of SkyArt that will do all the work!
		new SkyArt();
	}

	// SkyArt constructor
	public SkyArt() 
	{
		// create the JFrame window
		JFrame myFrame = new JFrame(); 
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	    // create a new ArtPanel and add it to the frame
		ArtPanel myPanel = new ArtPanel();
		myFrame.add(myPanel); 
		
		// pack the frame around the ArtPanel's preferred
		// size and set the frame to visible
		myFrame.pack();
		myFrame.setVisible(true);
	}
	
}
