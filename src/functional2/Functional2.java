package functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(n -> n%10 != 9).collect(Collectors.toList());
    }

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(n -> !(n >=13 && n <=19) ).collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(n -> !n.contains("z")).collect(Collectors.toList());
    }

    public List<String> noLong(List<String> strings) {
        return strings.stream().filter(n -> n.length()<4).collect(Collectors.toList());
    }

    public List<String> no34(List<String> strings) {
        return strings.stream().filter(n -> n.length()!=3 && n.length()!=4).collect(Collectors.toList());
    }

    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(n -> n.concat("y"))
                .filter(n -> !n.contains("yy")).collect(Collectors.toList());
    }

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(n -> n*2)
                .filter(n -> n%10!=2).collect(Collectors.toList());
    }

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n*n)+10)
                .filter(n -> !(n%10==5 || n%10==6) ).collect(Collectors.toList());
    }




}
