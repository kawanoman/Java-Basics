public class Schueler extends Person{
    // Attribute
    private int stufe;
    private int abijahrgang;
    // Konstruktor
    public Schueler(String pName, int pGeburtsjahr, int pStufe, int pAbijahrgang){
        super(pName,pGeburtsjahr);
        stufe = pStufe;
        abijahrgang = pAbijahrgang;

    }

    // get-Methoden


    public int getStufe() {
        return stufe;
    }

    public int getAbijahrgang() {
        return abijahrgang;
    }

    // Ausgabe in Konsole

    public  void  deineInfo(){
        super.scheibeInfo();
        System.out.println("Ich bin im JG "+stufe+" vom  "+abijahrgang+".");

    }

}
