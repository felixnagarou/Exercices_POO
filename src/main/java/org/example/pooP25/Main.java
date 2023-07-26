package org.example.pooP25;

public class Main {
    public static void main(String[] args) {
        WaterTank tank1 = new WaterTank(70f, 100f, 0f);
        WaterTank tank2 = new WaterTank(50f, 85f, 10f);



        tank1.displayStats();
        tank2.displayStats();

        System.out.println(WaterTank.totalVolume);



        tank1.fill(30);
        tank2.empty(1);

        tank1.displayStats();
        tank2.displayStats();

        System.out.println(WaterTank.totalVolume);
    }
}
