package com.github.juceliodesa.citiesapi.contries;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")  // informando ao Spring a requisicao passando a rota
public class ContryResource {

    // @Autowired  // mandando o spring injetar isso no projeto

    // O comando acima funciona do mesmo jeito que este construtor
    public ContryResource(CountryRepository repository) {
        this.repository = repository;
    }

    private CountryRepository repository;

    @GetMapping // passsando o contries atraves de Get
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);   // Metodo do Jpa SpringData
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getOne(@PathVariable long id) {
        Optional<Country> optional = repository.findById(id);

        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }


    }
}