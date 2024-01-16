package com.example.U5W2D2.blogs;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private int id;
    private String category;
    private String title;
    private String coverUrl;
    private String content;
    private int readingTime;

}
