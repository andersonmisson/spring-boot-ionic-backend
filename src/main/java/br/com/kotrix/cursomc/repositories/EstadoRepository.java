package br.com.kotrix.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.kotrix.cursomc.domain.Estado;
// com REPOSITORY ele faz as alterações automaticas no Banco de Dados Categoria
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
	@Transactional(readOnly=true)
	public List<Estado> findAllByOrderByNome(); //Ordenar Todos os Estados Por Nome

}
