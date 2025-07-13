package nevek.cursospring.produtosapi.repository;

import nevek.cursospring.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, String> {


    List<Produto> findAllById(String id);

    List<Produto> id(String id);

    List<Produto> findByNome(String nome);
}
