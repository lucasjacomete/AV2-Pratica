package br.com.Pergunta2;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    AchadoPerdido achadoPerdido = new AchadoPerdido("Titulo", "Descrição", "Tipo", "Correto");
    achadoPerdido.completaDados("Foto", "Local Achado", "Data e Hora");
    boolean busca = achadoPerdido.buscarTitulo(achadoPerdido.getTitulo());
    if (busca == true) {
      JOptionPane.showMessageDialog(null, "Titulo Encontrado!");
    } else {
      JOptionPane.showMessageDialog(null, "Não foi possível encontrar Titulo pesquisado!");
    }
    JOptionPane.showMessageDialog(null, achadoPerdido.visualizar());
  }
}