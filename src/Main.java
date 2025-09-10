import Entity.Autor;
import Entity.Biblioteca;
import Entity.Livro;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        Biblioteca biblioteca = new Biblioteca();

        Autor weslei = new Autor( LocalDate.parse("2003-10-23"), 1, "Weslei" );
        Autor ana = new Autor( LocalDate.parse("2003-10-23"), 2, "Ana" );
        biblioteca.adicionarAutor( weslei );
        biblioteca.adicionarAutor( ana );

        biblioteca.adicionarLivro( new Livro(  LocalDate.of( 2025, 10,23 ), weslei, "Livro 1", 1 ) );
        biblioteca.adicionarLivro( new Livro(  LocalDate.of( 2025, 9, 1 ), ana,  "Livro 2", 2 ) );
        biblioteca.adicionarLivro( new Livro(  LocalDate.of( 2025, 9, 1 ), ana,  "Livro 3", 3 ) );

        while( true )
        {
            System.out.println( "Gostaria de ver os livros que estão dispiníveis? ( SIM/NÃO )" );
            String resultado = input.nextLine();

            if( resultado.equalsIgnoreCase( "NÃO" ) )
            {
                System.out.println( "Voce escolheu a opção 'NÃO'. Encerrando a aplicação." );
                break;
            }
            else if ( resultado.equalsIgnoreCase( "SIM" ) )
            {
                biblioteca.listarLivros();

                System.out.println( "Digite o id do livro que deseja escolher: " );
                int idLivro = input.nextInt();

                Livro livro = biblioteca.buscarLivroPorId( idLivro );

                if( livro != null && livro.getId() == idLivro )
                {
                    System.out.println( "Digite seu nome: " );
                    String nome = input.next();

                    livro.emprestar();
                    System.out.println( "Livro " + livro.getTitulo() + " emprestado com sucesso ao cliente " + nome );
                }
                else
                {
                    System.out.println( "Livro não encontrado" );
                }
            }
            else
            {
                System.out.println( "Opção invalida. Digite SIM ou NÃO." );
            }
        }
        input.close();
    }
}