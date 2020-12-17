let button;
var link;

function setup() {
  
  //background setup to look like the GUI
  createCanvas(800, 600);
  bgcolor = color('rgba(13, 14, 41, 1)');
  background(bgcolor);
  strokeWeight(1);
  stroke('pink');
  fill('pink');

  textSize(30);
  strokeWeight(0);
  fill('white');
  text("Welcome to the Tracing Exercise!", 150, 60);
  
  textSize(20);
  text("Click Begin to start", 300, 200);

  //Creating the button to start the first exercise
  button = createButton('Begin');
  button.position(350, 300);
  button.mousePressed(begin);
  
}

//Button leads to a new sketch for Exercise 1
function begin() 
{
  window.open('https://editor.p5js.org/jlharr38/present/eHSssS45o','_self');
}

