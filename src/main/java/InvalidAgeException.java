public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }

    public void print() {
        System.out.println(getMessage());
    }
}

