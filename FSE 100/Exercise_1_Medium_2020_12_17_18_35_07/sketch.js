function setup() {
  
    //Background color matches the GUI
  createCanvas(800, 600);
  bgcolor = color('rgba(13, 14, 41, 1)');
  background(bgcolor);
  strokeWeight(1);
  stroke('pink');
  fill('pink');
  
    //Building the letter 'H'
  quad(325,100,325,400,275,400,275,100);
  quad(525,100,525,400,475,400,475,100);
  quad(275,275,275,225,525,225,525,275);
  
  a = 0;
  b = 0;
  c = 0;
  d = 0;
  e = 0;
  f = 0;
  
    //Creating the buttons to try again and to finish 
  tryagain = createButton('Try Again');
  tryagain.position(590, 350);
  tryagain.mouseClicked(tryAgain);
  
  button = createButton('Finish');
  button.position(600, 400);
  button.mouseClicked(finish);
}

function draw() {
  
    //Drawing the line...
  if(mouseIsPressed == true)
  {
    bgcolor = color('rgba(14, 33, 171, 1)');
    stroke(bgcolor);
    strokeWeight(10);
    line(mouseX, mouseY, pmouseX, pmouseY);
    
    
    //The program calculates whether or not the user hit the assigned "points". If they did, the points will equal 1 and be added together in the "sum".
   if(mouseX >= 275 && mouseX <= 325 && mouseY <= 110 && mouseY >= 100){
    a = 1;
    }
      
    else if(mouseX >= 275 && mouseX <= 325 && mouseY >= 400 && mouseY <= 390){
    b = 1;
    }
      
    else if(mouseX >= 475 && mouseX <= 525 && mouseY <= 110 && mouseY >= 100){
    c = 1;
    }
      
    else if(mouseX >= 475 && mouseX <= 525 && mouseY >= 400 && mouseY <= 390){
    d = 1;
    }
    
    else if(mouseX >= 275 && mouseX <= 285 && mouseY >= 225 && mouseY <= 275){
    e = 1;
    }
    
    else if(mouseX >= 515 && mouseX <= 525 && mouseY >= 225 && mouseY <= 275){
    f = 1;
    }
  }
      sum = a + b + c + d + e + f;
}

//When the user decides to finish, the program calculates the accuracy and allows the user to retry or to move on to the next activity
function finish(){
  
  accuracy = sum * 20;
  textSize(32);
  strokeWeight(5);
  fill('white');
  text('Accuracy: ' + accuracy + '%', 50, 500);
    
  tryagain = createButton('Try Again');
  tryagain.position(590, 350);
  tryagain.mouseClicked(tryAgain);
  
  nextlevel = createButton('Next Level');
  nextlevel.position(590, 400);
  nextlevel.mouseClicked(nextLevel);
  
}

//Try again resets the exercise
function tryAgain(){
    clear();
  createCanvas(800, 600);
  bgcolor = color('rgba(13, 14, 41, 1)');
  background(bgcolor);
  strokeWeight(1);
  stroke('pink');
  fill('pink');
  
  nextlevel.hide();
  
  quad(325,100,325,400,275,400,275,100);
  quad(525,100,525,400,475,400,475,100);
  quad(275,275,275,225,525,225,525,275);
  
  button = createButton('Finish');
  button.position(600, 400);
  button.mouseClicked(finish);
  

  a = 0;
  b = 0;
  c = 0;
  d = 0;
  e = 0;
  f = 0;
  
}

//Goes to the next exercise 
function nextLevel() {
  window.open('https://editor.p5js.org/jlharr38/present/gFicJyVvL', '_self');
}
