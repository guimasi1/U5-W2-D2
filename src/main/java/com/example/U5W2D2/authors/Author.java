package com.example.U5W2D2.authors;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthday;
    private String avatarUrl;
}
