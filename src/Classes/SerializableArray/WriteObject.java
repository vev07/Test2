package Classes.SerializableArray;

import Classes.Serializable.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObject {
    public static void main(String[] args) {

        Person[] people = {new Person(1, "Luda"), new Person(2, "Sveta"), new Person(3, "Iryna")};

        try {
            FileOutputStream fos = new FileOutputStream("super.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
