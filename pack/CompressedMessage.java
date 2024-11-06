package pack;

public class CompressedMessage extends MessageDecorator {

    public CompressedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        System.out.println("Виклик методу стиснення з аргументом: " + message.getContent());
        return message.getContent() + ", стиснуто";
    }
}

