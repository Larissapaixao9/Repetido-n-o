import java.util.List; 
import java.util.ArrayList;
import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {

        List<String>firstFruitsList = new ArrayList<>();
        List<String>secondFruitsList = new ArrayList<>();
        List<String>response = new ArrayList<>();
        firstFruitsList.add("mamao, banana, morango, pera");
        secondFruitsList.add("banana, limão");
        System.out.println(firstFruitsList);

        if(firstFruitsList.size()>secondFruitsList.size()){
            for(int i=0;i<firstFruitsList.size();i++){
                for(int j=0;j<secondFruitsList.size();j++){
                    if(firstFruitsList.get(1).equals(secondFruitsList.get(0)) ){
                        response.add(firstFruitsList.get(i));
                    }
                }
            }
        }

        
        System.out.println(response);
    }
}
