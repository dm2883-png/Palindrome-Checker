import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        LinkedList<Character> list = new LinkedList<>();

        for(char c : input.toCharArray()) {
            list.add(c);
        }

        boolean palindrome = true;

        while(list.size() > 1) {
            if(!list.removeFirst().equals(list.removeLast())) {
                palindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + palindrome);
    }
}