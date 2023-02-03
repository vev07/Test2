package Classes;

import java.util.Locale;

public class StringChange {
    public static void main(String[] args) {


    String s = "Mather";
        System.out.println(s.toUpperCase());  // методы не меняют переменную.

        System.out.println(s);
        s = s.toUpperCase();                   // String изменился только после присвоения.
        System.out.println(s);
        System.out.println(s.toLowerCase(Locale.ROOT));
        System.out.println(s);

        System.out.println("--------------");

    String string1 = "HELLO";
    String string2 = " my ";
    String string3 = " friend";
    String stringAll = string1+string2+string3;
        System.out.println("+++++++++++++++++++++++");
        StringBuilder xxx = new StringBuilder(stringAll.toLowerCase());
        System.out.println(xxx);
        System.out.println("++++++++++++++++++++++++++++");




    System.out.println(stringAll);
        System.out.println(stringAll.toLowerCase(Locale.ROOT));
        System.out.println(stringAll);


        StringBuilder st = new StringBuilder("HeLLo");  //StringBuilder изменяем методамию
        System.out.println(st);
        st.append(" mY");
        st.append(" fRienD");
        System.out.println(st);
        System.out.println("++++++++++++++++++++++++");

        System.out.println(xxx.toString());

        String stringF = " Man";
        String stringF2 = " and Woman";
        System.out.printf("Love is %s ", stringF+stringF2); //на место % вставляется переменная для doudle -%f, String -%
                                                 // int - %d. Количество %  и количество переменных должны соответствовать

        System.out.println();
        System.out.printf(" %s dn%fdnsn%d\n","XXX", 1546.616, 10 );

        System.out.printf("KJNKNLKkmcl%10fkmNK\n",165654.7); // пренос строки \n
        System.out.printf("nsdjnv%10skd\n","GGG");

        System.out.printf("bdhb%15d\n",155);          //цыфра после % означает фиксированный размер
        System.out.printf("bdhb%15d\n",1550000000);
        System.out.printf("bdhb%15d\n",15500);
        System.out.printf("bdhb%15d\n",15);

        System.out.printf("bdhb%-15d\n",155);          //минус перед % означает перенос на другую сторону
        System.out.printf("bdhb%-15d\n",1550000000);
        System.out.printf("bdhb%-15d\n",15500);
        System.out.printf("bdhb%-15d\n",15);

        System.out.printf("bdh%.2f\n",155.555555555); // .2%- ограничение нулей после запятой и ОКРУГЛЕНИЕ
        System.out.printf("bdh%.2f\n",155.5);
        System.out.printf("bdh%.2f\n",155.5555);


    }
}
