//Classe que representa a tabela Lembrete no Banco de Dados

// Serve para que o JPA persista essa classe como uma tabela 

import org.apache.commons.math3.analysis.function.Identity;

Identity

public class Lembrete {
    @Id
    @GeneretedValue(strategy = GenerationType.IDENTITY) //Autoincremento o id para que nao seja preciso ficar criando id direto e possivelmente der conflito de id primary key ja existe
    private Long id;
    private String descricao;

    // criando os métodos gettes e setters. Respectivamente, são utilziados para retornar e alterar os atributos da classe.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}