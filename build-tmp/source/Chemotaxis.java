import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 //declare bacteria variables here

 Bacteria  [] clique;
 int purple = color(61, 0, 153,250);
 int yellow = color(207, 207, 0,250);
 int green = color(0, 138, 46,250);
 int red = color(147, 0, 0,250);
 int foodX=400;
 int foodY=400;
 int bacSize = 15;

  /*preload="money bag.png"; */
 PImage money;
//boolean bAlive;

 public void setup()   
 {     

 	background(40);
 	//initialize bacteria variables here

money = loadImage("money bag.png");
money.resize(50,50);
 	size(800,800);

 	clique = new Bacteria[250];


	for(int i=0; i<clique.length; i++)
  {
    clique[i]= new Bacteria();
  } 

 }  



 public void draw()   
 {    

	background(40,50);
 	
 	
	for(int i=0; i<clique.length; i++)
		{

    clique[i].move();

    clique[i].show();
    clique[i].lookOut();

 		}  


 		//food
 		image(money,foodX,foodY);


}



 class Bacteria    
 {     
 	int myX, myY;
 	double cRandom = Math.random();
 	double bRandom = Math.random();
 	boolean bAlive;


 Bacteria()
 	{
 		myX = (int)(Math.random()*400)+200;
 		myY = (int)(Math.random()*400)+200;
 		
 	
					bAlive=true;
 	}
 





 	




public void  move()
		{



if(myX<foodX+25)
	myX = ((int)(Math.random()*5) -1) + myX;
else
	myX = ((int)(Math.random()*5) -3) + myX;

if(myY<foodY+25)
	myY = ((int)(Math.random()*5) -1) + myY;
else
	myY = ((int)(Math.random()*5) -3) + myY;



// reset
					
				if(keyPressed == true)
				{
					bAlive=true;
					if(bRandom < .25f)
					{
					myX = (int)(Math.random())-100;
					myY = (int)(Math.random()*800);		
					}
						

					else if(bRandom<.5f)
							{
					myX = (int)(Math.random())+900;
					myY = (int)(Math.random()*800);		
							}
								

					else if(bRandom <.75f)
								{
					myY = (int)(Math.random())-100;
					myX = (int)(Math.random()*800);
								}
									
					else 
							{
							 	myY = (int)(Math.random())+900;
							 	myX = (int)(Math.random()*800);
								}
									

}
}

public void lookOut()
{
	if(myX == foodX+25 && myY==foodY+25)
{
					bAlive=false;
					textSize(50);
					fill((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
					text("Here Comes The Money",50,50);
				}
}


 public void show()
 {

	

//color stuff
if(bAlive == true)
{
if(cRandom < .25f)
	fill(purple);
else if(cRandom<.5f)
	fill(red);
else if(cRandom <.75f)
	fill(green);
else 
	fill(yellow);


 //	fill(150,0,150,150);
 	ellipse(myX,myY,bacSize,bacSize);
 	noStroke();
 	fill(0,150,150,100);
 	ellipse(myX,myY,bacSize+(bacSize/2),bacSize+(bacSize/2));
 }
}


}


public void mousePressed()
{
foodX= mouseX-25;
foodY=mouseY-25;
}





//if(myX == foodX+25 && myY==foodY+25)
//{
				//	bAlive=false;
			//	}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
