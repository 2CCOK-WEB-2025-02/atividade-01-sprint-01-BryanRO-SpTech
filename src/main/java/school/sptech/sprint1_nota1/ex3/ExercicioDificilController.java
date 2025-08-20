package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        List<Integer> valores = new ArrayList<>();

        valores.add(0);
        valores.add(1);

        int soma = 1;

        for(int i = 1; i < n; i++) {
            int ultimoValor = valores.get(valores.size() - 1);
            int penultimoValor = valores.get(valores.size() - 2);

            valores.add(penultimoValor + ultimoValor);

            soma += penultimoValor + ultimoValor;
        }

        ExercicioDificilResponse response = new ExercicioDificilResponse();


        if(n <= 0) {
            response.setEnesimoTermo(0);
            response.setSoma(0);

            return response;
        }

        response.setEnesimoTermo(valores.get(valores.size() - 1));
        response.setSoma(soma);

        return response;
    }
}
