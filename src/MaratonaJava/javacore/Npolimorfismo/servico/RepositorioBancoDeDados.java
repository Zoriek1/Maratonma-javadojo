package MaratonaJava.javacore.Npolimorfismo.servico;

import MaratonaJava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco de dados...");
    }}
