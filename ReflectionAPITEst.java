import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAPITEst {

	

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String x="sampleTest";
		
		Method method=ReflectionAPITEst.class.getMethod(x,String.class);
		method.invoke(method, "hello");
		

	}
	public static void sampleTest(String x)
	{
		System.out.println("this is somthing reflection API");
	}

}
