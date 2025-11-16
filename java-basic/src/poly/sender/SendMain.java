package poly.sender;

public class SendMain {
    Sender[] senders = {new EmailSender(), new SmsSender(), new
            FaceBookSender()};
    for (Sender sender : senders) {
        sender.sendMessage("환영합니다!");
    }
}
