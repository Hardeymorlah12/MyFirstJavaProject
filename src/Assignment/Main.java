package Assignment;
import java.lang.StringBuilder;
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // Append to the StringBuilder
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");

        System.out.println(sb.toString());
        System.out.println(sb.charAt(3));

        // Insert at a specific index
        sb.insert(6, "there,");
        System.out.println(sb.toString());

        // delete Characters
        sb.delete(5, 14);
        System.out.println(sb.toString());

        // Replace Characters
        sb.append("there");
        sb.replace(6, 11, "java");
        System.out.println(sb.toString());

    }
}
