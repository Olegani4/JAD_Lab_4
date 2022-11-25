package lv.tsi.hospital_university_gym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GymController {
    GymRepository gymRep;

    @Autowired
    GymController(GymRepository gymRep){
        this.gymRep = gymRep;
    }

    @GetMapping("/getClients")
    ResponseEntity<Iterable<Gym>> findClients(){
        return ResponseEntity.ok(gymRep.findAll());
    }

    @GetMapping("/getClient")
    ResponseEntity<Optional<Gym>> findClient(@RequestParam(value = "id") Long id){
        return ResponseEntity.ok(gymRep.findById(id));
    }

}
