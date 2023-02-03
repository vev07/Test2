package Classes.Serializable;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {


    FileInputStream fis;


            try {
                fis = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\Test2\\src\\Classes\\Serilith\\people.bin");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Person person1 = (Person) ois.readObject();
                Person person2 = (Person) ois.readObject();
                System.out.println(person1);
                System.out.println(person2);
                ois.close();


            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);

        }
    }
}
