import java.util.Arrays;

public class entrypoint{

    public static void main(String[] args){
        System.out.println("Hello");
        Hash hasher = new Hash();
        hasher.insere(12);
        System.out.println(Arrays.toString(hasher.lista));
        hasher.insere(450);
        System.out.println(Arrays.toString(hasher.lista));
        hasher.insere(83);
        System.out.println(Arrays.toString(hasher.lista));
        hasher.insere(20);
        System.out.println(Arrays.toString(hasher.lista));
        hasher.insere(19);
        System.out.println(Arrays.toString(hasher.lista));
        hasher.insere(88);
        System.out.println(Arrays.toString(hasher.lista));
        hasher.insere(52);
        System.out.println(Arrays.toString(hasher.lista));
        hasher.insere(99);
        System.out.println(Arrays.toString(hasher.lista));
    }
}