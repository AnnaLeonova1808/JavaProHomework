package javaPro.homework_All.homework_2023_11_22.taski.task_7_OnlineRestaurant;

import java.time.LocalDate;
import java.util.List;

//3.2.    Класс Menu:
//        Поля: List<MenuItem> items, String description, LocalDate lastUpdated.
//        Методы для управления меню.
public class Menu {
    private List<MenuItem> items;
    private String description;
    private LocalDate lastUpdated;

    public Menu(List<MenuItem> items, String description, LocalDate lastUpdated) {
        this.items = items;
        this.description = description;
        this.lastUpdated = lastUpdated;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                ", description='" + description + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

    public void removeMenuItem(MenuItem itemToRemove) {
        if (items.remove(itemToRemove)) {
            lastUpdated = LocalDate.now();
            System.out.println("Блюдо '" + itemToRemove.getName() + "' успешно удалено из меню.");
        } else {
            System.out.println("Блюдо '" + itemToRemove.getName() + "' не найдено в меню.");
        }
    }

    public void displayMenu() {
        System.out.println("Меню ресторана: " + description);
        System.out.println("Последнее обновление: " + lastUpdated);
        System.out.println("Блюда в меню:");
        for (MenuItem item : items) {
            System.out.println("- " + item.getName() + " (Цена: " + item.getPrice() + ")");
        }
    }
    void addMenuItem(MenuItem newItem) {
        items.add(newItem);
        lastUpdated = LocalDate.now();
        System.out.println("Блюдо '" + newItem.getName() + "' успешно добавлено в меню.");
    }

}
