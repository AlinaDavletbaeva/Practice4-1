public class Book {

    String name;
    String author;
    int pages;

    public String toString() {
        String s = '\n'+"Book name - " + name + '\n' + "Autor - " + author + '\n' + "Pages - " + pages;
        return s;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}