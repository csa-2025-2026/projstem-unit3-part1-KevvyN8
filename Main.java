import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Rectangle r1 = new Rectangle(2.8,5.4);
    Rectangle r2 = new Rectangle(5.4,2.8);


    boolean lengthSameWidth = r1.getLength() == r2.getWidth();
    boolean widthSameLength =  r1.getWidth() == r2.getLength();
    boolean isRotated = lengthSameWidth && widthSameLength;


    boolean isCongruent = r1.equals(r2) || (isRotated == true);

    boolean lengthRatio = (r1.getLength()/r2.getLength());
    boolean widthRatio = (r1.getWidth()/r2.getWidth());
    boolean equalRatio = (lengthRatio == widthRatio);
    boolean isSimilar = (isCongruent == true) || (equalRatio == true);




  }
}
