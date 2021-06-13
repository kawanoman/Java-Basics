public class Person {
    //Atrribute
    private String name;
    private  int geburtshajr;
    // Konstruktor
    public  Person(String pNname, int pGeburtsjahr){
        name = pNname;
        geburtshajr = pGeburtsjahr;

    }
    // Get-Methoden

    public String getName() {
        return name;
    }

    public int getGeburtshajr() {
        return geburtshajr;
    }

    public  void ScheibAlter(){
        System.out.println(2021-geburtshajr);

    }

    // Ausgabe in Konsole
    public  void scheibeInfo(){
        System.out.println("Mein Name ist "+name+" .");
        System.out.println("Ich bin im Jahr "+geburtshajr+" geboren.");
    }
}