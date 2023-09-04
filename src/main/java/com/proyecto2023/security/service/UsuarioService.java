package com.proyecto2023.security.service;

import com.proyecto2023.crud.entity.Producto;
import com.proyecto2023.security.entity.Usuario;
import com.proyecto2023.security.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsById(int id){
        return usuarioRepository.existsById(id);
    }

    public Optional<Usuario> getOne(int id){
        return usuarioRepository.findById(id);
    }
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByNombre(String nombre){
        return usuarioRepository.existsByNombre(nombre);
    }
    public void delete(int id){
    	usuarioRepository.deleteById(id);
    }
    public Optional<Usuario> getByNombre(String nombre){
        return usuarioRepository.findByNombre(nombre);
    }
    public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    public List<Usuario> list(){
        return usuarioRepository.findAll();
    }
}
