package example.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcards")
public class CashCardController {
    @GetMapping("/{requestId}")
    public ResponseEntity<CashCard> findByid(@PathVariable Long requestId) {
        if (requestId.equals(99L)) {
            CashCard cashCard = new CashCard(99L, 0.0);
            return ResponseEntity.ok(cashCard);
        }
        return ResponseEntity.notFound().build();

    }
}
