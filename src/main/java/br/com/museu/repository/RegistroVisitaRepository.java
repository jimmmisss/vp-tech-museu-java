package br.com.museu.repository;

import br.com.museu.model.RegistroVisita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroVisitaRepository extends JpaRepository<RegistroVisita, Long> {
}
