public interface PropertiesInterface<T> {
    static <T> Propertie <T> createProperty(String name, T value){
        return new Propertie<T>(name,value);
    }
}
