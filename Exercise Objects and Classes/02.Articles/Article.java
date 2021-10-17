public class Article {

    //полета -> характеристики
    private String title;
    private String content;
    private String author;

    //методи -> функционалности

    //конструктор
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //сменя content
    public void edit(String newContent) {
        this.content = newContent;
    }

    //сменя автора
    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    //сменя загалвието
    public void rename(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        //опиша как изглежда моя обект като стринг
        //"{title} - {content}:{author}"
        return title + " - " + content + ": " + author;
    }
}
