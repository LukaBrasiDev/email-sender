package pl.lukabrasi.emailsender.commons;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyEmail {

    private String subject;
    private String address;
    private String body;

}
