package lv.tsi.books;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BookController {
    BookRepository bookRep;

    @Autowired
    BookController(BookRepository bookRep){
        this.bookRep = bookRep;
    }

    @GetMapping("/getBooks")
    ResponseEntity<Iterable<Book>> findBooks(){
       return ResponseEntity.ok(bookRep.findAll());
    }

    @GetMapping("/getBook")
    ResponseEntity<Optional<Book>> findBook(@RequestParam(value = "id") Long id){
        return ResponseEntity.ok(bookRep.findById(id));
    }
}
