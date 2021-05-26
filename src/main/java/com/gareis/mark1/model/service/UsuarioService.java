package com.gareis.mark1.model.service;

import com.gareis.mark1.model.entity.Usuario;

public interface UsuarioService {

    Usuario autenticar(String email, String senha);
    Usuario salvarUsuario(Usuario usuario);
    void validarEmail(String email);

}
