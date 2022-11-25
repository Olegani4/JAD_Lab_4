package lv.tsi.hospital_university_gym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UniversityController {
    UniversityRepository universityRep;

    @Autowired
    UniversityController(UniversityRepository universityRep){
        this.universityRep = universityRep;
    }

    @GetMapping("/getStudents")
    ResponseEntity<Iterable<University>> findStudents(){
        return ResponseEntity.ok(universityRep.findAll());
    }

    @GetMapping("/getStudent")
    ResponseEntity<Optional<University>> findStudent(@RequestParam(value = "id") Long id){
        return ResponseEntity.ok(universityRep.findById(id));
    }
}
