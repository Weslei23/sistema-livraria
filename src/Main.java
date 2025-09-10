import Entity.Autor;
import Entity.Biblioteca;
import Entity.Livro;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main( String[] args )
    {
        Biblioteca biblioteca = new Biblioteca();

        Autor weslei = new Autor( LocalDate.parse("2003-10-23"), 1, "Weslei" );
        Autor ana = new Autor( LocalDate.parse("2003-10-23"), 2, "Ana" );
        biblioteca.adicionarAutor( weslei );
        biblioteca.adicionarAutor( ana );

        biblioteca.adicionarLivro( new Livro(  LocalDate.of( 2025, 10,23 ), weslei, "Livro 1", 1 ) );
        biblioteca.adicionarLivro( new Livro(  LocalDate.of( 2025, 9, 1 ), ana,  "Livro 2", 2 ) );

        System.out.println(biblioteca.listarLivros());
    }
}