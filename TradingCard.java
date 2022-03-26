/*
 Name: Yujin Bae and Lois Zan
 Teacher: Mr. Guglielmi
 Date: October 6th, 2020
 Assgnment: This program will display a star constellation trading card.
 */

// The "TradingCard" class.
import java.awt.*;
import hsa.Console;

public class TradingCard
{
    static Console c;           // The output console

    public TradingCard ()
    {
	//makes the console that's 500 by 700
	c = new Console (345, 490, 1, "Constellation Card");
    }


    public void frontPage ()
    {
	//background
	c.fillRect (15, 15, 470, 670);
	c.setColour (Color.cyan);
	c.fillRect (25, 25, 450, 650);
	c.setColour (Color.darkGray);
	c.fillRect (35, 35, 430, 630);
	//title's shadow
	c.setColour (Color.blue);
	c.setFont (new Font ("Times New Roman", Font.BOLD, 70));
	c.drawString ("The", 195, 155);
	c.drawString ("Constellation", 55, 215);
	c.drawString ("Trading", 135, 275);
	c.drawString ("Card", 185, 335);
	//title
	c.setColour (Color.white);
	c.drawString ("The", 190, 150);
	c.drawString ("Constellation", 50, 210);
	c.drawString ("Trading", 130, 270);
	c.drawString ("Card", 180, 330);
	//name
	c.setFont (new Font ("Times New Roman", Font.ITALIC, 20));
	c.drawString ("Made By", 215, 460);
	c.setFont (new Font ("Times New Roman", Font.ITALIC, 30));
	c.drawString ("Yujin Bae and Lois Zan", 110, 500);
	//date
	c.drawString ("October 6th, 2020", 130, 620);
    }


    public void card ()
    {
	//background
	c.setColour (Color.black);
	c.fillRect (15, 15, 470, 670);
	c.setColour (Color.cyan);
	c.fillRect (25, 25, 450, 650);
	c.setColour (Color.darkGray);
	c.fillRect (35, 35, 430, 630);
	
	//the name of the constellation
	c.setColour (Color.white);
	c.setFont (new Font ("Times New Roman", Font.ITALIC, 70));
	c.drawString ("Aries", 160, 130);
	
	//constalletion
	c.fillStar (100, 210, 10, 10);
	c.drawLine (105, 215, 135, 230);
	c.fillStar (130, 225, 10, 10);
	c.drawLine (230, 220, 135, 230);
	c.fillStar (220, 210, 20, 20);
	c.drawLine (230, 220, 405, 175);
	c.fillStar (400, 170, 10, 10);
	
	//text
	c.setFont (new Font ("Times New Roman", Font.ITALIC, 30));
	c.drawString("March 21 - April 19", 120, 350);
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 18));
	c.drawString("Phrixus and Helle were the twin prince and princess of ", 65, 400);
	c.drawString("Biotia. Their father, king Athamas, remarried Ino, who", 45, 420);
	c.drawString("hated the children. So she blamed a famine on them, and", 45, 440);
	c.drawString("demanded their sacrifice. Hermes, the god of messengers,", 45, 460);
	c.drawString("took pity, and took away the children on a flying lamb.", 45, 480);
	
	c.drawString("While flying on the lambs back, Helle lost held of the", 65, 510);
	c.drawString("lamb's fleece, and fell. She was rescued by Podeidon and", 45, 530);
	c.drawString("became a godness of the sea named Hellespont after her.", 45, 550);
	
	c.drawString("Phrixus landed in a country called Colches, at the edge", 65, 580);
	c.drawString("of the black sea, where he sacrificed the lamb to the gods. ", 45, 600);
	
	c.drawString("Zeus placed the lamb's constellation, Aries, on the", 65, 630);
	c.drawString("night sky to honor the lamb's work and sacrifice. ", 45, 650);
    }


    public static void main (String[] args)
    {
	TradingCard t = new TradingCard ();

	t.frontPage ();
	c.getChar ();
	c.clear ();
	t.card ();
    } // main method
} // TradingCard class
