//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author authorIvan = new Author("Иванов", "Иван");
        Author authorPetr = new Author("Петров", "Пётр");
        Book book1 = new Book("Первая книга", authorIvan, 2025);
        Book book2 = new Book("Вторая книга", authorPetr, 1998);

        book2.setYear(2000);
        System.out.println("Теперь год издания второй книги "+book2.getYear());
        System.out.println("Автор первой книги " + book1.getAuthor().getName() + " " + book1.getAuthor().getFamily());
    }
}





