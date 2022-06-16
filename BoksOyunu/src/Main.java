public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Basri", 20, 200, 75,25,35,40);
        Fighter f2 = new Fighter("Oktay", 25, 230, 100,15,20,20);
        Fighter f3 = new Fighter("Mehcet", 15,150,85,10,50,100);

        Match kavga = new Match(f1, f2, 100, 70);
        kavga.run();
    }
}