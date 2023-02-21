PImage img; 

void setup(){
 size(900,900); 
 img = loadImage("showimg_wkr05_full.jpg");
 background(0);
}

void draw(){
  
  
  push();
  translate(width/2,height/2);
  
  int sx = 0;
  int sy = int(map(sin(radians(frameCount*0.9)),-1,1,10,img.height-10));
  int sw = int(width);
  int sh = 20;
  
  int dx = 0;
  int dy = 0;
  int dw = int(width*0.4);
  int dh = 20;
  
  rotate(radians(frameCount));
  translate(width*0.05,0);
  copy(img,sx,sy,sw,sh,dx,dy,dw,dh);
  
  pop();
}
