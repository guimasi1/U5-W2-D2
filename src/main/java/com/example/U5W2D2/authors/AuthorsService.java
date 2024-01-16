package com.example.U5W2D2.authors;

import com.example.U5W2D2.blogs.Blog;
import com.example.U5W2D2.exceptions.NotFoundException;
import lombok.Getter;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@Getter
public class AuthorsService {

    private List<Author> authors = new ArrayList<>();

    public Author save(Author body){
        Random rnd = new Random();
        body.setId(rnd.nextInt(1,3000));
        LocalDate date = LocalDate.of(rnd.nextInt(1930,2024),rnd.nextInt(1,13), rnd.nextInt(1,28));
        body.setBirthday(date);
        this.authors.add(body);
        return body;
    }

    public Author findById(int id) {
        Author found = null;
        for (int i = 0; i < authors.size(); i++) {
            if(authors.get(i).getId() == id) {
                found = authors.get(i);
            }
        }
        if (found == null) throw new NotFoundException(id);
        return found;
    }

}
