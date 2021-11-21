package academy.devdojo.maratonajava.javacore.M_interfaces.test;

import academy.devdojo.maratonajava.javacore.M_interfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.M_interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        System.out.println("=====================");
        fileLoader.remove();
        databaseLoader.remove();
    }
}
