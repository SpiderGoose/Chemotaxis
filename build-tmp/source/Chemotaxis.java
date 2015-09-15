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
 public void setup()   
 {     
 	background(150);
 	//initialize bacteria variables here   
 	size(1000,1000);
 	clique = new Bacteria[800];

	for(int i=0; i<clique.length; i++)

  {



    clique[i]= new Bacteria();
 }  

 	
 }   
 public void draw()   
 {    

 	background(150);

 	for(int i=0; i<clique.length; i++)

  {



    clique[i].move();

    clique[i].show();
 }  

}



 class Bacteria    
 {     
 	int myX, myY;
 Bacteria()
 	{
 		myX = 250;
 		myY = 250;

 	}

public void  move()
{
	myX = ((int)(Math.random()*5) -2) + myX;
	myY = ((int)(Math.random()*5)-2) + myY;
 }    
 public void show()
 {
 	fill(150,0,150,150);
 	ellipse(myX,myY,10,10);
 	noStroke();
 	fill(0,150,150,50);
 	ellipse(myX,myY,20,20);
 }
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
