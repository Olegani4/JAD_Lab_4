package lv.tsi.hospital_university_gym;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Gym {
    @Id
    @JsonProperty
    Long id;
    @JsonProperty
    String client_full_name;
    @JsonProperty
    String member_class;
    @JsonProperty
    String member_until;
    @JsonProperty
    double debt;
}
