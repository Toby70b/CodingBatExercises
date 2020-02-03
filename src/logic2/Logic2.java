package logic2;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Logic2 {

    public boolean evenlySpaced(int a, int b, int c) {
        int min, middle, max;
        List<Integer> nums = Arrays.asList(a,b,c);
        Collections.sort(nums);
        min = nums.get(0);
        middle = nums.get(1);
        max = nums.get(2);
        return Math.abs(min-middle) == Math.abs(middle-max);

    }

    public int blackjack(int a, int b) {
        return 1;
    }

    public int makeChocolate(int small, int big, int goal) {
        int bigBarsNeeded = goal/5;
        int smallBarsNeeded;

        if(bigBarsNeeded > big){
            smallBarsNeeded = goal - (5*big);
            if (smallBarsNeeded > small){
                return -1;
            }
            else {
                return smallBarsNeeded;
            }
        }
        else {
            smallBarsNeeded = goal%5;
            if (smallBarsNeeded > small){
                return -1;
            }
            else {
                return smallBarsNeeded;
            }
        }
    }
    public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
        int largePackagesNeeded = items/5;
        int smallPackagesNeeded;
        if(availableLargePackages < largePackagesNeeded){
            smallPackagesNeeded = items - (5*availableLargePackages);
            if(availableSmallPackages < smallPackagesNeeded){
                return -1;
            }
            else{
                return smallPackagesNeeded + availableLargePackages*5;
            }
        }
        else{
            smallPackagesNeeded = items%5;
            if(availableSmallPackages < smallPackagesNeeded){
                return -1;
            }
            else{
                return smallPackagesNeeded + largePackagesNeeded;
            }
        }
    }



}
