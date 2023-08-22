package Assignment;

public class MainString {
    public static void main(String[] args) {
        String message = "I love Programming";
        char firstCharacter = message.charAt(0);
        System.out.println(firstCharacter);

        char lastCharacter = message.charAt(message.length() - 1);
        System.out.println(lastCharacter);

        String message2 = "Hello Darling!";
        String message3 = "You're doing well.";
        String concat = message2 + " " + message3;
        System.out.println(concat);
        System.out.println(message2.concat(message3));
        System.out.println(message2.toUpperCase());
        System.out.println(message3.length());
        System.out.println(message.toUpperCase());
    }
}
