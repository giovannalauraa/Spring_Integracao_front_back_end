package ifsp.edu.br.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ifsp.edu.br.demo.model.Perfil;
import ifsp.edu.br.demo.repository.PerfilRepository;

@RestController
@CrossOrigin
public class PerfilController {
    // 1. Método para adicionar novo Perfil

    // 2. Listar todos os perfis
    @GetMapping("/perfil")
    public List<Perfil> listaTodosPerfis() {
        return PerfilRepository.all();
    }

    @GetMapping("/Perfil/{id}")
    public Perfil recuperarPerfilById(@PathVariable("id") int idPerfil) {
        return PerfilRepository.getById(idPerfil);
    }

    @PostMapping("/perfil")
    public void addPerfil(
            @RequestBody Perfil perfil) {
        PerfilRepository.add(perfil);
    }

}
