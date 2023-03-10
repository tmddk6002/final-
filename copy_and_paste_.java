
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class copy_and_paste_ extends PApplet {

PImage src;

public void setup() {
 
  src = loadImage("northkoreaninteriors6-1.jpg");
}

public void draw() {
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


  public void settings() { size(1500, 900); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "copy_and_paste_" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
