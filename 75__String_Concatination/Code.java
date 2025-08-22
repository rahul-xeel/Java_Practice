public class Code {
    public static void main(String[] args) {

        String firstName = "Rahul";
        String lastName  = "Kumar";

        String name1 = firstName + " " + lastName;
        System.out.println("Using + : " + name1);

        String name2 = firstName.concat(" ").concat(lastName);
        System.out.println("Using concat() : " + name2);

        StringBuilder builder = new StringBuilder();
        builder.append(firstName).append(" ").append(lastName);
        System.out.println("Using StringBuilder : " + builder);

        String name3 = String.format("%s %s", firstName, lastName);
        System.out.println("Using String.format() : " + name3);
    }
}
