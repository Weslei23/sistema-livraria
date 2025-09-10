package Entity;

import java.time.LocalDate;

public class Autor
{
    private int id;
    private String nome;
    private LocalDate dataDeNascimento;

    public Autor( LocalDate dataDeNascimento, int id, String nome )
    {
        this.dataDeNascimento = dataDeNascimento;
        this.id = id;
        this.nome = nome;
    }

    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome( String nome )
    {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento()
    {
        return dataDeNascimento;
    }

    public void setDataDeNascimento( LocalDate dataDeNascimento )
    {
        this.dataDeNascimento = dataDeNascimento;
    }
}
