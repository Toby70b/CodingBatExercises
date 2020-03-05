package interviews.cakeThief;

public class Cake {
    private int weight, value;

    public Cake(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double getCakeValueByWeight(){
        return value/weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
