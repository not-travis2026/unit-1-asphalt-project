import org.code.neighborhood.*;

public class EyesPainter extends PainterPlus {

  // Paint frog eyes
  public void paintEyes() {
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    paint("black");
    turnLeft();
    move(); 
    paint("black");
    turnRight();
     move();
    move();
    move();
    move();
    move();
    paint("black");
    turnRight();
    move();
    paint("black");
    moveFast();
    turnLeft();
    move();
    move();
  }
}