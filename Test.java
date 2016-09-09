import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test
{
public static void main(String args[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
{
String x="ClickLink";

Method method=Test.class.getMethod(x,String.class);
method.invoke(method, "null");

System.out.println("The END");

}

public static void ClickLink(String x)
{
System.out.println("Link Clicked");
}

}