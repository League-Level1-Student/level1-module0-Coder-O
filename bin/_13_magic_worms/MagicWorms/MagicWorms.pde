


float x = 0;
float y = 0;



void setup() {
  size(500,500);
  background(100,100,200);
  
  
}

void draw() {
  makeMagical();
  for(int i = 0; i<1000; i++){
    fill(frameCount,i,100);
    x= random(500);
    y= random(500);
    ellipse(getWormX(i),getWormY(i),1,1);
  }
}

float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
