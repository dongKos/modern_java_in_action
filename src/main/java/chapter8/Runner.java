package chapter8;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.Map.entry;

public class Runner {
    public static void main(String[] args) {
        List<String> immutableFriends = List.of("dongko", "eon", "kim");
//        immutableFriends.add("who"); compile error!

//        Set<String> set = Set.of("dongko", "dongko"); compile error!
        Map<String, Integer> ageOfFriends =
            Map.of("dongko", 31, "eon", 28);
        System.out.println(ageOfFriends);

        Map<String, Integer> ageOfFriends2 =
            Map.ofEntries(
                entry("dongko", 31),
                entry("eon", 28),
                entry("chae", 30),
                entry("chanho", 33)
            );
        System.out.println(ageOfFriends2);


        List<String> friends = new ArrayList<>();
        friends.add("dongko");
        friends.add("eon");
        friends.removeIf(friend -> friend.equals("dongko"));
        System.out.println(friends);

        ageOfFriends2.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())
            .forEachOrdered(System.out::println);

        var faker = new Faker();
        System.out.println(faker.leagueOfLegends().champion());
        var champions =
            IntStream.rangeClosed(1, 200)
                .mapToObj(i -> faker.leagueOfLegends().champion())
                .toList();
        System.out.println(champions);

    }
}
