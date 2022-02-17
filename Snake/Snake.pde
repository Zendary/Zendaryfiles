ArrayList<Integer> x = new ArrayList<Integer>(), y = new ArrayList<Integer>(); //arraylist for the x and y position of the snake parts
int w=30;
int h=30;
int blocks = 20; //size of blocks
int direction = 2; //direction the snake starts moving, 0,1,2,3 in this case to the right
int foodx = 15; //line 6-7 size of food
int foody = 15;
boolean loss = false;
int[]xDirection={0,0,1,-1}; //right and left turn
int[]yDirection={1,-1,0,0}; //up and down turn

void setup(){
  size(600, 600); //size of the window 
  x.add(0);  // line14-15 start position of the snake
  y.add(15);
}

void draw(){
   background(0);
   fill(200,40,190);
   for(int i = 0; i< x.size(); i++) rect(x.get(i)*blocks, y.get(i)*blocks, blocks, blocks); //looping the blocks of the snakes
   if(!loss){ //creating food as long as the game is running
   fill(255); //Food color
   rect(foodx*blocks, foody*blocks,blocks,blocks); //Food
   
   textAlign(LEFT); //line24-30 sets the text for score on the screen
   textSize(25);
   fill(255);
   text("Score: "+ x.size(),30,30,width-20); 
   
   if(frameCount%5==0){ //speed of the snake
     x.add(0,x.get(0)+ xDirection[direction]); //line32-33 makes the snake longer when it eats
     y.add(0,y.get(0)+ yDirection[direction]);
   if(x.get(0) < 0 || y.get(0) < 0 || x.get(0) >= w || y.get(0) >= h) loss=true; //if you hit a wall = loss
   
   for (int i= 1; i<x.size(); i++) 
   if (x.get(0)==x.get(i)&& y.get(0)==y.get(i)) loss=true; //if the snake hits its own position = loss
   
   if(x.get(0)==foodx && y.get(0)== foody){//line39-41 places food randomly
     foodx = (int)random(0,w);
     foody = (int)random(0,h);
   }else{
     x.remove(x.size()-1); //line 43-44 removes a block when the snake moves, so it doesnt grow forever
     y.remove(y.size()-1);
   }
   }
   }else{
     fill(255);
     textSize(25);
     textAlign(CENTER);
     text("You Lose \n Your score is:"+ x.size()+ "\n Press ENTER to restart", width/2, height/3);
     if (keyCode == ENTER){//line52-58 resets the game on ENTER
       x.clear();
       y.clear();
       x.add(0);
       y.add(15);
       direction = 2;
       loss = false;
     }
   }
}

void keyPressed(){
 int newDirection = keyCode == DOWN? 0: (keyCode== UP?1:(keyCode == RIGHT? 2: (keyCode == LEFT?3:-1))); //move the snakes with the arrowkeys
 if (newDirection != -1) direction = newDirection;
}
