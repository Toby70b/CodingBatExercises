import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {

        //Given a list of integers, returns a list where each integer is multiplied by 2.
        public List<Integer> doubling(List<Integer> nums) {
            return nums.stream().map(n-> n*2).collect(Collectors.toList());
        }

        //Given a list of integers, returns a list where each integer is multiplied with itself.
        public List<Integer> square(List<Integer> nums) {
            return nums.stream().map(n-> n*n).collect(Collectors.toList());
        }

        //Given a list of strings, returns a list where each string has "*" added at its end.
        public List<String> addStar(List<String> strings) {
            return strings.stream().map(n-> n + "*").collect(Collectors.toList());
        }

        //Given a list of strings, returns a list where each string is replaced by 3 copies of the string concatenated together.
        public List<String> copies3(List<String> strings) {
            return strings.stream().map(n-> n + n + n).collect(Collectors.toList());
        }

        //Given a list of strings, returns a list where each string has "y" added at its start and end.
        public List<String> moreY(List<String> strings) {
            return strings.stream().map(n-> "y" + n + "y").collect(Collectors.toList());
        }

        //Given a list of integers, returns a list where each integer is added to 1 and the result is multiplied by 10
        public List<Integer> math1(List<Integer> nums) {
            return nums.stream().map(n-> (n+1)*10).collect(Collectors.toList());
        }

        //Given a list of non-negative integers, returns an integer list of the rightmost digits
        public List<Integer> rightDigit(List<Integer> nums) {
            return nums.stream().map(n-> n%10).collect(Collectors.toList());
        }

        //Given a list of strings, returns a list where each string is converted to lower case
        public List<String> lower(List<String> strings) {
            return strings;
        }

        //Given a list of strings, returns a list where each string has all its "x" removed.
        public List<String> noX(List<String> strings) {
            return strings;
        }

}
