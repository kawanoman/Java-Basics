import java.beans.beancontext.BeanContext;

public class Bruch {
    // Atributte
    private  int zaehler;
    private  int nenner;

    // Konstruktor
    public Bruch (int pZaehler, int pNenner){
        if(pNenner ==0){
            System.out.println("Der Nenner darf nicht 0 sein");
            System.out.println("Setze den Bruch auf 0.");
            zaehler = 0;
            nenner =1;

        } else{
            zaehler= pZaehler;
            nenner = pNenner;

        }

        if (nenner < 0){
            zaehler = -zaehler;
            nenner = -nenner;

        }


    }

    public Bruch(int pGanzzahligerwert){
        zaehler= pGanzzahligerwert;
        nenner = 1;
    }

    // Methoden
    public void erweitere(int pFaktor){
        if (pFaktor !=0){
            zaehler = zaehler*pFaktor;
            nenner =nenner*pFaktor;

        }
        if (nenner < 0){
            zaehler = -zaehler;
            nenner = -nenner;

        }

    }

    public  void kuerze(){
        int faktor = ggT();
        zaehler= zaehler / faktor;
        nenner = nenner / faktor;
        if (nenner < 0){
            zaehler = -zaehler;
            nenner = -nenner;

        }



    }

    public  void  multipliziere(Bruch pBruch){
        zaehler =  zaehler* pBruch.zaehler;
        nenner = nenner* pBruch.nenner;
        kuerze();

    }


    public  void multipliziere(int pZahl){
        zaehler = zaehler*pZahl;
        nenner = nenner*pZahl;
    }

    public  void diviere(Bruch pBruch){
        if(!pBruch.istNull()){
            zaehler = zaehler* pBruch.nenner;
            nenner   = nenner* pBruch.zaehler;
            kuerze();

        }else {
            System.out.println("Durch Null darf man nicht teilen");
        }
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public  void diviere(int pZahl){
        if( pZahl !=0 ){
            nenner   = nenner* pZahl;
            kuerze();

        }else {
            System.out.println("Durch Null darf man nicht teilen");
        }
    }




    public boolean istNull(){
        if (zaehler == 0){
            return true;

        }else{
            return false;

        }
    }

    public  void  addiere(Bruch pBruch){
        zaehler = zaehler* pBruch.nenner + nenner* pBruch.zaehler;
        nenner=   nenner* pBruch.nenner;
        kuerze();


    }

    public  void  subtrahiere(Bruch pBruch){
        zaehler = zaehler* pBruch.nenner - nenner* pBruch.zaehler;
        nenner=   nenner* pBruch.nenner;
        kuerze();


    }

    public boolean equals(Object pVergleich){
        if(pVergleich == null) {
            return  false;
        }

        if( !(pVergleich instanceof Bruch)){
            return false;
        }
        if( pVergleich == this){
            return true;
        }
        Bruch hilfsobjekt = (Bruch) pVergleich;
        hilfsobjekt.subtrahiere(this);
        boolean ergebnis = hilfsobjekt.istNull() ;
        hilfsobjekt.addiere(this);
        return ergebnis;






    }





        // Private Methode

    private int ggT(){
        int a = zaehler;
        int b = nenner;
        int h ;

        while (b!=0){
            h = a%b;
            a = b;
            b = h;




        }

        return a;



    }


    // Ausgabe


    @Override
    public String toString() {
        return "Bruch{" +
                "zaehler=" + zaehler +
                ", nenner=" + nenner +
                '}';
    }


    public double approx(){
        double hilfszaehler = zaehler;
        double hilfsnenner = nenner;
        return  (hilfszaehler/hilfsnenner);

    }
}
