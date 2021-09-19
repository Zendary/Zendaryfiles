class DiceCup {
  int pos = 0;
  Dice[] dice = new Dice[100];


  ArrayList<Dice>eyeOneList = new ArrayList<Dice>();
  ArrayList<Dice>eyeTwoList = new ArrayList<Dice>();
  ArrayList<Dice>eyeThreeList = new ArrayList<Dice>();
  ArrayList<Dice>eyeFourList = new ArrayList<Dice>();
  ArrayList<Dice>eyeFiveList = new ArrayList<Dice>();
  ArrayList<Dice>eyeSixList = new ArrayList<Dice>();



  public DiceCup() {
  }
  void addDie() {
    dice[pos] = new Dice((int)random(0, 149), (int)random(150, 256));
    pos++;
  }
  void shake() {
    empty(eyeOneList);
    empty(eyeTwoList);
    empty(eyeThreeList);
    empty(eyeFourList);
    empty(eyeFiveList);
    empty(eyeSixList);



    for (int i=0; i<dice.length; i++) {
      if (dice[i]!=null) {

        dice[i].roll();
      }
    }
    sort();
  }

  void empty(ArrayList<Dice> list) {
    for (int i = 0; i < list.size(); i++) {
      list.remove(i);
    }
  }


  void sort () {


    for (int i=0; i<dice.length; i++) {

      if (dice[i] != null) {
        if (dice[i].rollInt==1) {
          eyeOneList.add(dice[i]);
        }
        if (dice[i].rollInt==2) {
          eyeTwoList.add(dice[i]);
        }
        if (dice[i].rollInt==3) {
          eyeThreeList.add(dice[i]);
        }
        if (dice[i].rollInt==4) {
          eyeFourList.add(dice[i]);
        }
        if (dice[i].rollInt==5) {
          eyeFiveList.add(dice[i]);
        }
        if (dice[i].rollInt==6) {
          eyeSixList.add(dice[i]);
        }
      }
    }
  }

  void draw(int x, int y, int size) {
    background(255);
    //int xPos = x;
    int yPos = y;


    for (int i=0; i<eyeOneList.size(); i++) {
      if (eyeOneList.get(i)!=null) {
        eyeOneList.get(i).draw(x, yPos, size);
        yPos=yPos+size+(size/2);
        println(yPos + " " + x);
        if (yPos> height) {
          yPos = 75; 
          x = x+175;
        }
      }
      for (int j=0; j<eyeTwoList.size(); j++) {
        if (eyeTwoList.get(j)!=null) {
          eyeTwoList.get(j).draw(x, yPos, size);
          yPos=yPos+size+(size/2);
          if (yPos> height) {
            yPos = 75; 
            x = x+175;
          }
        }
      }
      for (int k=0; k<eyeThreeList.size(); k++) {
        if (eyeThreeList.get(k)!=null) {
          eyeThreeList.get(k).draw(x, yPos, size);
          yPos=yPos+size+(size/2);
          if (yPos> height) {
            yPos = 75; 
            x = x+175;
          }
        }
      }
      for (int h=0; h<eyeFourList.size(); h++) {
        if (eyeFourList.get(h)!=null) {
          eyeFourList.get(h).draw(x, yPos, size);
          yPos=yPos+size+(size/2);
          if (yPos> height) {
            yPos = 75; 
            x = x+175;
          }
        }
      }
      for (int g=0; g<eyeFiveList.size(); g++) {
        if (eyeFiveList.get(g)!=null) {
          eyeFiveList.get(g).draw(x, yPos, size);
          yPos=yPos+size+(size/2);
          if (yPos> height) {
            yPos = 75; 
            x = x+175;
          }
        }
      }
      for (int f=0; f<eyeSixList.size(); f++) {
        if (eyeSixList.get(f)!=null) {
          eyeSixList.get(f).draw(x, yPos, size);
          yPos=yPos+size+(size/2);
          if (yPos> height) {
            yPos = 75; 
            x = x+175;
          }
        }
      }
    }


    /*for (int i=0; i<dice.length; i++) {
     
     
     if (dc.dice[i]!=null) {
     dc.dice[i].draw(x, yPos, size);
     yPos=yPos+size+(size/2);
     if (yPos> height) {
     yPos = 75; 
     x = x+175;
     }
     }*/
  }
}
