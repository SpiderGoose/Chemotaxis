 //declare bacteria variables here

 Bacteria  [] clique;
 color purple = color(61, 0, 153,150);
 color yellow = color(207, 207, 0,150);
 color green = color(0, 138, 46,150);
 color red = color(147, 0, 0,150);

 void setup()   
 {     
 	background(150);
 	//initialize bacteria variables here   
 	size(800,800);
 	clique = new Bacteria[400];

	for(int i=0; i<clique.length; i++)

  {

    clique[i]= new Bacteria();
 }  


 	
 }   
 void draw()   
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

 	double cRandom = Math.random();

 	double bRandom = Math.random();
 Bacteria()
 	{
 		
 		myX = (int)(Math.random()*400)+200;
 		myY = (int)(Math.random()*400)+200;

 	}

void  move()
{

if(myX<mouseX)
	myX = ((int)(Math.random()*5) -1) + myX;
else
	myX = ((int)(Math.random()*5) -3) + myX;

if(myY<mouseY)
	myY = ((int)(Math.random()*5) -1) + myY;
else
	myY = ((int)(Math.random()*5) -3) + myY;



// reset
if(myX == mouseX && myY==mouseY)
{

if(bRandom < .25)
{
	myX = (int)(Math.random())-100;
	myY = (int)(Math.random()*800);
 		

}
	
else if(bRandom<.5)
{
	myX = (int)(Math.random())+900;
	myY = (int)(Math.random()*800);
 		

}
	
else if(bRandom <.75)
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



	//myX = ((int)(Math.random()*5) -2) + myX;
	//myY = ((int)(Math.random()*5)-2) + myY;
 }    
 void show()
 {



//color stuff

if(cRandom < .25)
	fill(purple);
else if(cRandom<.5)
	fill(red);
else if(cRandom <.75)
	fill(green);
else 
	fill(yellow);


 //	fill(150,0,150,150);
 	ellipse(myX,myY,10,10);
 	noStroke();
 	fill(0,150,150,50);
 	ellipse(myX,myY,20,20);
 }
}


