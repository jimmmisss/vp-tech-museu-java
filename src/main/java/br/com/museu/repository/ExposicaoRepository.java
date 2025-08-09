package br.com.museu.repository;

import br.com.museu.model.Exposicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExposicaoRepository extends JpaRepository<Exposicao, Long> {
}
