import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(35, 56, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(nums);
        List<Integer> numsOdd = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 1) {
                numsOdd.add(num);
            }
        }
        System.out.println(numsOdd);

        //Задание 2
        List<Integer> numsEven = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0 && !numsEven.contains(num)) {
                numsEven.add(num);
            }
        }
        numsEven.sort(Integer::compareTo);
        System.out.println(numsEven);

        //Задание 3
        List<String> words = new ArrayList<>(List.of("Слово", "Собака", "Кошка","Кошка",
                                                        "Word", "Word3","Кошка", "Word3"));
        System.out.println(words);
        Set<String> wordsSet = new HashSet<>();
        for (String word : words) {
            wordsSet.add(word);
        }
        System.out.println(wordsSet);

        //Задание 4
        Map<String, Integer> wordsRepeat = new HashMap<>();
        Integer repeat = 0;
        for (String word : wordsSet) {
            for (String s : words) {
                if (s.equals(word)) {
                    repeat++;
                }
                if (repeat > 1) {
                    wordsRepeat.put(word, repeat);
                }
            }
            repeat = 0;
        }
        System.out.println(wordsRepeat);
    }
}