package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/29.
 */
public class SerialTest extends Parent implements Serializable{
    int version = 66;

    Contain contain = new Contain();
    public int getVersion() {
        return version;
    }

    public static void main(String[] args) throws IOException{
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("temp.obj"));
        SerialTest serialTest = new SerialTest();
        objectOutputStream.writeObject(serialTest);

        objectOutputStream.flush();
        objectOutputStream.close();

    }
}
class Parent implements Serializable {
    int parentVersion = 10;
}
class Contain implements Serializable {
    int containVersion = 11;
}