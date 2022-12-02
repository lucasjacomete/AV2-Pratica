package br.com.Pergunta1;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RedeSocial {
  private String dataCriacao;
  private String nomeUsuario;
  private String dataNascimento;
  private String senha;

  private ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();

  public RedeSocial(String nomeUsuario, String dataNascimento, String senha) {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    this.dataCriacao = dateFormat.format(new Date());
    this.nomeUsuario = nomeUsuario;
    this.dataNascimento = dataNascimento;
    this.senha = senha;
  }

  public String getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public String getNomeUsuario() {
    return nomeUsuario;
  }

  public void setNomeUsuario(String nomeUsuario) {
    this.nomeUsuario = nomeUsuario;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public ArrayList<Publicacao> getPublicacoes() {
    return publicacoes;
  }

  public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
    this.publicacoes = publicacoes;
  }

  public void inserePublicacao(Publicacao publi) {
    this.publicacoes.add(publi);
  }

  public void imprimePublicacoes() {
    System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());
    for (Publicacao publicacao : publicacoes) {
      System.out.println("Data e hora da publicação: " + publicacao.getDataPublicacao());
      System.out.println("Publicação: " + publicacao.getTextoPublicacao());
      System.out.println("Link: " + publicacao.getTextoPublicacao());
    }
  }
}