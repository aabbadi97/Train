public class Singleton {
    private static Singleton obj;
    private Singleton(){};
    public static Singleton getSingleton(){
        if (obj==null){
            synchronized(Singleton.class){
                if(obj==null){
                    obj=new Singleton(); //instance will be created at request time.
                }
            }
        }
        return obj;
    }
    public String uneFonctionX(){
         return "SkyLark";
    }

}
