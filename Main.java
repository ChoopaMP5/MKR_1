import pack.*;

public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage("Це приклад повідомлення для обробки.");

        // Додавання стиснення
        message = new CompressedMessage(message);
        System.out.println("Форматоване повідомлення: " + message.getContent());

        // Додавання шифрування
        message = new EncryptedMessage(message);
        System.out.println("Форматоване повідомлення: " + message.getContent());

        // Додавання дати та часу
        message = new TimestampedMessage(message);
        System.out.println("Форматоване повідомлення: " + message.getContent());

        // Додавання автора
        message = new AuthorMessage(message, "Прізвище Ім'я");
        System.out.println("Форматоване повідомлення: " + message.getContent());
    }
}

