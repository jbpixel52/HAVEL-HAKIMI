public class App {
    public static void main(String[] args) throws Exception {
        algorithm HH = new algorithm();
        //5 3 0 2 6 2 0 7 2 5
        HH.addPeople(5);
        HH.addPeople(3);
        HH.addPeople(0);
        HH.addPeople(2);
        HH.addPeople(6);
        HH.addPeople(2);
        HH.addPeople(0);
        HH.addPeople(7);
        HH.addPeople(2);
        HH.addPeople(5);

        System.out.println(HH.havelHakimi());

    }
}
