package pl.lukabrasi.emailsender.commons;

import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.TemplateEngine;

public class EmailController {


    private final EmailSender emailSender;
    private final TemplateEngine templateEngine;

    public EmailController(EmailSender emailSender, TemplateEngine templateEngine) {
        this.emailSender = emailSender;
        this.templateEngine = templateEngine;
    }

@GetMapping("/")
    public String home(){
        return "index";
}

}
