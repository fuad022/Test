import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class Mapper {
    private static <T> T toObject(Class<T> cl, Map<String, String> data) throws InvocationTargetException,
                                                                                IllegalAccessException,
                                                                                SecurityException,
                                                                                InstantiationException {
        T o = cl.newInstance();
        for (Method method : cl.getDeclaredMethods()) {
            if (method.getName().startsWith("set")) {
                String fname = method.getName().substring(3).toLowerCase();
                String receivedValue = data.get(fname);
                method.invoke(o, receivedValue);
            }
        }
        return o;
    }
}
