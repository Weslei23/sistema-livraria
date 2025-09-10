package Entity;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca
{
    private List<Autor> autores = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();

    public void adicionarAutor( Autor autor )
    {
        this.autores.add( autor );
    }

    public void adicionarLivro( Livro livro )
    {
        this.livros.add( livro );
    }

    public void listarLivros()
    {
        for( Livro livro : livros )
        {
            if( livro.isDisponivel() )
            {
                System.out.println( livro.getId() );
                System.out.println( livro.getTitulo() );
            }
        }
    }

    public Livro buscarLivroPorId( int id )
    {
        for( Livro livro : livros )
        {
            if( livro.getId() == id )
            {
                return livro;
            }
        }
        return null;
    }
}
