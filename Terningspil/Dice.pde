class Dice {
  color dieColor;
  color eyeColor;
  int rollInt = 6;

  public Dice(color dieColor, color eyeColor) {
    this.dieColor = dieColor;
    this.eyeColor = eyeColor;
  }
  public void roll() {
    rollInt = (int)random(1, 7);
  }

  public void draw(int x, int y, int size) {
    fill(dieColor);
    rect(x, y, size, size);
    fill(eyeColor);

    switch(rollInt) {
    case 1:
      circle(x, y, 20);
      break;
    case 2:
      circle(x-(size/4), y-(size/4), 20);
      circle(x+(size/4), y+(size/4), 20);
      break;
    case 3:
      circle(x-(size/4), y-(size/4), 20);
      circle(x+(size/4), y+(size/4), 20);
      circle(x, y, 20);
      break;
    case 4:
      circle(x-(size/4), y-(size/4), 20);
      circle(x+(size/4), y+(size/4), 20);
      circle(x-(size/4), y+(size/4), 20);
      circle(x+(size/4), y-(size/4), 20);
      break;
    case 5:
      circle(x-(size/4), y-(size/4), 20);
      circle(x+(size/4), y+(size/4), 20);
      circle(x-(size/4), y+(size/4), 20);
      circle(x+(size/4), y-(size/4), 20);
      circle(x, y, 20);
      break;
    case 6:
      circle(x-(size/4), y-(size/4), 20);
      circle(x+(size/4), y+(size/4), 20);
      circle(x-(size/4), y+(size/4), 20);
      circle(x+(size/4), y-(size/4), 20);
      circle(x, y-(size/4), 20);
      circle(x, y+(size/4), 20);
      break;
    }
  }
}




/*Die terning1 = new Die(0, 255);
 terning1.roll();
 println(terning1.roll());
 */
