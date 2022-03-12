package com.company;

public class Hero {
    private int healh = 0;
    private int damage =0;
    private String superPower =new String();


public Hero (int healh, int damage,String superPower){
    this.healh = healh;
    this.damage = damage;
    this.superPower = superPower;
}

public Hero (int health, int damage){
    this.healh = health;
    this.damage = damage;
}

public int gethealh(){
    return healh;
}
public int getdamage(){
    return damage;
}
public String getSuperPower(){
    return superPower;
}



}