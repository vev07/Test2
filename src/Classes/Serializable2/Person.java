package Classes.Serializable2;

import java.io.Serializable;

public class Person implements Serializable {



    private static final long serialVersionUID = 2130111022382853634L; // It Version class if you change field, you must change serial

    private transient int id; //  if transient in put change this change doesn't use
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return id+" : "+name;
    }
}
