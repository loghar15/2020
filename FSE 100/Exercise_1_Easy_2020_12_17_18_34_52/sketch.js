function setup() {
  
  //Background color matches the GUI
 createCanvas(800, 600);
  bgcolor = color('rgba(13, 14, 41, 1)');
  background(bgcolor);
  strokeWeight(1);
  stroke('pink');
  fill('pink');
  
  //Building the letter 'A'
  quad(350,100,400,100,300,400,250,400);
  quad(350,100,400,100,500,400,450,400);
  quad(300,250,284,300,467,300,450,250);
  
  a = 0;
  b = 0;
  c = 0;
  d = 0;
  e = 0;
  
  //Creating the buttons to try again and to finish 
  tryagain = createButton('Try Again');
  tryagain.position(590, 350);
  tryagain.mouseClicked(tryAgain);
  
  button = createButton('Finish');
  button.position(600, 400);
  button.mouseClicked(finish);
}


function draw() 
{
  //Drawing the line...
  if(mouseIsPressed == true)
  {
    bgcolor = color('rgba(14,33,171,1)');
    stroke(bgcolor);
    strokeWeight(10);
    line(mouseX, mouseY, pmouseX, pmouseY);
    
    //The program calculates whether or not the user hit the assigned "points". If they did, the points will equal 1 and be added together in the "sum".
    if(mouseX >= 250 && mouseX <= 300 && mouseY <= 396 && mouseY >= 386){
    a = 1;
    }
      
    else if(mouseX >= 350 && mouseX <= 400 && mouseY >= 100 && mouseY <= 110){
    b = 1;
    }
      
    else if(mouseX >= 450 && mouseX <= 500 && mouseY <= 396 && mouseY >= 386){
    c = 1;
    }
      
    else if(mouseX >= 284 && mouseX <= 300 && mouseY >= 250 && mouseY <= 300){
    d = 1;
    }
    
    else if(mouseX >= 450 && mouseX <= 467 && mouseY >= 250 && mouseY <= 300){
    e = 1;
    }
  }
  else{
  
  }
      sum = a + b + c + d + e;
  
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
    
  quad(350,100,400,100,300,400,250,400);
  quad(350,100,400,100,500,400,450,400);
  quad(300,250,284,300,467,300,450,250);

  nextlevel.hide();
  
  button = createButton('Finish');
  button.position(600, 400);
  button.mouseClicked(finish);
  

  a = 0;
  b = 0;
  c = 0;
  d = 0;
  e = 0;
  accuracy = 0;
  
  if(mouseIsPressed == true)
  {
    bgcolor = color('rgba(14,33,171,1)');
    stroke(bgcolor);
    strokeWeight(10);
    line(mouseX, mouseY, pmouseX, pmouseY);
    
    if(mouseX >= 250 && mouseX <= 300 && mouseY <= 396 && mouseY >= 386){
    a = 1;
    }
      
    else if(mouseX >= 350 && mouseX <= 400 && mouseY >= 100 && mouseY <= 110){
    b = 1;
    }
      
    else if(mouseX >= 450 && mouseX <= 500 && mouseY <= 396 && mouseY >= 386){
    c = 1;
    }
      
    else if(mouseX >= 284 && mouseX <= 300 && mouseY >= 250 && mouseY <= 300){
    d = 1;
    }
    
    else if(mouseX >= 450 && mouseX <= 467 && mouseY >= 250 && mouseY <= 300){
    e = 1;
    }
  }
  else{
  
  }
      sum = a + b + c + d + e;
  
}

//Goes to the next exercise 
function nextLevel(){
  window.open('https://editor.p5js.org/jlharr38/present/4gWKETTYf', '_self');
}

