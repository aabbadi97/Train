//REMARQUE: voir la classe "Maine" pour le test.

//Douby Linked List implementation.


public class DoublyLinkedList {
    protected Node2 Debut;
    protected Node2 Fin;
    public int Taille;

    public DoublyLinkedList() {
        Debut = null;
        Fin = null;
        Taille = 0;
    }

    public boolean vide() {
        return Debut == null;
    }

    public int getTaille() {
        return Taille;
    }

    public void insertDebut(String val) {
        Node2 N = new Node2(val, null, null);
        if (Debut == null) {
            Debut = N;
            Fin = Debut;
        } else {
            Debut.setAvant(N);
            N.setApres(Debut);
            Debut = N;
        }
        Taille++;

    }

    public void insertFin(String val) {
        Node2 N2 = new Node2(val, null, null);
        if (Debut == null) {
            Debut = N2;
            Fin = Debut;
        } else {
            N2.setAvant(Fin);
            Fin.setApres(N2);
            Fin = N2;
        }
        Taille++;
    }

    public void insertInPos(int k, String val) {
        Node2 N3 = new Node2(val, null, null);
        if (k == 0) {
            insertDebut(val);
            return; //pr arreter.
        }
        Node2 x1 = Debut;
        for (int i = 1; i <= Taille; i++) {
            if (i == k) {
                Node2 x2 = x1.getApres();
                x1.setApres(N3);
                N3.setAvant(x1);
                N3.setApres(x2);
                x2.setAvant(N3);

            }
            x1 = x1.getApres(); //pour traverser toute la chaine.
        }
        Taille++;
    }

    public void deleteInPos(int k) {
        if (k == 0) {     /* position 0 */
            if (Taille == 1) {    //cas d'1 seul elt
                Debut = null;
                Fin = null;
                Taille = 0;
                return; //arreter
            }
            Debut = Debut.getApres();
            Debut.setAvant(null);
            Taille--;
            return;
        }
        //derniere position:
        if (k == Taille) {
            Fin = Fin.getAvant();
            Fin.setApres(null);
            Taille--;
        }
        //autres cas:

        Node2 N = Debut.getApres();
        for (int i = 1; i <= Taille; i++) {
            if (i == k) {
                Node2 p = N.getAvant();
                Node2 n = N.getApres();

                p.setApres(n);
                n.setAvant(p);
                Taille--;
                return;
            }
            N = N.getApres();
        }

    }

    public void Afficher() {
        System.out.print("\nDoubly Linked List = ");
        if (Taille == 0) {
            System.out.print("Liste vide\n");
            return;
        }
        if (Debut.getApres() == null) {
            System.out.println(Debut.getValeur());
            return;
        }
        Node2 N = Debut;
        System.out.print(Debut.getValeur() + " <-> ");
        N = Debut.getApres();
        while (N.getApres() != null) {
            System.out.print(N.getValeur() + " <-> ");
            N = N.getApres();
        }
        System.out.print(N.getValeur() + "\n");
    }


}
