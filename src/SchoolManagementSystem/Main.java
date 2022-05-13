package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Teacher dave = new Teacher(1, "Dave", 700);
      Teacher marry = new Teacher(2,"Marry", 650);
      Teacher maria = new Teacher(3,"Maria", 600);

      List<Teacher>teacherList = new ArrayList<>();
      teacherList.add(dave);
      teacherList.add(marry);
      teacherList.add(maria);


      Student s1 = new Student(1,"s1", 12);
      Student s2 = new Student(2,"s2", 14);
      Student s3 = new Student(3,"s3", 10);

      List<Student> studentList = new ArrayList<>();
      studentList.add(s1);
      studentList.add(s2);
      studentList.add(s3);

      School sch = new School(teacherList,studentList);

      Teacher megan = new Teacher(4, "Megan", 800);
      sch.addTeacher(megan);

      s1.payFees(5000);
      System.out.println("sch has earned " + sch.getTotalMoneyEarned());
      s2.payFees(6000);
      System.out.println("sch has earned " + sch.getTotalMoneyEarned());

      System.out.println("Making cfh pay salary");
      maria.receiveSalary(maria.getSalary());
      System.out.println("sch has spent for salary to " + maria.getName()
      + " and now has " + sch.getTotalMoneyEarned());

      dave.receiveSalary(dave.getSalary());
      System.out.println("sch has spent for salary to " + dave.getName()
              + " and now has " + sch.getTotalMoneyEarned());

      System.out.println(s1);
      System.out.println(dave);
    }
}

