import java.util.List; 
import java.util.ArrayList;
import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {

        List<String>firstFruitsList = new ArrayList<>();
        List<String>secondFruitsList = new ArrayList<>();

        firstFruitsList.add("melancia");
        firstFruitsList.add("mamao");
        firstFruitsList.add("banana");
        firstFruitsList.add("maça");
        secondFruitsList.add("banana");
        secondFruitsList.add("limão");
        secondFruitsList.add("maça");

        System.out.println(firstFruitsList);

        firstFruitsList.retainAll(secondFruitsList);
        System.out.println(firstFruitsList);
    }
}
