package br.com.museu.model;

import br.com.museu.service.ExposicaoService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistroVisita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Visitante visitante;

    @ManyToOne
    private Exposicao exposicao;

    private LocalDateTime dataHoraEntrada;
}
