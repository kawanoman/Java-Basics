public class Bruchtest {
    public static void main(String[] args) {
        Bruch meinBruch = new Bruch(2,3);
        System.out.println(meinBruch);
        //meinBruch.erweitere(4);
        //System.out.println(meinBruch);

        System.out.println(meinBruch.equals(new Bruch(2,3)));

        //meinBruch.kuerze();
        //System.out.println(meinBruch);

        //meinBruch.addiere(new Bruch(1,3));
        //System.out.println(meinBruch);

        meinBruch.subtrahiere(new Bruch(1,3));
        System.out.println(meinBruch);

       // meinBruch.diviere(new Bruch(3,2));
        //System.out.println(meinBruch);

        System.out.println(meinBruch.approx() );


    }

}
