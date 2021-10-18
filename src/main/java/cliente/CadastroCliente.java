package cliente;
import java.util.Scanner;
/**
 *
 * @author Wilson Diniz Silva
 * <p>Classe responsável pelo cadastro de clientes</p>
 */
public class CadastroCliente {

    /**
     * Metodo principal da classe CadastroCliente
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        
        System.out.print("Cliente: ");
        cliente.setNome(sc.nextLine());
        
        System.out.println("CPF: ");
        cliente.setCpf(sc.nextLine());
        
        System.out.println("Endereco: ");
        cliente.setEndereco(sc.nextLine());
        
        System.out.println("CEP: ");
        cliente.setCep(sc.nextLine());
        
        System.out.println("Bairro: ");
        cliente.setBairro(sc.nextLine());
        
        System.out.println("Cidade: ");
        cliente.setCidade(sc.nextLine());
        
        System.out.println("UF: ");
        cliente.setUf(sc.nextLine());
        
        System.out.println("Telefone: ");
        cliente.setTelefone(sc.nextLine());
        
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCep());
        System.out.println(cliente.getBairro());
        System.out.println(cliente.getCidade());
        System.out.println(cliente.getUf());
        
    }// Fim do metodo main
} // Fim da classe CadastroCliente
