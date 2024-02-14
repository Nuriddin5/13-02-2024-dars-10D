package org.nuriddin;

import java.util.*;

/**
 * User:t.me/supermatematikuz
 * Date:14.02.2024 10:47
 */
public class LinkedListLearning {
    public static void main(String[] args) {
        // Storing and accessing student names
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");

        studentNames.add(2, "Aliy");
        // Accessing the second student's name
        String secondStudentName = studentNames.get(1);
//        System.out.println("Second student's name: " + secondStudentName);

        // Manipulating a list of tasks
        LinkedList<String> taskList = new LinkedList<>();
        taskList.add("Task 1");
        taskList.add("Task 2");
        taskList.add("Task 4");

        Iterator<String> iterator = taskList.iterator();

        while (iterator.hasNext()) {
            String task = iterator.next();
            if (task.equals("Task 2")) {
                iterator.remove();
            }
        }
        System.out.println(taskList);

        ListIterator<String> iterator1 = taskList.listIterator();

        iterator1.next();//0
        iterator1.next();//1
        System.out.println(iterator1.nextIndex());//2

        //LinkedList ga 1 dan 100 gacha sonlarni qo'shing
        //Iterotor yordamida toq sonlarni o'chirib yuboring
        //Iteratorsiz 5 ga bo'linadiganlarni o'chirib yuboring

        //ArrayList<Integer> numbers = new ArrayList<>();
        //numbers.add(1);
        //numbers.add(2);
        //numbers.add(3);
        //numbers.add(4);

        //har bir elemenddan keyin 2 lamngan elementni qo'shing
        //ListIterator dan foydalanamiz

    }
}
