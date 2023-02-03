package New;

import java.io.Serializable;

public class Thing implements Serializable {
    private int id;
    private String model;

    public Thing(int id, String model){
        this.id = id;
        this.model = model;

    }public int getId(){
        return id;
    }public String getModel(){
        return model;
    }
    public String toString(){
        return id+", "+model;
    }
}
