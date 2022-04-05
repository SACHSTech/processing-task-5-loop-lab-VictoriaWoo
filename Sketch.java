import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// size call
    size(1200, 600);
  }

  // initial set up values
  public void setup() {
    background(45, 150, 207);
  }

  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow+=10){
      for(int intColumn = 0; intColumn < 300; intColumn+=10){
        intX = 3 + intRow;
        intY = 300 + 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section2(){

    int intX2 = 0;
    int intY2 = 0;

    for(int intRow2 = 0; intRow2 < 300; intRow2 += 10){
      for(int intColumn2 = 0; intColumn2 < 300; intColumn2 += 10){
        intX2 = 300 + 3 + intRow2;
        intY2 = 300 + 3 + intColumn2;

        if(intRow2 % 20 == 0){
          fill(255);
          noStroke();
          rect(intX2, intY2, 5, 5);
      }
        else{
          fill(0);
          noStroke();
          rect(intX2, intY2, 5, 5);
        }
      }
    }
  }

  public void draw_section3(){

    int intX3 = 0;
    int intY3 = 0;

    for(int intRow3 = 0; intRow3 < 300; intRow3 += 10){
      for(int intColumn3 = 0; intColumn3 < 300; intColumn3 += 10){
        intX3 = 600 + 3 + intRow3;
        intY3 = 300 + 3 + intColumn3;

        if(intColumn3 % 20 == 0){
          fill(0);
          noStroke();
          rect(intX3, intY3, 5, 5);
        }
        else{
          fill(255);
          noStroke();
          rect(intX3, intY3, 5, 5);
        }
      }
    }
  }

  public void draw_section4(){
    int intX4 = 0;
    int intY4 = 0;

    for(int intRow4 = 0; intRow4 < 300; intRow4 += 10){
      for(int intColumn4 = 0; intColumn4 < 300; intColumn4 += 10){
        intX4 = 900 + 3 + intRow4;
        intY4 = 300 + 3 + intColumn4;

        if(intColumn4 % 20 == 0 || intRow4 % 20 !=0){
          fill(0);
          noStroke();
          rect(intX4, intY4, 5, 5);
        }
        else{
          fill(255);
          noStroke();
          rect(intX4, intY4, 5, 5);
        }
      }
    }
  }

  public void draw_section5(){
    int intX5 = 0;
    int intY5 = 0;
 
    for(int intColumn5 = 0; intColumn5 < 300; intColumn5 += 10){
     for(int intRow5 = 300 - intColumn5; intRow5 < 300; intRow5 += 10){
       intX5 = intRow5 + 3;
       intY5 = intColumn5 + 3;
 
       fill(255);
       noStroke();
       rect(intX5, intY5, 5, 5);
     }
    }
  }

  public void draw_section6(){
    int intX6 = 0;
    int intY6 = 0;
 
    for(int intColumn6 = 0; intColumn6 <= 300; intColumn6 += 10){
     for(int intRow6 = 0; intRow6 < intColumn6; intRow6 +=10){
       intX6 = intRow6 + 3 + 300;
       intY6 = intColumn6 - 3 - 4;
 
       fill(255);
       noStroke();
       rect(intX6, intY6, 5, 5);
     }
    }
  }

  public void draw_section7(){
  int intX7 = 0;
  int intY7 = 0;

  for(int intColumn7 = 0; intColumn7 < 300; intColumn7 += 10){
    for(int intRow7 = 300 - intColumn7; intRow7 > 0; intRow7 -= 10){
      intX7 = intRow7 - 3 -5 + 600;
      intY7 = intColumn7 + 3;

      fill(255);
      noStroke();
      rect(intX7, intY7, 5, 5);
    }
   }
  }
  
  public void draw_section8(){
    int intX8 = 0;
    int intY8 = 0;
 
    for(int intRow8 = 0; intRow8 <= 300; intRow8 += 10){
     for(int intColumn8 = 0; intColumn8 <= intRow8; intColumn8 +=10){
       intX8 = intRow8 + 3+ 900;
       intY8 = intColumn8 + 3;
 
       fill(255);
       noStroke();
       rect(intX8, intY8, 5, 5);
     }
    }
  }
}
