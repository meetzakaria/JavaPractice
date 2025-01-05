package Practice;

// Custom Exception Class
class InvalidAgeException extends Exception {
    // কনস্ট্রাক্টর (ডিফল্ট মেসেজ)
    public InvalidAgeException() {
        super("Invalid age entered!");
    }

    // কনস্ট্রাক্টর (কাস্টম মেসেজ পাস করার জন্য)
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main Class
public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // ১৮ বছরের কম বয়স দিলে এক্সেপশন হবে
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    // Method to check age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        }
        System.out.println("Valid age: " + age);
    }
}
