package com.kelsonthony.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kelsonthony.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
