package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/***
 * 阿里面试
 * Java对象的序列化
 * @author xiekai
 *
 */
public class ObjectSaver {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			//序列化对象
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:\\work_eclipse\\Serializable\\objectFile.obj"));
			
			Customer customer = new Customer("xiekai", 24);
			out.writeObject("Hello");
			out.writeObject(new Date());
			out.writeObject(customer);
			out.close();
			
			//反序列化
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\work_eclipse\\Serializable\\objectFile.obj"));
			System.out.println("Obj1 " + (String)in.readObject());
			System.out.println("Obj2 " + (Date)in.readObject());
			Customer obj3 = (Customer) in.readObject();
			System.out.println("Obj3 " + obj3);
			in.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class Customer implements Serializable {
	private String name;
	private int age;
	
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
}
