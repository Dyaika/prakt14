package com.company;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("Magic done");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on MagicChair");
    }
}
