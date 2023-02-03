package Classes.Serializable2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1,"Galina");
        Person person2 = new Person(2, "Lusy");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("PM.bin"))) {
            oos.writeObject(person1);
            oos.writeObject(person2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
