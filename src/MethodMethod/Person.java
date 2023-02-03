package MethodMethod;

import javax.swing.*;

public class Person {

        private String name;
        private int age;
        private double tall;


    void speak(String name, int age, double tall){
        for (int i =0; i<3; i++) {
            System.out.println("Human name is " + name + ", his age is " + age + ", his tall is " + tall);

        }

    }
    void sayHello(){
        System.out.println("Say hello!");
    }
    int retirement (){
        int years = 65-age;
        System.out.println("Him lost "+years);
       return years;


    }void setName(String userName){
        if(userName.isEmpty()) {
            System.out.println("You enter empty name");
        }else{
        name = userName;}

    } int setAge(int userAge){
        if(userAge<10){
            System.out.println("You enter wrong age");
        }else {age = userAge;}
        return userAge;
    }
    double setTall(double userTall){
        if (tall<120.0) {
            System.out.println("You enter wrong tall");
        } else { tall = userTall;}
        return userTall;
    }
    public void setInform(String userName, int userAge,double userTall){
        name =userName;
        age = userAge;
        tall = userTall;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getTall(){
        return tall;
    }
    public String toString(){
        return name+" "+age+" "+tall;

    }

}
