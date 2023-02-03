package Classes.Enam;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.FROG;

        switch (animal){
            case CAT:
                System.out.println("It's a cat");
                break;
            case DOG:
                System.out.println("It's a dog");
                break;
            default:
                System.out.println("It's a frog");
        }
        Season season = Season.SUMMER;
        System.out.println(season.ordinal()); //method ordinal gives number in array
        System.out.println(season.getTranslation());
        System.out.println(season.getTemperature());
        System.out.println(season.toString());
        System.out.println(season.name());
        System.out.println(animal.name());

        Season summer = Season.valueOf("SUMMER");
        System.out.println(summer.getTranslation());

        switch (season){
            case SUMMER:
                System.out.println("It's summer");
                break;
            case WINTER:
                System.out.println("It's winter");
                break;
            case SPRING:
                System.out.println("It's spring");
                break;
            case AUTUMN:
                System.out.println("It's autumn");
                break;
            default:
                System.out.println("You enter something wrong");
        }

    }
}
