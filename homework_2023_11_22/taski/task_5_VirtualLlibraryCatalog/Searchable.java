package javaPro.homework_All.homework_2023_11_22.taski.task_5_VirtualLlibraryCatalog;
//3.9. Интерфейс Searchable:
//Методы: searchByTitle(String title), searchByAuthor(String authorName), searchByPublisher(String publisherName).
public interface Searchable {
    void searchByTitle(String title);
    void searchByAuthor(String authorName);
    void searchByPublisher(String publisherName);
}
