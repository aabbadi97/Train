import java.util.Optional;
public class OptionalClass {
    public static void main(String[] args){
        String[] str = new String[11];
        str[8]="JAVA OPTIONAL CLASS TEST";

        // "empty" optional instance
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        //instantiation of non-empty optional: "value"
        Optional<String> value = Optional.of(str[8]);

        //verifier la presence de "value"
        System.out.println("value filtered: "+value.filter(s -> s.equals("hgfdsgdfg")));
        System.out.println("value filtered: "+value.filter(s -> s.equals("JAVA OPTIONAL CLASS TEST")));

        //getting value
        System.out.println("Get value: " + value.get());

        //gettig hashCode
        System.out.println("Get hashCode: " + value.hashCode());

        //Presence of value
        System.out.println("Is the value present? That's " + value.isPresent());

        //return non-empty optional if value is present ,otherwise return empty optional
        System.out.println("Nullable Optional: " + Optional.ofNullable(str[8]));
        System.out.println("Nullable Optional: " + Optional.ofNullable(str[3]));

        //returns value if available, otherwise returns specified value
        System.out.println("or Else: " + value.orElse("value is not present"));
        System.out.println("or Else: " + empty.orElse("value is not present"));

        //printing by the reference method
        value.ifPresent(System.out::println);

    }
}
