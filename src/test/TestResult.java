package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int symmetricCount = Exercise.countSymmetricTimes();
        System.out.println("Кількість симетричних комбінацій за добу: " + symmetricCount);
    }
}
