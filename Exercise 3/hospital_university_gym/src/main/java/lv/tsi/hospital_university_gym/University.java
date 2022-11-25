package lv.tsi.hospital_university_gym;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class University {
    @Id
    @JsonProperty
    Long id;
    @JsonProperty
    String student_full_name;
    @JsonProperty
    String program;
    @JsonProperty
    String course;
    @JsonProperty
    String admission_date;
    @JsonProperty
    double average_mark;
}
