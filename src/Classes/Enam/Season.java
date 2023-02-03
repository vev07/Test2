package Classes.Enam;

public enum Season {
    SUMMER("лето",24), WINTER("зима",-2), SPRING("весна",18),
    AUTUMN("осень",16);
    private String translation;
    private int temperature;
    Season(String translation, int temperature){
        this.translation = translation;
        this.temperature = temperature;
    }

    public String getTranslation(){
        return translation;
    }
    public int getTemperature(){
        return temperature;
    }

    public String toString(){
        return "перевод на русский язык "+ translation+", temperature is "+temperature;
    }

}
