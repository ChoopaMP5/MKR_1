package pack;

public class AuthorMessage extends MessageDecorator {
    private String author;

    public AuthorMessage(Message message, String author) {
        super(message);
        this.author = author;
    }

    @Override
    public String getContent() {
        System.out.println("Виклик методу додавання автора з аргументом: " + message.getContent());
        return message.getContent() + ", автор: " + author;
    }
}



