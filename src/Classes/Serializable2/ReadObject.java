package Classes.Serializable2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("PM.bin"))) {

            Person person1 = (Person) ois.readObject();
            System.out.println(person1);
            Person person2 = (Person) ois.readObject();
            System.out.println(person2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
