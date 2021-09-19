DiceCup dc = new DiceCup();

void setup() {
  size(1600, 900);

  rectMode(CENTER);

  dc.addDie();

  dc.shake();
 
}
void draw() {
  dc.draw(75, 75, 100);
}
void keyPressed() {

  if (key==ENTER){
  dc.shake();
  clear();
  }
  dc.draw(75, 75, 100); 
  if (key=='a')
    dc.addDie();
}
