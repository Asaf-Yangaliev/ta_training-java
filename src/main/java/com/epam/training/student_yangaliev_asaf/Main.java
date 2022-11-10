package com.epam.training.student_yangaliev_asaf;

public class Main {
    public static String eraseString(String s) {
        if (s == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        int begin = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int index = getMinIndex(s.indexOf(":-)", begin), s.indexOf(":-(", begin));
            if (index == -1) {
                sb.append(s, begin, s.length());
                break;
            }
            sb.append(s, begin, index);
            index += 2;
            char c = s.charAt(index);
            while (index < s.length() && c == s.charAt(index)) {
                index++;
            }
            begin = index;
        }
        return sb.toString();
    }

    public static int getMinIndex(int index1, int index2) {
        if (index1 == -1 && index2 == -1)
            return -1;
        else if (index1 == -1)
            return index2;
        else if (index2 == -1)
            return index1;
        else
            return Math.min(index1, index2);
    }
}
