public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Ícaro Andrade", 19, 1.68, 75.0, "160.684.795-15", "Rua H, 21", "99879-7499", "davi@gmail.com", "Masculino", "Solteiro");
        Pessoa pessoa2 = new Pessoa("Maria Helena", 19, 1.58, 54.0, "704.714.961-30", "Rua I, 04", "88778-7988", "maria@gmail.com", "Feminino", "Casada");

        System.out.println("Pessoa 1:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("Peso: " + pessoa1.getPeso());
        System.out.println("CPF: " + pessoa1.getCpf());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("Telefone: " + pessoa1.getTelefone());
        System.out.println("Email: " + pessoa1.getEmail());
        System.out.println("Gênero: " + pessoa1.getGenero());
        System.out.println("Estado Civil: " + pessoa1.getEstadoCivil());

        System.out.println("\nPessoa 2:");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Altura: " + pessoa2.getAltura());
        System.out.println("Peso: " + pessoa2.getPeso());
        System.out.println("CPF: " + pessoa2.getCpf());
        System.out.println("Endereço: " + pessoa2.getEndereco());
        System.out.println("Telefone: " + pessoa2.getTelefone());
        System.out.println("Email: " + pessoa2.getEmail());
        System.out.println("Gênero: " + pessoa2.getGenero());
        System.out.println("Estado Civil: " + pessoa2.getEstadoCivil());
    }
}
