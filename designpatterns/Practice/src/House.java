//OOP revise: house with windows lights and doors, and actions (open/close OR turn on/turn off).

abstract class House {
    protected String couleur;
    protected String marque;
    abstract void open();
    abstract void close();
}

class Door extends House {
    public Door(String couleur, String marque){
        this.couleur=couleur;
        this. marque=marque;
    }
    void open(){
        System.out.println("La porte est ouverte");
    }
    void close() {
        System.out.println("La porte est fermé");
    }
}
class Window extends House {
    public Window(String couleur, String marque) {
        this.couleur = couleur;
        this.marque = marque;
    }
    void open(){
        System.out.println("Window opened");
    }
    void close(){
        System.out.println("Window Closed");
    }

}
class Light extends House{
    public Light(String couleur, String marque){
        this.marque=marque;
        this.couleur=couleur;
    }
    void open(){
        System.out.println("Light is ON");
    }
    void close(){
        System.out.println("Ligh is OFF");
    }
}
class Main {
    public static void main(String[] args) {
        Door D = new Door("Rouge", "JPM");
        Window W = new Window("Bleu", "SWA");
        Light L = new Light("Blanc", "NEON");

        D.open();
        W.close();
        D.close();
        L.open();

    }
}