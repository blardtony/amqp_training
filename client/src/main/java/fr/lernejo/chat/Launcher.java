package fr.lernejo.chat;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Launcher.class);
        Launcher launcher = ctx.getBean(Launcher.class);
        System.out.println(launcher);

        RabbitTemplate rabbitTemplate = new RabbitTemplate();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a message, we will sent it for you (q for quit)");
        while (true) {
            String input = scanner.next();
            if (input.equals("q")) {
                System.out.println("Bye");
                break;
            }
//            rabbitTemplate.convertAndSend("", input);
        }
    }
}
