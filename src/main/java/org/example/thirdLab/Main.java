package org.example.thirdLab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Главный класс приложения, который инициализирует Spring контекст и использует компонент "Computer".
 */
public class Main {
    /**
     * Основной метод приложения.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer.getSystemInfo());

        context.close();
    }
}
