package Classes.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args){
        Person person1 = new Person(1,"Koly");
        Person person2 = new Person(2, "Misha");

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\Test2\\src\\Classes\\Serilith\\people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
