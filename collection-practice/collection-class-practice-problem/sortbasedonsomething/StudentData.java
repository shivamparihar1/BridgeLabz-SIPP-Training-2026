package Collection_practice.sortbasedonsomething;

public class StudentData implements Comparable<StudentData> {
    int Id;
    String Name;
    int Age;
    String Branch;

    public StudentData(int id, String name, int age, String branch) {
        Id = id;
        Name = name;
        Age = age;
        Branch = branch;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Branch='" + Branch + '\'' +
                '}';
    }
    @Override
    public int compareTo(StudentData t){
        return this.Age-t.Age;  // this tells about that we are sorting on which basis age
    }
}