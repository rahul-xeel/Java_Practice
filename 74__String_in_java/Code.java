public class Code{
    public static void main(String[] args) {

        // Creating Strings
        String firstName = "Rahul";
        String lastName = new String("Kumar");

        // Joining strings
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Length of string
        System.out.println("Length: " + fullName.length());

        // Accessing character
        System.out.println("Character at index 2: " + fullName.charAt(2));

        // Substring
        System.out.println("Substring (0,5): " + fullName.substring(0, 5));

        // Comparison
        System.out.println("Is firstName equals 'Rahul'? " + firstName.equals("Rahul"));

        // Using StringBuilder (mutable string)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!");
        System.out.println("StringBuilder Result: " + sb);
    }
}
