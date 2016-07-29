package serializable;

/**
 * Created by Administrator on 2016/7/29.
 */
public class PrivateCar {
    //private的成员变量：使用传统的类实例调用方式，只能在本类中访问
    private String color;
    //protected方法，是用传统的类实例调用方法，只能在子类和本包中访问
    protected void drive () {
        System.out.println("Drive private car ! The Color is: " + color);
    }
}
