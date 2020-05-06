package com.mycompany.motorista;

/**
 *
 * @author gatok
 */
public abstract class Motorista {

  private String nome;
  //private int kmFinal

  // Getters & Setters
  public String getNome() {
    return this.nome;
  }

  // public int getKmFinal() {
  //   return this.kmFinal;
  // }

  public void setNome(final String n) {
    this.nome = n;
  }

  // public void setKmFinal(final int kmF) {
  //   this.kmFinal = kmF;
  // }

  public abstract int distanciaPercorrida();
}