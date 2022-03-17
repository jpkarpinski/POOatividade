public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    String endereco;

    Pessoa(String nome){
        this.nome = nome;
        this.idade = 1;
    }

    Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.idade = 1;
        this.sobrenome = sobrenome;
    }

    Pessoa(String nome, String sobrenome, String endereco){
        this.nome = nome;
        this.idade = 1;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
    }

    void escreverIdade(){
        System.out.println(nome+ " tem "+ idade+ " anos.");
    }

    void somarIdade(int idade){
        this.idade = this.idade + idade;   // ".this" está chamando a idade da class Pessoa.

    }

    void escreverNome(){  //PROCEDIMENTO OU MÉTODO
        System.out.println(nome + " " + sobrenome);
    }

    String nomeSobrenome(){  //FUNÇÃO
        String nomeCompleto = nome + " " + sobrenome;
        return nomeCompleto;

    }



// A FUNÇÃO RETORNA UM RESULTADO! O PROCEDIMENTO OU MÉTODO NÃO.


}
