package pack;

public class TimestampedMessage extends MessageDecorator {

    public TimestampedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        System.out.println("Виклик методу додавання часу з аргументом: " + message.getContent());
        String timestamp = "2024-11-06 15:30:45"; // Заглушка для часу
        return message.getContent() + ", час: " + timestamp;
    }
}


