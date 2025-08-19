package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        String palavraLowerCase = palavra.toLowerCase();

        List<String> listPalavra = new ArrayList<>(Arrays.stream(palavraLowerCase.split("")).toList());

        Collections.reverse(listPalavra);

        return listPalavra.equals(Arrays.stream(palavraLowerCase.split("")).toList());

//        return palavra.equalsIgnoreCase(palavraInvertida);
    }
}
