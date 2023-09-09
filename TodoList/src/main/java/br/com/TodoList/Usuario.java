//Classe que representa a tabela Usuario

@Entity

public class Usuario {
    @Id
    @GeneretedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nome;
}

// criando os métodos gettes e setters. Respectivamente, são utilziados para retornar e alterar os atributos da classe.
public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id
    }

    public String getNome() {
        return nome;
    }


