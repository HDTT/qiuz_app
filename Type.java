import java.io.Serializable;


public class Type implements Serializable{
    String name;

    public Type(String name){
    this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
