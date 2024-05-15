class Message {
    String text;

    Message(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return this.text;
    }
}

class SMS extends Message {
    String recipientContactNo;

    SMS(String text, String recipientContactNo) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public void setRecipientContactNo(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    @Override
    public String toString() {
        return "SMS: " + getRecipientContactNo() + " " + text;
    }
}

class Email extends Message {
    String sender;
    String receiver;
    String subject;

    Email(String text, String sender, String receiver, String subject) {
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Email: \nSender: " + getSender() + " Receiver: " + getReceiver() + " " + getSubject() + " " + "\n" + text;
    }
}

public class task1 {

    static boolean ContainsKeyword(Message messageObject, String keyword) {
        if (messageObject.toString().indexOf(keyword) >= 0)
            return true;
        return false;
    }

    

    public static void main(String[] args) {
        Message msg = new Message("This is Java ");
        
        Email email = new Email("This is java", "sender@email.com", "receiver@email.com", "How are you bro......?");

        SMS sms = new SMS("How are you bro.....?", "0300-1231231");

        System.out.println(sms);

        System.out.println("");
        System.out.println(email);

        System.out.println("");
        System.out.println("Message: " + msg);
        System.out.println("Contains IS keyword : " + ContainsKeyword(msg ,"is"));
    }

    
}
