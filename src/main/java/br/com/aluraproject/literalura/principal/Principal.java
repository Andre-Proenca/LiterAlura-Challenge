package br.com.aluraproject.literalura.principal;

import br.com.aluraproject.literalura.service.ConverteDados;
import br.com.aluraproject.literalura.service.EbookApiConsumer;

import java.util.Scanner;

public class Principal {
    private Scanner scan = new Scanner(System.in);
    private EbookApiConsumer consumo = new EbookApiConsumer();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://gutendex.com/books/";

    public void exibeMenu() {
        var opcao = -1;
        while(opcao != 1) {
            var menu = """
                    1 - buscar livro pelo título.
                    2 - listar livros registrados.
                    3 - listar autores registrados.
                    4 - listar autores vivos em um determinado ano.
                    5 - listar livros em um determinado idioma.
                    0 - sair.
                    """;
            System.out.println(menu);
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    buscarLivroTitulo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    private void buscarLivroTitulo() {
    }
}
