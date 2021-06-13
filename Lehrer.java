public class Lehrer extends Person{

    // Attribute
    private String erstesFach;
    private String zweitesfach;

    // Konstruktor
    public Lehrer(String pName,int pGeburtsjahr,String pErstesFach,String pZweitesfach){
        super(pName,pGeburtsjahr);
        erstesFach = pErstesFach;
        zweitesfach = pZweitesfach;

    }

    // get-Methoden

    public String getErstesFach() {
        return erstesFach;
    }

    public String getZweitesfach() {
        return zweitesfach;
    }

    public  void  schreibeInfo(){
        super.scheibeInfo();
        System.out.println("Ich unterrichte "+erstesFach+" und "+zweitesfach+".");

    }
}
