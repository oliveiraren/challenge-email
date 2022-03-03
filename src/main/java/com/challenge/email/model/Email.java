package com.challenge.email.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Email {

    private String from;
    private String to;
    private String subject;
    private String type;
    private String text;

}
