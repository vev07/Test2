package Classes.Enum;

public enum Animals {

    DOG("собака"), CAT("кошка"), FROG("лягушка"), FOX("лиса");

    private String translation;
    Animals(String translation){
        this.translation = translation;
    }
    public String getTranslation(){
        return translation;
    }
}
