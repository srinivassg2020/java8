package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class StreamOperations {

    public static void main(String... args){
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", false, 530, Dish.Type.OTHER),
                new Dish("rice", false, 350, Dish.Type.OTHER),
                new Dish("season fruit", false, 120, Dish.Type.OTHER),
                new Dish("pizza", false, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
        List<String> threeHighestCalories = menu.stream().filter(x->x.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(toList());
        threeHighestCalories.stream().forEach(x-> System.out.println(x));
        //count
        long count= menu.stream().filter(x->x.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .count();
        System.out.println("Count : "+count);
       // less Calories
        List<String> threeLeastCalories = menu.stream().filter(x->x.getCalories() < 320)
                .map(Dish::getName)
                .limit(3)
                .collect(toList());
        threeLeastCalories.stream().forEach(x-> System.out.println(x));

        // Sliced Menu
        List<Dish> slicedMenu = menu.stream().takeWhile(x->x.getCalories() < 120)
                .collect(toList());
        slicedMenu.stream().forEach(x-> System.out.println(x));
        System.out.println("Dish: slicedMenu  : "+slicedMenu);
        //takeWhile
        List<Integer> intItems = Arrays.asList(1,3,6,9,12,37,38,100);
        List<Integer> listIntegers = intItems.stream().takeWhile(x -> x < 38)
                .collect(toList());
        listIntegers.stream().forEach(x-> System.out.println(x));
        //DropWhile
        System.out.println("Dish: DropWhile  : ");
        List<Integer> dropIntegers = intItems.stream().dropWhile(x -> x < 38)
                .collect(toList());
        dropIntegers.stream().forEach(x-> System.out.println(x));
       // numbers
        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);
        Optional<Integer> sum = numbers.stream().reduce((a, b)->a+b);
        System.out.println("Sum: "+sum.get());

        //Max or Min
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println("max: "+max.get());
        //Max or Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.println("min: "+min.get());


    }
}
