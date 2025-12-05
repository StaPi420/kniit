package org.kniit.lab9.task15;

public enum Season {
    SUMMER("Лето", "Жарко", "День России"),
    AUTUMN("Осень", "Прохладно", "День знаний"),
    WINTER("Зима", "Холодно", "Новый год"),
    SPRING("Весна", "Тепло", "День Победы");


    private String title;
    private String temperature;
    private String holiday;


    Season(String title, String temperature, String holiday){
        this.title = title;
        this.temperature = temperature;
        this.holiday = holiday;
    }

    @Override
    public String toString(){
        return "Название: " + title + ". Температура: " + temperature + ". Главный праздник: " + holiday;
    }
}
