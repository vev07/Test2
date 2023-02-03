public class TestEx {
    public static void main(String[] args) {

        TestMethod man = new TestMethod();
        TestMethod woman = new TestMethod();


        man.setName("Koly");
        man.setAge(45);
        man.setTall(178.6);
        woman.setName("Dasha");
        woman.setAge(38);
        woman.setTall(171.2);
        man.print();
        woman.print();



    }
}