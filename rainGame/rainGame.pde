
int score = 0;
int x;
int y = 0;
int counter=0;
int xPos;
int yPos;

void setup(){
size(500,500);
background(206,200,200);
}

void draw(){
xPos = mouseX;
yPos = mouseY;
if(mousePressed){
rect( xPos,  yPos, 75, 100);
counter++;
}


if(y==height){
  y=0;
  x = (int) random(width);
  background(206,200,200);
}else if(y!=height){
  background(206,200,200);
}

 fill(0,146,211);
 stroke(20,40,150);
 ellipse(x,y+=20,10,20);

}


void checkCatch(int x){
 
     if (xPos > mouseX && xPos < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     
     println("Your score is now: " + score); 
     fill(100, 100, 100);
     textSize(30);
     text("Score: " + score, width/2, height/2);
    

}
