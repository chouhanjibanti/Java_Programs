package StreamApi;

import java.util.HashMap;
import java.util.Objects;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals to compare values
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && Objects.equals(name, student.name);
    }

    // Override hashCode to be consistent with equals
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class HashMapHashCodeAndEquals {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();

        Student s1 = new Student(1, "John");
        Student s2 = new Student(1, "John"); // logically same as s1
        Student s3 = new Student(2, "Jony");

        map.put(s1, "Maths");
        map.put(s2, "Science"); // should update same key value
        map.put(s3, "bio");

        System.out.println("Size of map: " + map.size());
        System.out.println("Value for s1: " + map.get(s1));
        System.out.println("Value for s2: " + map.get(s2));
        System.out.println("Value for s3: " + map.get(s3));
    }
}

