package lv.tsi.books;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @JsonProperty
    Long id;
    @JsonProperty
    String author;
    @JsonProperty
    String name;
    @JsonProperty
    int copies;
}
