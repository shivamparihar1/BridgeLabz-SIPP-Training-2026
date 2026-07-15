package Collection_practice.sortbasedonsomething;

import java.util.*;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args){

        StudentData s1 = new StudentData(102, "sailendra", 27, "CSE");
        StudentData  s2 = new StudentData(101, "rahul yadav", 22, "CIVIL");
        StudentData  s3 = new StudentData(105, "Neha", 26, "IT");
        StudentData  s4  = new StudentData(103, "Rakul", 25, "MECH");
        //StudentData  s5  = new StudentData(104, "Nakul", 28, "MECHENICAL");



        ArrayList<StudentData> list =  new ArrayList<StudentData>();

     //   ArrayList<object> list =  new ArrayList<StudentData>(); you can use object because object is parent class
        //  but you must be use exact datatype because of security issue;
    //    ArrayList<string> list =  new ArrayList<StudentData>(); you can't use other datatypes

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
//        Collections.sort(list);
        Collections.sort(list, new SortByAge());
        Collections.sort(list, new SortById());
        for(StudentData s:list){
            System.out.println(s);
        }








//        TreeSet<StudentData> treeList = new TreeSet<>();
//        treeList.add(s1);
//        treeList.add(s2);
//        treeList.add(s3);
//        treeList.add(s4);
//        treeList.add(s5);
//
//        for(StudentData s : treeList){
//            System.out.println(s);
//        }



        // Print all data from database
//        for(StudentData s : list){
//            System.out.println(s);
//        }
//
//        for(StudentData s : list){
//            if(s.Age > 25){
//                s.Branch = "CSE";
//            }
//        }
//        System.out.println();
//
//        for(StudentData s : list){
//            System.out.println(s);
//        }
//
//        StudentData longestName = list.get(0);
//        for(StudentData s : list){
//            if(s.Name.length() > longestName.Name.length()){
//                longestName = s;
//            }
//        }
//        System.out.println();
//        System.out.println("print longest name");
//        System.out.println(longestName);
//
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name to find data ");
//        String name = sc.nextLine();
//

    }
}
