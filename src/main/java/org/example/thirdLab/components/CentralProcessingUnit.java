package org.example.thirdLab.components;

import org.springframework.beans.factory.annotation.Value;

/**
 * Класс, представляющий центральный процессор (CPU) компьютера.
 */
public class CentralProcessingUnit implements ComputerComponent {
    private double frequencyGHz;

    /**
     * Конструктор для создания объекта CPU с указанной частотой.
     *
     * @param frequencyGHz Частота процессора в гигагерцах (GHz).
     */
    public CentralProcessingUnit(double frequencyGHz) {
        this.frequencyGHz = frequencyGHz;
    }

    /**
     * Конструктор для создания объекта CPU с нулевой частотой (по умолчанию).
     */
    public CentralProcessingUnit() {
        this.frequencyGHz = 0.0;
    }

    /**
     * Инициализация ресурсов процессора.
     */
    public void init() {
        System.out.println("CPU initialized");
    }

    /**
     * Завершение работы с ресурсами процессора.
     */
    public void cleanup() {
        System.out.println("CPU cleaned up");
    }

    /**
     * Получает информацию о процессоре в виде строки.
     *
     * @return Строка с информацией о процессоре, включая частоту.
     */
    @Override
    public String getInfo() {
        return "Processor with frequency: " + frequencyGHz + " GHz";
    }

    /**
     * Устанавливает частоту процессора.
     *
     * @param frequencyGHz Новая частота процессора в гигагерцах (GHz).
     */
    @Value("${cpuFrequency}")
    public void setFrequencyGHz(double frequencyGHz) {
        this.frequencyGHz = frequencyGHz;
    }
}
