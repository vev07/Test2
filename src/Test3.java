class Test3{


    public static void main(String[] args) {
        TestEx2 human = new TestEx2("Pasha",44);
        TestEx2 human2 = new TestEx2("Lusy",41);
        TestEx2 human3 = new TestEx2("Nina", 11);

        human.print();
        human2.print();
        human3.print();
        human.printCountPeople();
        human3.printCountPeople();

        System.out.println(Math.pow(2,4));
        System.out.println(Math.PI);


    }
}
