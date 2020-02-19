public class FactoryMethod {
    public static void main(String[] args){
        Propertie prop = PropertiesInterface.createProperty("Said", true);
        System.out.println(prop.value.getClass().getName());
    }
}


//PropertiesInterface propinterf;
//        String name = "ali";
//       int value = 11;
//        propinterf = new CreateNewInstance(name,value);