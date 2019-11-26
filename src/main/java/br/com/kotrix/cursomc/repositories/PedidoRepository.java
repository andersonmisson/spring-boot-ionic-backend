package br.com.kotrix.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kotrix.cursomc.domain.Pedido;
// com REPOSITORY ele faz as alterações automaticas no Banco de Dados Pedido
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
