package rs.urosvesic.coreservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.urosvesic.coreservice.dto.ReactionDto;
import rs.urosvesic.coreservice.service.ReactionService;

/**
 * @author UrosVesic
 */
@RestController
@RequestMapping("/api/react")
@AllArgsConstructor
public class ReactionController {

    private ReactionService reactionService;
    @PostMapping
    public ResponseEntity<Void> react(@RequestBody ReactionDto reactionDto){
        reactionService.react(reactionDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
