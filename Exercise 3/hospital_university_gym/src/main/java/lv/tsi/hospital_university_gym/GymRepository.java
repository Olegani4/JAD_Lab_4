package lv.tsi.hospital_university_gym;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepository extends CrudRepository<Gym, Long> {
}
