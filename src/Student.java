import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private List<Integer>rates;

    public Student(String name, List<Integer> rates) {
        this.name =name;
        this.rates = rates;
    }


    public String getName() {
        return name;
    }

    public List<Integer> getRates() {
        return rates;
    }
    public int getAv(){
        int sum = 0;
        for (int rate:rates){

            sum+=rate;
        }
        return sum / rates.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", rates=" + rates +
                '}'+System.lineSeparator();
    }

    @Override
    public int compareTo(Student o) {
      return getAv() - o.getAv();
    }
}
