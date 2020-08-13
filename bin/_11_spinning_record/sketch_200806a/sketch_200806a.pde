PImage pictureOfRecord;
int xPosition = 0;
int yPosition = 0;
setup(); {
  size(600,600);
  pictureOfRecord = loadImage("record.png");
  pictureOfRecord.resize(height, width);
}

draw(); {
  image(pictureOfRecord, xPosition, yPosition);
}

void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
   }
