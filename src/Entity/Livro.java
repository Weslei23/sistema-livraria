package Entity;

import java.time.LocalDate;

public class Livro
{
    private int id;
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualização;

    public Livro( LocalDate dataCadastro, Autor autor, String titulo, int id )
    {
        this.dataAtualização = LocalDate.now();
        this.dataCadastro = LocalDate.now();
        this.autor = autor;
        this.disponivel = true;
        this.titulo = titulo;
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public LocalDate getDataAtualização()
    {
        return dataAtualização;
    }

    public void setDataAtualização( LocalDate dataAtualização )
    {
        this.dataAtualização = dataAtualização;
    }

    public LocalDate getDataCadastro()
    {
        return dataCadastro;
    }

    public void setDataCadastro( LocalDate dataCadastro )
    {
        this.dataCadastro = dataCadastro;
    }

    public boolean isDisponivel()
    {
        return disponivel;
    }

    public Autor getAutor()
    {
        return autor;
    }

    public void setAutor( Autor autor )
    {
        this.autor = autor;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo )
    {
        this.titulo = titulo;
    }

    public void emprestar()
    {
        this.disponivel = false;
        this.dataAtualização = LocalDate.now();
    }

    @Override
    public String toString()
    {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", disponivel=" + disponivel +
                ", dataCadastro=" + dataCadastro +
                ", dataAtualização=" + dataAtualização +
                '}';
    }
}
