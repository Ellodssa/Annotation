import java.lang.reflect.Method;

public class TestMyPoint {
  public static void main(String[] args) throws Exception {

    MyPoint start = new MyPoint();
    MyPoint end = new MyPoint();

    start.x = 10;
    start.y = 10;
    end.x = 20;
    end.y = 30;

    System.out.print("Start point is ");
    start.toString(start);
    System.out.print("End point is ");
    end.toString(end);

    MyPoint stray = end;


    System.out.print("Stray point is ");
    stray.toString(stray);
    System.out.print("End point is ");
    end.toString(end);

    stray.x = 47;
    stray.y = 50;

    System.out.print("Stray point is ");
    stray.toString(stray);
    System.out.print("End point is ");
    end.toString(end);
    System.out.print("Start point is ");
    start.toString(start);
  }

}

    
