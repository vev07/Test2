package New;

import Classes.Serializable2.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\" +
                    "Test2\\src\\New\\People.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                Person person1 = (Person) objectInputStream.readObject();
                Person person2 = (Person) objectInputStream.readObject();
            System.out.println(person1);
            System.out.println(person2);
            objectInputStream.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
