package pack;

public class EncryptedMessage extends MessageDecorator {

    public EncryptedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        System.out.println("Виклик методу шифрування з аргументом: " + message.getContent());
        return message.getContent() + ", зашифровано";
    }
}



