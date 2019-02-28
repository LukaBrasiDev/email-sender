package pl.lukabrasi.emailsender.commons;

public interface EmailSender {

    void sendEmail(String to, String ubject, String body);
}
