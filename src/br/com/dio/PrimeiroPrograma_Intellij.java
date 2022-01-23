package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma_Intellij {
    public static void main(String[] args) {
        Gato gato = new Gato ();
        System.out.println(gato);

        Propietario propietario01 = new Propietario("Frederico", "Rua das Camelias", 28);
        System.out.println(propietario01);
        /*     int a =15 ;
        int b= 18;
        System.out.println("Hello Word "+(a+b+a+b));*/
    }
}
class Propietario{
    private String nome;
    private String endereco;
    private Integer idade;

    public Propietario(String nome, String endereco, Integer idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", idade=" + idade +
                '}';
    }
}
