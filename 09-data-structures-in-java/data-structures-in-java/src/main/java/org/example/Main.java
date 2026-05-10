package org.example;

import java.util.*;

/**
 * This class contains several methods that operate on collections.
 */
public class Main {
    public static List<String> getStudentNamesList() {
        return new ArrayList<>(List.of("John", "Jane", "Alice", "Bob"));
    }

    public static List<String> getMStudents(List<String> students) {
        List<String> mStudents = new ArrayList<>();
        for (String student : students) {
            if (student.startsWith("M")) {
                mStudents.add(student);
            }
        }
        return mStudents;
    }

    public static List<String> getFirstThreeItems(Queue<String> queue) {
        List<String> firstThree = new ArrayList<>();
        for (int i = 0; i < 3 && !queue.isEmpty(); i++) {
            firstThree.add(queue.poll());
        }
        return firstThree;
    }

    public static HashSet<String> makeSetFromList(List<String> students) {
        return new HashSet<>(students);
    }

    public static boolean checkIfHashSetContainsAny(Set<String> haystack, List<String> needles) {
        for (String needle : needles) {
            if (haystack.contains(needle)) {
                return true;
            }
        }
        return false;
    }

    public static HashMap<String, Double> buildStudentGradesMap(List<String> students, List<Double> grades) {
        HashMap<String, Double> map = new HashMap<>();
        for (int i = 0; i < students.size() && i < grades.size(); i++) {
            map.put(students.get(i), grades.get(i));
        }
        return map;
    }
}
