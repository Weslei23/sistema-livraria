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

    public List<Livro> listarLivros()
    {
        for( Livro livro : livros )
        {
            if( livro.isDisponivel() )
            {
                return livros;
            }
        }
        return null;
    }
}
