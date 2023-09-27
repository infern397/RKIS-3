package org.example.thirdLab;

import org.example.thirdLab.components.ComputerComponent;
import org.springframework.stereotype.Component;

/**
 * Класс, представляющий персональный компьютер.
 */
@Component
public class Computer {
    private final ComputerComponent videoCard;
    private final ComputerComponent cpu;
    private final ComputerComponent hardDrive;

    /**
     * Конструктор для инициализации компонента компьютера.
     *
     * @param videoCard Компонент видеокарты.
     * @param cpu       Компонент процессора.
     * @param hardDrive Компонент жесткого диска.
     */
    public Computer(
            ComputerComponent videoCard,
            ComputerComponent cpu,
            ComputerComponent hardDrive) {
        this.videoCard = videoCard;
        this.cpu = cpu;
        this.hardDrive = hardDrive;
    }

    /**
     * Инициализация ресурсов компьютера.
     */
    public void init() {
        System.out.println("Computer initialized");
    }

    /**
     * Завершение работы с ресурсами компьютера.
     */
    public void cleanup() {
        System.out.println("Computer cleaned up");
    }

    /**
     * Получение информации о компьютере в виде строки.
     *
     * @return Строка с информацией о компьютере.
     */
    public String getSystemInfo() {
        return "Personal computer with:\n" + cpu.getInfo() + "\n" + hardDrive.getInfo() + "\n" + videoCard.getInfo();
    }
}
