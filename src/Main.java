import java.util.*;

public class Main {
    public  static List<Integer> nums = new ArrayList<>(List.of(35, 56, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public  static List<String> words = new ArrayList<>(List.of("Слово", "Собака", "Кошка", "Кошка",
            "Word", "Word3", "Кошка", "Word3"));
    public static String string = "Это новый текст о том как из предложения сделать список слов";
    public static void main(String[] args) {
        System.out.println(nums);
        System.out.println(words + "\n");
        numsOdd();
        numsEven();
        wordsSet();
        wordsRepeat();
        System.out.println(stringToList(string));
    }
    public static void numsOdd() {
        List<Integer> numsOdd = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 1) {
                numsOdd.add(num);
            }
        }
        System.out.println("Задание 1. Нечетные числа в списке:\n" + numsOdd);
    }
    public static void numsEven() {
        List<Integer> numsEven = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0 && !numsEven.contains(num)) {
                numsEven.add(num);
            }
        }
        Collections.sort(numsEven);
        System.out.println("Задание 2. Четные уникальные отсортированные числа в списке:\n" + numsEven);
    }
    public static void wordsSet() {
        System.out.println("Задание 3. Уникальные слова в списке:\n" + new HashSet<>(words));
    }
    public static void wordsRepeat() {
        Map<String, Integer> wordsRepeat = new HashMap<>();
        int repeat = 0;
        for (String word : new HashSet<>(words)) {
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
        System.out.println("Задание 4. Число дублей в списке:\n" + wordsRepeat);
    }
    public static ArrayList<String> stringToList(String s) {
        return new ArrayList<>(List.of(s.split(" ")));
    }
}
