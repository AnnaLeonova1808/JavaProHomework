package javaPro.homework_All.homework_2023_11_22.taski.task_7_OnlineRestaurant;

//3.3. Класс MenuItem:
//Поля: String name, double price, String ingredients, boolean isVegetarian.
//Методы для представления блюда в меню.
public class MenuItem {
    private String name;
    private double price;
    private String ingredients;
    private boolean isVegetarian;


    public MenuItem(String name, double price, String ingredients, boolean isVegetarian) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredients='" + ingredients + '\'' +
                ", isVegetarian=" + isVegetarian +
                '}';
    }

    public void displayMenuItem() {
        System.out.println("Название блюда: " + this.name);
        System.out.println("Цена: " + this.price);
        System.out.println("Ингредиенты: " + this.ingredients);
        System.out.println("Вегетарианское: " + (this.isVegetarian ? "Да" : "Нет"));
    }

}
