package academy.devdojo.maratonajava.javacore.M_interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }
}
