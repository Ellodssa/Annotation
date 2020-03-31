import java.lang.reflect.Method;


public class MyPoint {


  public int x;
  public int y;

  public void toString(MyPoint object)  {
    Class<?> clazz = object.getClass();
    Method[] methods = clazz.getMethods();
    for (Method method : methods) {
      if (method.isAnnotationPresent(Incrementation.class)) {

        System.out.println("[" + (object.getX() + 1)+ ","  + object.getY() + "]" );
      }
    }
    //return ("[" + x + "," + y + "]");
  }

  @Incrementation
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }
}

