package AppLaunch;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Class c= Atest.class;
		
		Object obj= c.newInstance();
		
		try {
			Method m = c.getDeclaredMethod("getName", null);
			
			m.setAccessible(true);
			try {
				m.invoke(obj, null);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}