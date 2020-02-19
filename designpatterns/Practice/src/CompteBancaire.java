public class CompteBancaire {
    private int numero;
    private double solde;

    public CompteBancaire (int numero){
        this.numero=numero;
        this.solde = 0.0;
    }
    public double getSolde(){
        return this.solde;
    }
    public void deposerArgent(double depot){
        if (depot<=0){
            Journalisation.getInstance().ajouterLog("Opération impossible sur le compte N°"+numero+". Le montant doit etre strictement positif");
        }
        else{
            solde+=depot;
            Journalisation.getInstance().ajouterLog("Un versement d'un montant de "+depot+" DH a été effectué sur le compte N°"+numero+".");
        }
    }

    public void retirerArgent(double retrait){
        if (retrait<=0){
            Journalisation.getInstance().ajouterLog("Opération impossible sur le compte N°"+numero+". Le retrait doit etre strictement positif.");
        }
        else{
            if (retrait>solde){
                Journalisation.getInstance().ajouterLog("Opération impossible sur le compte N°"+numero+". Le retrait doit etre inférieur au solde.");
            }
            else{
                solde-=retrait;
                Journalisation.getInstance().ajouterLog("Un retrait d'un montant de "+retrait+" DH a été effectué sur le compte N°"+numero+".");
            }
        }
    }
}
