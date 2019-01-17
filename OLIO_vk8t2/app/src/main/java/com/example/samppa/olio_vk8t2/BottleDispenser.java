package com.example.samppa.olio_vk8t2;

import android.widget.TextView;

import java.util.ArrayList;

public class BottleDispenser {
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



    public void addMoney(TextView t) {
        TextView text = t;
        money += 1;
        text.setText("Klink! Lisää rahaa laitteeseen!");
        System.out.println("Klink! Lisää rahaa laitteeseen!");

    }

    public void buyBottle(TextView t, double fv) {
        TextView text = t;
        double finalValue = fv;
        if (finalValue >= 2) {
            Bottles.remove(4); // TODO muuta paremmaksi
            text.setText("KACHUNK! " + bottle.getName() + " tipahti masiinasta!");
            System.out.println("KACHUNK! " + bottle.getName() + " tipahti masiinasta!");
            finalValue = 0;

        }else {
            moreMoney(text);
        }

    }
    public void returnMoney(TextView t) {
        TextView text = t;
        money = 0;
        text.setText("Klink klink. Sinne menivät rahat!");
        System.out.println("Klink klink. Sinne menivät rahat!");
    }

    public void moreMoney(TextView t) {
        TextView text = t;
        text.setText("Syötä rahaa ensin!");
        System.out.println("Syötä rahaa ensin!");
    }

    public void delBottle () {

    }
}
