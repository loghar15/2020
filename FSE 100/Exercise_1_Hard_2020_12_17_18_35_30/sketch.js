function setup() {
  createCanvas(800, 600);
  c = color('rgba(13, 14, 41, 1)');
  background(c);
  strokeWeight(1);
  stroke('pink');
  fill('pink');
  
  quad(325,100,325,400,275,400,275,100);
  quad(325,200,325,275,525,100,450,100);
  quad(325,200,325,275,450,400,525,400);
  
  a = 0;
  b = 0;
  c = 0;
  d = 0;
  e = 0;
  f = 0;
  
  tryagain = createButton('Try Again');
  tryagain.position(590, 350);
  tryagain.mouseClicked(tryAgain);
  
  button = createButton('Finish');
  button.position(600, 400);
  button.mouseClicked(finish);
}

function draw() {
  
  if(mouseIsPressed == true)
  {
    c = color('rgba(14, 33, 171, 1)');
    stroke(c);
    strokeWeight(10);
    line(mouseX, mouseY, pmouseX, pmouseY);
      
  if(mouseX >= 275 && mouseX <= 325 && mouseY <= 100 && mouseY >= 110){
    a = 1;
    }
      
    else if(mouseX >= 275 && mouseX <= 325 && mouseY >= 390 && mouseY <= 400){
    b = 1;
    }
      
    else if(mouseX >= 275 && mouseX <= 325 && mouseY <= 200 && mouseY >= 225){
    c = 1;
    }
      
    else if(mouseX >= 450 && mouseX <= 525 && mouseY >= 100 && mouseY <= 120){
    d = 1;
    }
    
    else if(mouseX >= 450 && mouseX <= 525 && mouseY >= 380 && mouseY <= 400){
    e = 1;
    }
    
      sum = a + b + c + d + e;
 }
}

function tryAgain() {
  clear();
  createCanvas(800, 600);
  background(220);
  strokeWeight(1);
  stroke('gray');
  fill('gray');
  
  nextlevel.hide();
  
  quad(325,100,325,400,275,400,275,100);
  quad(325,200,325,275,525,100,450,100);
  quad(325,200,325,275,450,400,525,400);
  
  button = createButton('Finish');
  button.position(600, 400);
  button.mouseClicked(finish);
  

  a = 0;
  b = 0;
  c = 0;
  d = 0;
  e = 0;
  
}

function finish() {
  
  accuracy = sum * 20;
  textSize(32);
  strokeWeight(5);
  fill('white');
  text('Accuracy: ' + accuracy + '%', 50, 500);
    
  tryagain = createButton('Try Again');
  tryagain.position(590, 350);
  tryagain.mouseClicked(tryAgain);
  
  complete = createButton('Complete Exercise');
  complete.position(570, 400);
  complete.mouseClicked(Complete);
  
}

function Complete() {
  window.open('https://editor.p5js.org/jlharr38/present/E5ViAS5HK','_self');
}