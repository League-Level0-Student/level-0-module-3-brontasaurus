void setup(){ 
  size(300,300);
}

void draw(){
  for(int v=8; v>=1; v--) {
     if (v % 2 == 0) {
          fill(#F00202);
      }
      else {
        fill(#030000);
      }
    
  ellipse(width/2, height/2, 20*v, 20*v);
}
}
