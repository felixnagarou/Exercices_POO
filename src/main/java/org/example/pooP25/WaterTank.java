package org.example.pooP25;

public class WaterTank {
    private float hollowWeight;
    private float maxCapacity;
    private float fillLevel;
    public static float totalVolume = 0;

    public WaterTank(){
    }

    public WaterTank(float hollowWeight, float maxCapacity, float fillLevel) {
        this.hollowWeight = hollowWeight;
        this.maxCapacity = maxCapacity;
        this.fillLevel = fillLevel;
        totalVolume += fillLevel;
    }

    //méthodes remplir et vider -------------------------------------------------
    public void fill(float fillVolume){
        if (fillVolume <= (maxCapacity - fillLevel)){
            this.fillLevel += fillVolume;
            WaterTank.totalVolume += fillVolume;
        }
    }

    public void empty(float emptyVolume){
        if (emptyVolume <= this.fillLevel && emptyVolume >= 0) {
            this.fillLevel -= emptyVolume;
            WaterTank.totalVolume -= emptyVolume;
        }

    }
    //-----------------------------------------------------------


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
