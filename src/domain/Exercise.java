package domain;

public class Exercise {
    public static int countSymmetricTimes() {
        int count = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                String hStr = String.format("%02d", h);
                String mStr = String.format("%02d", m);
                String reversedM = new StringBuilder(mStr).reverse().toString();
                if (hStr.equals(reversedM)) {
                    count++;
                }
            }
        }
        return count;
    }
}
