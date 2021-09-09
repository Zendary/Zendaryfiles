color red = color(255,0,0);
color yellow = color(255,255,0);
color green = color(0,255,0);
color grey = color(180,180,180);
color white = color(255,255,255);
  int count=0;

void setup(){
size(400,400);
background(255);
frameRate(1);
}
void draw(){
//for(int i=0;i<=50;i++){
println(count);
if (count%2==0){
fill(white);
rect(50,50,100,300);
fill(grey);
circle(100,100,100);
fill(yellow);
circle(100,200,100);
fill(green);
circle(100,300,100);
count++;
}
else {
fill(white);
rect(50,50,100,300);
fill(red);
circle(100,100,100);
fill(yellow);
circle(100,200,100);
fill(grey);
circle(100,300,100);
count++;
}
}
