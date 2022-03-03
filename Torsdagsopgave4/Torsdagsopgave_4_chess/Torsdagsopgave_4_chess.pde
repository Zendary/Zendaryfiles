int count=0;

void setup() {
  size(640, 640);
}
void draw() {
  for (int i=0; i<=7; i++) {
    if (count%2==0) {
      fill(0);
      count++;
    } else {
      fill(255);
      count++;
    }
    for (int j=0; j<=7; j++) {
      square(i*80, j*80, 80);
      if (count%2==0) {
        fill(0);
        count++;
      } else {
        fill(255);
        count++;
      }
    }
  }
}
