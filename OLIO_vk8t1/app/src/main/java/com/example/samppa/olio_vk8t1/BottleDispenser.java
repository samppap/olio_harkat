package com.example.samppa.olio_vk8t1;

import java.util.ArrayList;

class BottleDispenser {
    private int money;
    private int bottles;
    Bottle bottle = new Bottle();
    ArrayList<Bottle> Bottles = new ArrayList<Bottle>();

    private static BottleDispenser bd = new BottleDispenser();

    private BottleDispenser() {
        money = 0;
        bottles = 6;

        for (int i = 0; i<bottles; i++) {
            Bottles.add(new Bottle());
        }
    }

    public static BottleDispenser getInstance() {
        return bd;
    }


    public void printBottles () {
        for (int i = 0; i<Bottles.size(); i++) {
            System.out.println(i+1 + ". Nimi: " + bottle.getName());
            System.out.println("	Koko: " + bottle.getSize() + "	Hinta: " + bottle.getPrice());
        }
    }



    public void addMoney() {
        money += 1;
        System.out.println("Klink! Lisää rahaa laitteeseen!");

    }

    public void buyBottle() {

        if (money == 2) {
            Bottles.remove(4); // TODO muuta paremmaksi
            System.out.println("KACHUNK! " + bottle.getName() + " tipahti masiinasta!");

        }else {
            moreMoney();
        }

    }
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Sinne menivät rahat!");
    }

    public void moreMoney() {
        System.out.println("Syötä rahaa ensin!");
    }

    public void delBottle () {

    }
}
