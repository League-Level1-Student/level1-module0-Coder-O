

int rainY = 20;
double rainYAccel = 1;
int rainAccelMax = 5;
int randomNumber = (int) random(width);

void setup() {
  size(500, 500);
}

void draw() {
   
  background(20, 40, 60);
    fill(0, 30, 200);
    stroke(20, 30, 200);
    ellipse(randomNumber, rainY, 30, 40);
    rainY+= (int) rainYAccel;
    rainYAccel+= 0.25;
    if(rainY>= 500) {
      randomNumber = (int) random(width); 
      rainY = 20;
      rainYAccel = rainAccelMax;
      if(rainAccelMax <= 20){
        rainAccelMax++;
      }
    }
    if(rainYAccel>= 500) {
      rainYAccel = 20;
      
    }
   
}
