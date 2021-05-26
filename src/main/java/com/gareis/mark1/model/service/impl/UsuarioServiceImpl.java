package com.gareis.mark1.model.service.impl;

import com.gareis.mark1.exception.RegraNegocioException;
import com.gareis.mark1.model.entity.Usuario;
import com.gareis.mark1.model.repository.UsuarioRepository;
import com.gareis.mark1.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository repository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {
        boolean existe = repository.existsByEmail(email);
        if(existe) {
            throw new RegraNegocioException("Já existe um usuario com este email!");
        }
    }
}
