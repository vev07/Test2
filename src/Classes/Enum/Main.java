package Classes.Enum;

public class Main {
    public static void main(String[] args) {

        Animals animals = Animals.DOG;
        System.out.println(Animals.DOG.getTranslation());


        switch (animals) {
            case DOG:
                System.out.println("It's dog");
                break;
            case CAT:
                System.out.println("It's cat");
                break;
            case FOX:
                System.out.println("It's fox");
                break;
            case FROG:
                System.out.println("It's frog");
            default:
                System.out.println("You enter some thing wrong");
        }
    }
}
