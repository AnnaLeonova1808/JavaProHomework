package javaPro.saturday.homework_23_10_28;

import java.util.Collection;

/**
 * Требования:
 *
 * Параметризуйте класс Printer так, чтобы
 * он мог печатать только Document и его подклассы.
 * Добавьте в класс Printer метод printAll, который
 * принимает коллекцию документов и печатает каждый
 * из них.
 */
public class Printer <T extends Document>{
    public void print(T doc) {


        System.out.println("Печать документа: " + doc.toString());
    }
    public void printAll(Collection<T>documents){
        for (T doc :documents) {
            print(doc);
        }
    }

}

class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}

class ImageDocument extends Document {
    public ImageDocument(String content) {
        super(content);
    }
}

class TextDocument extends Document {
    public TextDocument(String content) {
        super(content);
    }
}
