package org.example.thirdLab;

import org.example.thirdLab.components.CentralProcessingUnit;
import org.example.thirdLab.components.HardDrive;
import org.example.thirdLab.components.VideoCard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Конфигурационный класс Spring, определяющий бины компонентов и их инициализацию.
 */
@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {

    /**
     * Создает и настраивает бин для Центрального процессора (CPU).
     * Использует методы инициализации и завершения "init" и "cleanup".
     *
     * @return Бин для CPU.
     */
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public CentralProcessingUnit cpu() {
        return new CentralProcessingUnit();
    }

    /**
     * Создает и настраивает бин для Жесткого диска (Hard Drive) с заданным размером.
     * Использует методы инициализации и завершения "init" и "cleanup".
     *
     * @return Бин для Hard Drive.
     */
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public HardDrive hardDrive() {
        return new HardDrive(500);
    }

    /**
     * Создает и настраивает бин для Видеокарты (Video Card) с указанным именем модели через фабрчный метод.
     * Использует методы инициализации и завершения "init" и "cleanup".
     *
     * @return Бин для Video Card.
     */
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public VideoCard videoCard() {
        return VideoCard.factoryVideocard("NVIDIA GeForce GTX 1660");
    }

    /**
     * Создает и настраивает бин для Персонального компьютера (Computer),
     * используя ранее определенные бины для CPU, Hard Drive и Video Card.
     * Использует методы инициализации и завершения "init" и "cleanup".
     *
     * @return Бин для Computer.
     */
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public Computer computer() {
        return new Computer(cpu(), hardDrive(), videoCard());
    }
}
