import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1
Создать класс Employee c полями id, name, age, salary.
Сделать его Comparable по salary (по зарплате)
Создайте массив объектов Employee и отсортируйте его по зарплате
2 чуть сложнее
Создайте класс Student (String name, List rates) имя, лист оценок.
 Ваша задача создать массив Student и отсортировать его по среднеарифметическоиу значению оценок.
 (Напомню, что бы получить среднеарифметическое значение оценок студента, нужно сумму всех оценок поделить на их количество)
 */
public class Main {
    public static void main(String[] args) {
      Employee[] employees= {
              new Employee(1L,20,6000),
              new Employee(2L,35,6723),
              new Employee(3L,28,4500),
              new Employee(4L,45,5000),
              new Employee(5L,28,5856),
              new Employee(6L,30,6838),
              new Employee(7L,21,4906),
              new Employee(8L,49,8000)
      };
        System.out.println(Arrays.toString(employees));
        System.out.println("--------------------------------------------------------------------------------------------------");
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
        System.out.println("----------------------------------------------------------------------------------------------------");
        List<Integer> johnRates=new ArrayList<>();
        johnRates.add(1);
        johnRates.add(2);
        johnRates.add(2);
        johnRates.add(1);
        johnRates.add(3);
        johnRates.add(2);
        johnRates.add(1);
        johnRates.add(1);
        List<Integer> jakeRates=new ArrayList<>();
        jakeRates.add(1);
        jakeRates.add(3);
        jakeRates.add(2);
        jakeRates.add(4);
        jakeRates.add(5);
        jakeRates.add(5);
        jakeRates.add(2);
        jakeRates.add(3);
        List<Integer> annRates=new ArrayList<>();
        annRates.add(5);
        annRates.add(2);
        annRates.add(3);
        annRates.add(4);
        annRates.add(5);
        annRates.add(4);
        annRates.add(4);
        annRates.add(1);
        List<Integer> mikeRates=new ArrayList<>();
        mikeRates.add(4);
        mikeRates.add(4);
        mikeRates.add(4);
        mikeRates.add(4);
        mikeRates.add(4);
        mikeRates.add(4);
        mikeRates.add(1);
        mikeRates.add(4);
        List<Integer> nickRates=new ArrayList<>();
        nickRates.add(3);
        nickRates.add(2);
        nickRates.add(3);
        nickRates.add(3);
        nickRates.add(3);
        nickRates.add(2);
        nickRates.add(2);
        nickRates.add(1);
        List<Integer> kateRates=new ArrayList<>();
        kateRates.add(2);
        kateRates.add(2);
        kateRates.add(2);
        kateRates.add(2);
        kateRates.add(2);
        kateRates.add(2);
        kateRates.add(2);
        kateRates.add(2);
        List<Integer> iraRates=new ArrayList<>();
        iraRates.add(1);
        iraRates.add(1);
        iraRates.add(1);
        iraRates.add(1);
        iraRates.add(1);
        iraRates.add(1);
        iraRates.add(1);
        iraRates.add(1);
        List<Integer> antonyRates=new ArrayList<>();
        antonyRates.add(4);
        antonyRates.add(4);
        antonyRates.add(4);
        antonyRates.add(4);
        antonyRates.add(4);
        antonyRates.add(4);
        antonyRates.add(4);
        antonyRates.add(4);
        System.out.println(antonyRates);
        Student[]students={
                new Student("John",johnRates),
                new Student("Jake",jakeRates),
                new Student("Ann",annRates),
                new Student("Nick",nickRates),
                new Student("Mike",mikeRates),
                new Student("Ira",iraRates),
                new Student("Antony",antonyRates),
        };
        System.out.println(Arrays.toString(students));
       Arrays.sort(students);
        System.out.println(Arrays.toString(students));

    }
}