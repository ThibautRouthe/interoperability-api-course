package fr.ensim.interop.introrest.controller;

import fr.ensim.interop.introrest.model.Equipe;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class EquipeRestController {

    private List<Equipe> equipeListe= new ArrayList<>();
    private AtomicInteger count = new AtomicInteger(0);

    @PostMapping("/equipe")
    public ResponseEntity<Equipe> equipe(@RequestBody Equipe equipe) {

        if(!StringUtils.hasText(equipe.getName())){
            return ResponseEntity.badRequest().build();
        }
        if(equipeListe.contains(equipe)){
            return ResponseEntity.badRequest().build();
        }

        equipe.setId(count.incrementAndGet());

        equipeListe.add(equipe);

        return ResponseEntity.ok().body(equipe);
    }

    @GetMapping("/equipe")
    public ResponseEntity<Equipe> equipe()
}
