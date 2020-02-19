public class Propertie <T> {
    String name;
    T value;
    public Propertie (String name,T value){
        this.name=name;
        this.value=value;
    }

    public String toString(){
        return name+" , "+value;
    }
}
