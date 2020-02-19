public class MainSingletonExo {
    public static void main(String[] args){
        CompteBancaire cb1= new CompteBancaire(11111997);
        cb1.deposerArgent(900);
        cb1.retirerArgent(86);

        CompteBancaire cb2 = new CompteBancaire(11121996);
        cb2.retirerArgent(100);

        String S = Journalisation.getInstance().afficherLog();
        System.err.println(S);

    }
}
