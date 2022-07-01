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
/*   ## Задание 4

Напишите код, который выводит в консоль все количество дублей из списка слов.

*Например, у вас есть текст из 6 слов, в котором есть одно слово, которое повторяется.
В таком случае в консоли выведется результат "2", то есть то количество элементов, которые повторяются.*
В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
Код должен работать с любой последовательностью и объемом списка слов.

- Критерии проверки:
    - В консоль выводится число повторений одного слова
    - Если в одном тексте разные слова повторяются, то в консоль нужно вывести несколько чисел
    - Порядок числовых значений в консоли значения не имеет
    - Код работает с любой последовательностью и объемом списка слов.
 */