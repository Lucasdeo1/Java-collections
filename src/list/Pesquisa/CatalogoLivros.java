package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> catalogoLivros;//lista de livros


    public CatalogoLivros(){
        this.catalogoLivros = new ArrayList<>();
    }
    
    public void adicionarLivro( String titulo, String autor, int anoPublicacao ){
        catalogoLivros.add(new Livro(autor, titulo, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor( String autor ){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!catalogoLivros.isEmpty()){
            for (Livro livro : catalogoLivros) {
                if(livro.getAutor().equals(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervaloAnos( int anoInicial, int anoFinal ){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if (!catalogoLivros.isEmpty()) {
            for (Livro livro : catalogoLivros) {
                if(livro.getAnoPublicacao()>= anoInicial && livro.getAnoPublicacao()<= anoFinal){
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo ( String titulo ){
        Livro livroPorTitulo = null;

        if(!catalogoLivros.isEmpty()){
            for (Livro livro : catalogoLivros) {
                if(livro.getTitulo().equals(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("livro 1", "autor1", 2020);
        catalogoLivros.adicionarLivro("livro 2", "autor2", 2021);
        catalogoLivros.adicionarLivro("livro 3", "autor3", 2022);
        catalogoLivros.adicionarLivro("livro 2", "autor2", 2021);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor3"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 3"));
    }   

}
