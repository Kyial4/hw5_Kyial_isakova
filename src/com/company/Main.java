package com.company;

public class Main {

    public static void main(String[] args) {
        Boss Boss = new Boss();
        Boss.setDamage(250);
        Boss.setHealh(500);
        Boss.setProtectionType("Armor");
        System.out.println(Boss.getHealh() + " " +
                Boss.getDamage() + " " +
                Boss.getProtectionType());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].gethealh()+" "+
                    createHeroes()[i].getdamage()+" "+
                    createHeroes()[i].getSuperPower());

        }
    }

    public static Hero[] createHeroes() {
        Hero Hero = new Hero(250, 100, "Magic");
        Hero Hero1 = new Hero(300, 200);
        Hero Hero3 = new Hero(600, 200, "Kynetic");
        Hero[] Heroesmas = {Hero, Hero1, Hero3};
        return Heroesmas;
    }
}



