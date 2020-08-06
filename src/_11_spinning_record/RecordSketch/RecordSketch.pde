import ddf.minim.*;

Minim minim;
AudioPlayer song;
PImage pictureOfRecord;
int xPosition = 0;
int yPosition = 0;
int imageAngle = 0;
double imageAngleAccel = 1;
void setup() {
  size(600,600);
  pictureOfRecord = loadImage("record.png");
  pictureOfRecord.resize(height, width);
  minim = new Minim(this);
  song = minim.loadFile("awesomeTrack.mp3", 512);
}

void draw() {
  rotateImage(pictureOfRecord, imageAngle);
  image(pictureOfRecord, xPosition, yPosition);
  if(mousePressed){
    song.play();
    imageAngle+= (int) imageAngleAccel;
    if(imageAngleAccel <= 30){
       imageAngleAccel += 1; 
    } else if(imageAngleAccel <=50){
      imageAngleAccel +=3;
    } else {
      imageAngleAccel += imageAngleAccel;
    }
  }
  else {
    imageAngleAccel = 0;
    song.pause();
  }
}

void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
  }
