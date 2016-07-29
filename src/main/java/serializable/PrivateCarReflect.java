package serializable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/7/29.
 */
public class PrivateCarReflect {
    public static void main(String[] args) throws Throwable {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("serializable.PrivateCar");
        PrivateCar pCar = (PrivateCar)clazz.newInstance();

        Field colorFld = clazz.getDeclaredField("color");
        colorFld.setAccessible(true);
        colorFld.set(pCar, "Red");

        Method driveMtd = clazz.getDeclaredMethod("drive", (Class[])null);

        driveMtd.setAccessible(true);
        driveMtd.invoke(pCar,(Object[])null);
    }
}
