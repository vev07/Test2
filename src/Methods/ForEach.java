package Methods;

public class ForEach {
    public static void main(String[] args) {
        String[] strings = new String[6];
        strings[0] = "Grisha";
        strings[1] = "Misha";
        strings[2] = "Sergey";
        strings[3] = "Pasha";
        strings[4] = "Lesha";
        strings[5] = "Gey";

        String[] strings1 = {"Valy", "Galy", "Masha"};
        for (String man: strings){
            System.out.println(man);

        }
        System.out.println("-----------------");
        for (String woman: strings1){
            System.out.println(woman);
        }
        System.out.println("----------------------------");
        for (String it: strings) {
            for (int i = 0; i < 5; i++) {
                String x = strings[i];

                String LGBT = it + " " + x;
                System.out.println(LGBT);
            }
        }

    }
}
