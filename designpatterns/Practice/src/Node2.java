
//Node implementation.


public class Node2 {
    protected String valeur;

    protected Node2 apres, avant;
    public Node2(){
        apres=null;
        avant=null;
        valeur=null;
    }

    public Node2(String valeur, Node2 ap, Node2 av){
        this.valeur=valeur;
        apres=ap;
        avant=av;
    }
    public void setValeur(String val){
        valeur=val;
    }
    public void setApres(Node2 ap){
        apres=ap;
    }
    public void setAvant(Node2 av){
        avant=av;
    }
    public String getValeur(){
        return valeur;
    }
    public Node2 getApres(){
        return apres;
    }
    public Node2 getAvant(){
        return avant;
    }
}
