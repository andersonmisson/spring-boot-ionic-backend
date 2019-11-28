package br.com.kotrix.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kotrix.cursomc.domain.ItemPedido;
// com REPOSITORY ele faz as alterações automaticas no Banco de Dados Categoria
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{

}
