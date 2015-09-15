 //declare bacteria variables here

 Bacteria  [] clique;
 void setup()   
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
 Bacteria()
 	{
 		myX = 250;
 		myY = 250;

 	}

void  move()
{
	myX = ((int)(Math.random()*5) -2) + myX;
	myY = ((int)(Math.random()*5)-2) + myY;
 }    
 void show()
 {
 	fill(150,0,150,150);
 	ellipse(myX,myY,10,10);
 	noStroke();
 	fill(0,150,150,50);
 	ellipse(myX,myY,20,20);
 }
}


