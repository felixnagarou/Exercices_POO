package org.example.pooP25;

public class WaterTank {
    private float hollowWeight;
    private float maxCapacity;
    private float fillLevel;
    private static float totalVolume;

    public WaterTank(){
    }

    public WaterTank(float hollowWeight, float maxCapacity, float fillLevel) {
        this.hollowWeight = hollowWeight;
        this.maxCapacity = maxCapacity;
        this.fillLevel = fillLevel;


    }

    //getters

    public float getHollowWeight() {
        return hollowWeight;
    }

    public float getMaxCapacity() {
        return maxCapacity;
    }

    public float getFillLevel() {
        return fillLevel;
    }

    public static float getTotalVolume(){
        return totalVolume;

    }

    //setters


    public void setHollowWeight(float hollowWeight) {
        this.hollowWeight = hollowWeight;
    }

    public void setMaxCapacity(float maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setFillLevel(float fillLevel) {
        this.fillLevel = fillLevel;
    }

    public static void setTotalVolume(float totalVolume) {
        WaterTank.totalVolume = totalVolume;
    }

    //méthodes remplir et vider

    public float fill(float fillVolume){
        fillLevel += fillVolume;
        return fillLevel;
    }

    public float empty(float emptyVolume){
        fillLevel -= emptyVolume;
        return fillLevel;
    }

    @Override
    public String toString() {
        return "WaterTank{" +
                "hollowWeight=" + hollowWeight +
                ", maxCapacity=" + maxCapacity +
                ", fillLevel=" + fillLevel +
                '}';
    }

    public void displayStats(){
        System.out.println(this.toString());
    }
}
