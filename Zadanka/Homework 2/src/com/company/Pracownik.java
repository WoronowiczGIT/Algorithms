package com.company;

public class Pracownik {

    private String name;
    private String pesel;
    private char sex;
    private int age;
    private boolean underage;
    private boolean retirementPlan;
    // Constructor set
    Pracownik(String name, int age, char sex, String pesel) {
        setName(name);
        setAge(age);
        setPesel(pesel);
        setSex(sex);
    }
    Pracownik(String name, int age){
        setName(name);
        setAge(age);
        this.pesel ="0000000000";
        this.sex = 'X';
    }
    Pracownik(String name, String pesel){
        setName(name);
        setPesel(pesel);
        this.age = 0;
        this.sex = 'X';
    }
    Pracownik(String name){
        setName(name);
        this.age = 0;
        this.pesel = "000000000";
        this.sex = 'X';
    }

    //  Getter set
    public String getName(){return name;}
    public String getPesel() {
        return pesel;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    void getAll(){
        System.out.println("imie: "+getName());
        System.out.println("pesel "+getPesel());
        System.out.println("sex "+getSex());
        System.out.println("age "+getAge());
        System.out.println();
      //  System.out.println("retired "+getRetirementPlan());
      //  System.out.println("is underaged "+ getUnderage());
    }

    public boolean getRetirementPlan() {
        return retirementPlan;
    }

    public boolean getUnderage() {
        return underage;
    }

    // Setters set
    void setName(String name){
        this.name = name;
    }
    void setPesel(String pesel) {
        if (pesel.length() != 11) {
            System.out.println("invaild pesel nr");
            this.pesel = "00000000000";
        } else {
            this.pesel = pesel;
        }
    }

    void setAge(int age) {
        if (age < 16 || age > 70) {
            System.out.println("invaild age");

        } else {
            if (age < 18) {
                underage = true;
            } else if ((age > 65 && (sex == 'M' || sex == 'm')) ||
                    (age > 60 && (sex == 'F' || sex == 'f'))
            ) {
                retirementPlan = true;
            }
            this.age = age;
        }
    }

    void setSex(char sex) {
        if ((sex == 'M' || sex == 'm') || (sex == 'F' || sex == 'f')) {
            this.sex = sex;
        } else {
            System.out.println("invaild sex");
            this.sex = 'X';
        }

    }
    private char[] sexList = {'F','f','M','m'};
    void setSexV2(char sex){
        for (char plec: sexList
             ) {
            if(plec == sex){
                this.sex = sex;
            }
        }
    }
    void  setAgev2(){
        this.age = 99;
    }


}



