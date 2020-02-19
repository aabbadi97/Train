import java.text.*;
import java.util.*;

public class Journalisation {
    private static Journalisation uniqueInstance;
    private String log;

    private Journalisation(){
        log = new String();
    }

    public static synchronized  Journalisation getInstance(){
        if (uniqueInstance==null){
            uniqueInstance = new Journalisation();
        }
        return uniqueInstance;
    }

    public void ajouterLog(String log){
        Date date=new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yy HH'h'mm");
        this.log+="["+dateFormat.format(date)+"] "+log+ "\n";
    }

    public String afficherLog(){
        return log;
    }





}
