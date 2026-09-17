import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
BackgroundPainter josh = new BackgroundPainter();
    josh.setPaint(12 * 12);
    josh.paintBackground("aqua", 12);

FrogPainter jos = new FrogPainter();
    jos.setPaint(12 * 12);
    jos.paintFrog();

EyesPainter jo = new EyesPainter();
    jo.setPaint(4);
    jo.paintEyes();
  }
}