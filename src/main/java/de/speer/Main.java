package de.speer;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = List.of("Banana", "Pear", "Apple", "Pineapple", "Grapefruit", "Coconut");

        for (String fruit : fruits) {
            if(fruit.contains("a")){
                System.out.println(fruit);
            }
        }
        //1. Schritt -> Stream beginnen mit ".stream()"
        String sum = fruits.stream()
                //2. Schritt -> Verändernde Operationen

                .filter(currywurst -> currywurst.contains("a")) //lambda "->" ist eine Methodenreferenz (Arrowfunctions)
                .map(currywurst -> "Fruit in Basket= " + currywurst)
                .peek(currywurst -> System.out.println(currywurst)) //peek = Blick "riskieren"
                //.map(currywurst -> currywurst.length())


                //3. Terminator: schließt den Stream
                //.forEach(currywurst -> System.out.println(currywurst));
                //.reduce(0, (a,b) -> a+b);
                .collect(Collectors.joining(", "));

        System.out.println(sum);
    }
}