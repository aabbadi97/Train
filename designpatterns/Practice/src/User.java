import java.time.LocalTime;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class User {

    private static final Logger LOGGER = Logger.getLogger(User.class.getName());
    String name;
    String country;
    String email;

    public User(String name, String country, String email) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    private static void setLoggerProperties(){
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.INFO);
        handler.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(handler);
    }

    public static User createWithLoggedInstantiationTime(String name,String country , String email){
        setLoggerProperties();
        LOGGER.log(Level.INFO, "Creating user instance at {0}", LocalTime.now());
        return new User(name,country,email);
    }
    public static void main(String[] args){
        User user = User.createWithLoggedInstantiationTime("John", "Argentina", "john@domain.com");
        User user2=createWithLoggedInstantiationTime("said","Morocco","said@domaine.com");
        System.out.println(user);
        System.out.println(user2);
    }

}
