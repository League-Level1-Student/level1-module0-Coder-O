
int score = 0;
int rainY = 20;
double rainYAccel = 1;
int rainAccelMax = 5;
int randomNumber = (int) random(width);
boolean scoreUp = false;

void setup() {
  size(500, 500);
}

void draw() {
   scoreUp = false;
  background(20, 40, 60);
    fill(0, 30, 200);
    stroke(20, 30, 200);
    ellipse(randomNumber, rainY, 30, 40);
    fill(200, 100, 0);
    rect(mouseX, 445, 100, 50);
    rainY+= (int) rainYAccel;
    rainYAccel+= 0.25;
    if (randomNumber > mouseX && randomNumber < mouseX+100 && rainY >= 445) {
       score++;
       scoreUp = true;
    }
    else if (score > 0 && rainY >= 499) {
       score--;
    }
    println("Your score is now: " + score);
    
    if(rainY>= 500 || (rainY >= 445 && scoreUp)) {
      randomNumber = (int) random(width); 
      rainY = 20;
      rainYAccel = rainAccelMax;
      if(rainAccelMax <= 15){
        rainAccelMax++;
      }
    }
    if(rainYAccel>= 500) {
      rainYAccel = 20;
      
    }
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
   
}
