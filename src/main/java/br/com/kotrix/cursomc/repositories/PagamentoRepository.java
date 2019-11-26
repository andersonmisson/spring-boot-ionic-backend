package br.com.kotrix.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kotrix.cursomc.domain.Pagamento;
// com REPOSITORY ele faz as alterações automaticas no Banco de Dados Pagamento
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
