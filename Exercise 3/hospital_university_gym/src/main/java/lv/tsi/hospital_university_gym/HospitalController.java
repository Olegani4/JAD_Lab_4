package lv.tsi.hospital_university_gym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HospitalController {
    HospitalRepository hospitalRep;

    @Autowired
    HospitalController(HospitalRepository hospitalRep){
        this.hospitalRep = hospitalRep;
    }

    @GetMapping("/getPatients")
    ResponseEntity<Iterable<Hospital>> findPatients(){
        return ResponseEntity.ok(hospitalRep.findAll());
    }

    @GetMapping("/getPatient")
    ResponseEntity<Optional<Hospital>> findPatient(@RequestParam(value = "id") Long id){
        return ResponseEntity.ok(hospitalRep.findById(id));
    }

}
