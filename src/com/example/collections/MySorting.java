package com.example.collections;

import java.util.*;

class  Employee /* implements Comparable<Employee>*/{

    Employee(){}


    public Employee(int id, String name, int age, long salary) {
        Id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    private int Id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n id = "+this.Id+" name = "+this.name+" age = "+this.age+" salary = "+this.salary;
    }


   /* @Override
    public int compareTo(Employee emp) {
        return (this.Id - emp.Id);
    }
*/

    public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return (int)(emp1.getSalary()- emp2.getSalary());
        }
    };

    public static Comparator<Employee> ageComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return (emp1.age - emp2.age);
        }
    };
    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.name.compareTo(emp2.name);
        }
    };
}

public class MySorting {

    public static void main(String[] args){

/*        int[] nums = {8,7,6,5,4,3,2};
        String[] alphs = {"H","F","A","B","Q","C"};

        Integer[] nos = {31,98,60,72,23};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Arrays.sort(alphs);
        System.out.println(Arrays.toString(alphs));
        Arrays.sort(nos);
        System.out.println(Arrays.toString(nos));

        List<String> charList = new ArrayList<>();
        charList.add("Z");
        charList.add("F");
        charList.add("Y");
        charList.add("E");
        charList.add("P");
        charList.add("A");

        Collections.sort(charList);
        for(String str : charList)
            System.out.println(" "+str);*/


    Employee emp1 = new Employee(40,"Abbe",25,125000);
    Employee emp2 = new Employee(30,"Elsa",28,75000);
    Employee emp3 = new Employee(20,"George",36,50000);
    Employee emp4 = new Employee(10,"Max",40,20000);


    List<Employee> emplist = new ArrayList<>();
    emplist.add(emp1);
    emplist.add(emp2);
    emplist.add(emp3);
    emplist.add(emp4);

    /*Collections.sort(emplist);*/
    Collections.sort(emplist,Employee.salaryComparator);
    System.out.println("Sorting of Employees on salary:\n"+emplist);
    Collections.sort(emplist,Employee.ageComparator);
    System.out.println("Sorting of Employees on age:\n"+emplist);
    Collections.sort(emplist,Employee.nameComparator);
    System.out.println("Sorting of Employees on age:\n"+emplist);
    Collections.reverse(emplist);
    System.out.println("Reverse Sorting of Employees on age:\n"+emplist);







    }
}
