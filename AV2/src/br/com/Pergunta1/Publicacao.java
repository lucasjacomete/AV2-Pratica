package br.com.Pergunta1;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Publicacao {
  private String dataPublicacao;
  private String textoPublicacao;
  private String linkPublicacao;
  public static double contadorPublicacao;

  public Publicacao(String textoPublicacao, String linkPublicacao) {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    this.dataPublicacao = dateFormat.format(new Date());
    this.textoPublicacao = textoPublicacao;
    this.linkPublicacao = linkPublicacao;
    contadorPublicacao++;
  }

  public void setTextoPublicacao(String textoPublicacao) {
    this.textoPublicacao = textoPublicacao;
  }

  public void setLinkPublicacao(String linkPublicacao) {
    this.linkPublicacao = linkPublicacao;
  }

  public String getDataPublicacao() {
    return dataPublicacao;
  }

  public String getTextoPublicacao() {
    return textoPublicacao;
  }

  public String getLinkPublicacao() {
    return linkPublicacao;
  }

  public static double getContadorPublicacao() {
    return contadorPublicacao;
  }
}