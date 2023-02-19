PImage src;

void setup() {
  size(1500, 900);
  src = loadImage("northkoreaninteriors6-1.jpg");
}

void draw() {
  background(0);
  
  image(src,0,0);

  int sx = mouseX;
  int sy = mouseY;
  int sw = 300;
  int sh = 300;

  int dx = mouseX;
  int dy = mouseY;
  int dw = 500;
  int dh = 500;

  copy(src, sx, sy, sw, sh, dx, dy, dw, dh);
}
