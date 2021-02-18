import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author PedroRodrigues
 * @version 18/02/2021
 */
class Book
{
    // The fields.
    private final String author;
    private final String title;
    private final int pages;
    private String refNumber;
    private int timesBorrowed;
    private  boolean isAvailable;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages) {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        isAvailable = true;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }

    public int getTimesBorrowed() {
        return timesBorrowed;
    }

    public void setTimesBorrowed(int timesBorrowed) {
        this.timesBorrowed = timesBorrowed;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        if (refNumber.length() > 2) {
            this.refNumber = refNumber;
        }else System.err.println("Referência inválida!");
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void printAuthor() {
        System.out.println("Author: " + getAuthor());
    }

    public void printTitle() {
        System.out.println("Title: " + getTitle());
    }

    public void printDetails() {
        if (!getRefNumber().equals("")) {
            if (getIsAvailable()) {
                System.out.println("-----------------------------\n" +
                        "Autor: " + getAuthor() + "\n" +
                        "Título: " + getTitle() + "\n" +
                        "Número de Páginas: " + getPages() + "\n" +
                        "Referência: " + getRefNumber() + "\n" +
                        "Número do empréstimo: " + getTimesBorrowed() + "\n" +
                        "Disponível: Sim " + "\n" +
                        "-----------------------------");
            }else {
                System.out.println("-----------------------------\n" +
                        "Autor: " + getAuthor() + "\n" +
                        "Título: " + getTitle() + "\n" +
                        "Número de Páginas: " + getPages() + "\n" +
                        "Referência: " + getRefNumber() + "\n" +
                        "Número do empréstimo: " + getTimesBorrowed() + "\n" +
                        "Disponível: Não " + "\n" +
                        "-----------------------------");
            }
        }else if (getIsAvailable()) {
            System.out.println("-----------------------------\n" +
                    "Autor: " + getAuthor() + "\n" +
                    "Título: " + getTitle() + "\n" +
                    "Número de Páginas: " + getPages() + "\n" +
                    "Referência: N/D " + "\n" +
                    "Número do empréstimo: " + getTimesBorrowed() + "\n" +
                    "Disponível: Sim " + "\n" +
                    "-----------------------------");
        }else {
            System.out.println("-----------------------------\n" +
                    "Autor: " + getAuthor() + "\n" +
                    "Título: " + getTitle() + "\n" +
                    "Número de Páginas: " + getPages() + "\n" +
                    "Referência: N/D " + "\n" +
                    "Número do empréstimo: " + getTimesBorrowed() + "\n" +
                    "Disponível: Não " + "\n" +
                    "-----------------------------");
        }

    }

    public void borrow() {
        if (getIsAvailable()) {
            setIsAvailable(false);
            setTimesBorrowed(getTimesBorrowed() + 1);
            System.out.println("-------------------------------------------\n" +
                    "Empréstimo realizado em " + getDateTime() + "\n" +
                    "Título: " + getTitle() + "\n" +
                    "Referência: " + getRefNumber() + "\n" +
                    "Número do empréstimo: " + getTimesBorrowed() + "\n" +
                    "-------------------------------------------");
        }else System.err.println("Livro não disonível!");
    }

    public void returnToShelf() {
        if (!getIsAvailable()){
            System.out.println("-------------------------------------------\n" +
                    "Devolução realizada em " + getDateTime() + "\n" +
                    "Título: " + getTitle() + "\n" +
                    "Referência: " + getRefNumber() + "\n" +
                    "Número do empréstimo: " + getTimesBorrowed() + "\n" +
                    "-------------------------------------------");
            setIsAvailable(true);
        }else System.err.println("Livro não está emprestado!");

    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
