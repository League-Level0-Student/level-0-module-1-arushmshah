void setup(){
  size(400, 500);
  PImage face = loadImage("trump 2.png");
  image(face, 0,0);
}




void draw(){
  if(mousePressed){
    println(mouseX+" "+mouseY);
  }
  fill(mouseX, mouseY, 255);
   ellipse(131, 169, 62, 42);
    ellipse(250, 170, 62, 42);
}