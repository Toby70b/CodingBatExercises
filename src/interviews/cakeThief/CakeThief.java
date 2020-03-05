package interviews.cakeThief;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CakeThief {

    public int maxDuffelBagValue(List<Cake> cakes, int capacity) {
        int value= 0;
        int numberOfCakesThatWillFit;
        int remainingCapacity = capacity;

        List<Cake> sortedCakes= cakes.stream()
                .sorted(Comparator.comparingDouble(Cake::getCakeValueByWeight).reversed())
                .collect(Collectors.toList());

        for (Cake cake : sortedCakes){
            if(remainingCapacity >= cake.getWeight()){
                numberOfCakesThatWillFit = remainingCapacity / cake.getWeight();
                remainingCapacity = remainingCapacity % cake.getWeight();
                value += numberOfCakesThatWillFit*cake.getValue();
            }
        }

        return value;

    }


}
