package org.example.thirdLab.components;

/**
 * Класс, представляющий видеокарту компьютера.
 */
public class VideoCard implements ComputerComponent {
    private String model;

    /**
     * Конструктор для создания объекта видеокарты с указанной моделью.
     *
     * @param model Модель видеокарты.
     */
    public VideoCard(String model) {
        this.model = model;
    }

    /**
     * Конструктор для создания объекта видеокарты с моделью "Default" (по умолчанию).
     */
    public VideoCard() {
        this.model = "Default";
    }

    /**
     * Получает информацию о видеокарте в виде строки.
     *
     * @return Строка с информацией о видеокарте, включая ее модель.
     */
    @Override
    public String getInfo() {
        return "Video card model: " + model;
    }

    /**
     * Инициализация ресурсов видеокарты.
     */
    public void init() {
        System.out.println("Video card initialized");
    }

    /**
     * Завершение работы с ресурсами видеокарты.
     */
    public void cleanup() {
        System.out.println("Video card cleaned up");
    }

    /**
     * Устанавливает модель видеокарты.
     *
     * @param model Новая модель видеокарты.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Фабричный метод для создания объекта видеокарты с указанной моделью.
     *
     * @param model Модель видеокарты.
     * @return Объект видеокарты с указанной моделью.
     */
    static public VideoCard factoryVideocard(String model) {
        return new VideoCard(model);
    }
}
