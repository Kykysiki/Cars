package transport;

public class Validation {
    public static String validDefault(String value, String validDefault) {
        if (value == null || value.isBlank()) {
            return validDefault;
        } else {
            return value;
        }
    }

    public static int defaultNum(int value) {
        if (value >= 0) {
            return value;
        } else {
            return Math.abs(value);
        }
    }
}
