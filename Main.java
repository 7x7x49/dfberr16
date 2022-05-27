package com.company;

import java.util.ArrayList;

abstract class Deliver{
    String name;
    ArrayList<String> params = new ArrayList<>();
    public String toString(){
        return "Variant deliver:"+name+"\n"+params;
    }
}

abstract class DeliverVariants{
    public abstract Deliver createDeliverVariant();
}

class TruckVariant extends DeliverVariants{
    public Deliver createDeliverVariant(){
        return new Truck();
    }
}

class ShipVariant extends DeliverVariants{
    public Deliver createDeliverVariant(){
        return new Ship();
    }
}

class AirplaneVariant extends DeliverVariants{
    public Deliver createDeliverVariant(){
        return new Airplane();
    }
}

class Truck extends Deliver{
    public Truck(){
        name = "Truck";
        params.add("Delivery time: 1week-1month");
        params.add("\nDelivery cost:10$");
    }
}

class Ship extends Deliver{
    public Ship(){
        name = "Ship";
        params.add("Delivery time: 3 days - 1 week");
        params.add("\nDelivery cost:40$");
    }
}

class Airplane extends Deliver{
    public Airplane(){
        name = "Airplane";
        params.add("Delivery time:1-3day");
        params.add("\nDelivery cost:70$");
    }
}

public class Main{
    public static void main(String[] args) {
        DeliverVariants TruckVariant1 = new TruckVariant();
        DeliverVariants ShipVariant1 = new ShipVariant();
        DeliverVariants AirplaneVariant1 = new AirplaneVariant();
        Deliver Truck1 = TruckVariant1.createDeliverVariant();
        Deliver Ship1 = ShipVariant1.createDeliverVariant();
        Deliver Airplane1 = AirplaneVariant1.createDeliverVariant();
        System.out.println(Truck1);
        System.out.println(Ship1);
        System.out.println(Airplane1);
    }
}