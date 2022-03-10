public class ProjetoAula {
    
    public static void main(String[] args){
      
        Carro meuCarro = new Carro (); // Carro   >   é o tipo da variavel      meuCarro   >   é o nome da variavel       >       new Carro ()   >   instanciando a classe Carro

        System.out.println(meuCarro.proprietario.nome);

        meuCarro.proprietario.nome = "Joao";

        System.out.println(meuCarro.proprietario.nome);
    }
}


