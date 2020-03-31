import java.lang.reflect.Method;




public class MyPoint {


  public int x;
  public int y;

  public void toString(MyPoint object) throws Exception  {
    int a = 0, b = 0;
    Class<?> clazz = object.getClass();
    Method[] methods = clazz.getMethods();
    for (Method method : methods) {
      if (method.isAnnotationPresent(Incrementation.class)) {
        if (method.getName().equals("getX")) {
          a = (((Number)method.invoke(object)).intValue() + 1);
        } else b = (((Number)method.invoke(object)).intValue() + 1);
      }
      if (method.isAnnotationPresent(isntIncrementation.class)) {
        if (method.getName().equals("getY")) {
          b = (((Number)method.invoke(object)).intValue());
        } else a = (((Number)method.invoke(object)).intValue());
      }
    }
    System.out.println("[" + a + "," + b + "]");
    //Изменил способ вывода, что бы не нарущать логику работы лабы.
  }

  @Incrementation
  public int getX() {
    return x;
  }

  @isntIncrementation
  public int getY() {
    return y;
  }

}

