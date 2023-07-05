package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperations1 {
    public static void main(String... args){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brain = new Trader("Brain", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brain,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)

        );

        // Find All Trxns in 2011 and sort by value.

        List<Transaction> trxn2011 = transactions.stream().filter(x->x.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println("trxn2011 : ");
        trxn2011.stream().forEach(x-> System.out.println("Name: "+x.getTrader().getName()+" Value:"+x.getValue()));
       // Distinct Cities:
        Set<String> cities = transactions.stream().map(x->x.getTrader().getCity())
                .distinct()
                .collect(Collectors.toSet());
        System.out.println("cities : "+cities);


        // All traders from Cambridge and sort by name

        List<Trader> cambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(x -> x.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        cambridge.stream().forEach(x-> System.out.println(x.getName()));
        // Return All Traders Names in alphabet order:

        String name = transactions.stream().map(x->x.getTrader().getName())
                .sorted()
                .distinct()
                .reduce("",(n,m)-> n+m);
        System.out.println("name: "+name);
        String nameJoin = transactions.stream().map(x->x.getTrader().getName())
                .sorted()
                .distinct()
                .collect(Collectors.joining());
        System.out.println("nameJoin: "+nameJoin);

    }
}
