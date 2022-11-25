package lv.tsi.hospital_university_gym;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hospital {
    @Id
    @JsonProperty
    Long id;
    @JsonProperty
    String patient_full_name;
    @JsonProperty
    int age;
    @JsonProperty
    String gender;
    @JsonProperty
    String admission_date;
    @JsonProperty
    String admission_reason;
}
