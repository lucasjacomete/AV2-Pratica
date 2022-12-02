package br.com.Pergunta2;

public class AchadoPerdido implements Publicacao {
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String localAchado;
    private String dataHora;
    private String status;
  
    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
      this.titulo = titulo;
      this.descricao = descricao;
      this.tipo = tipo;
      this.status = status;
    }
  
    public String getTitulo() {
      return titulo;
    }
  
    public void completaDados(String foto, String local_achado, String dataHora) {
      this.foto = foto;
      this.localAchado = local_achado;
      this.dataHora = dataHora;
    }
  
    @Override
    public boolean buscarTitulo(String titulo) {
      if (this.titulo.equals(titulo)) {
        return true;
      } else {
        return false;
      }
    }
  
    @Override
    public String visualizar() {
      return "Detalhes do Item: \nTitulo: " + this.titulo + "\nDescrição: " + this.descricao + "\nFoto: " + this.foto
          + "\nTipo: " + this.tipo + "\nLocal Achado: " + this.localAchado + "\nData e Hora: " + this.dataHora
          + "\nStatus do item: " + this.status;
    }
  
  }

