package chatbot;

import java.util.Scanner;

public class ChatBotApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, I am a chatbot. How can I help you today?");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("bye")) {
                System.out.println("Goodbye! Have a great day.");
                break;
            }
            if (input.equals("what is your name?")) {
                System.out.println("My name is ChatBot.");
                continue;
            }
            System.out.println("I'm sorry, I didn't understand what you said. Could you please repeat?");
        }
        scanner.close();
    }
}
