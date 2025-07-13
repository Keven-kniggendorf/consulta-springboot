package nevek.cursospring.produtosapi.controller;

import nevek.cursospring.produtosapi.model.Produto;
import nevek.cursospring.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    @PostMapping("/salvar")
    public Produto salvar(@RequestBody Produto produto){
        var id = UUID.randomUUID().toString();
        produto.setId(id);
      produtoRepository.save(produto);
      return produto;
    }

    @GetMapping("/{id}")
    public Produto consultarIdProduto(@PathVariable("id") String id){
        return produtoRepository.findById(id).orElse(null);
    }


    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") String id){
         produtoRepository.deleteById(id);
    }

    //atualizar o objeto
    @PutMapping("{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Produto produto){
        produto.setId(id);
        produtoRepository.save(produto);
    }

    @GetMapping
    public List<Produto> consultarProdutos(@RequestParam("nome") String nome){
      return produtoRepository.findByNome(nome);

    }

}
