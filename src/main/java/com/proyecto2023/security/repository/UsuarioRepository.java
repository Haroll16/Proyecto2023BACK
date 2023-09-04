package com.proyecto2023.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto2023.security.entity.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    Optional<Usuario> findByNombre(String nombre);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByNombre(String nombre);
    boolean existsByEmail(String email);
 
}
