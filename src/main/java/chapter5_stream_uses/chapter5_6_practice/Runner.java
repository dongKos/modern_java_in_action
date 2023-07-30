package chapter5_stream_uses.chapter5_6_practice;

import chapter5_stream_uses.chapter5_6_practice.model.Trader;
import chapter5_stream_uses.chapter5_6_practice.model.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Runner {
    private static Trader raoul = new Trader("Raoul", "Cambridge");
    private static Trader mario = new Trader("Mario", "Milan");
    private static Trader alan = new Trader("Alan", "Cambridge");
    private static Trader brian = new Trader("Brian", "Cambridge");
    private static List<Transaction> transactions = Arrays.asList(
        new Transaction(brian, 2011, 300),
        new Transaction(raoul, 2012, 1000),
        new Transaction(raoul, 2011, 400),
        new Transaction(mario, 2012, 710),
        new Transaction(mario, 2012, 700),
        new Transaction(alan, 2012, 950)
    );

    public static void main(String[] args) {
        _2011년에_일어난_모든_트랜잭션을_찾아_오름차순으로_정리하시오();
        거래자가_근무하는_모든_도시를_중복_없이_나열하시오();
        케임브리지에서_근무하는_모든_거래자를_찾아서_이름순으로_정렬하시오();
        모든_거래자의_이름을_알파벳순으로_정렬해서_반환하시오();
        밀라노에_거래자가_있는가();
        케임브릿지에_거주하는_거래자의_모든_트랜잭션값을_출력하시오();
        전체_트랜잭션_중_최댓값은_얼마인가();
        전체_트랜잭션_중_최솟값은_얼마인가();
    }

    private static void _2011년에_일어난_모든_트랜잭션을_찾아_오름차순으로_정리하시오() {
        System.out.println("_2011년에_일어난_모든_트랜잭션을_찾아_오름차순으로_정리하시오");
        var result = transactions.stream()
            .filter(transaction -> transaction.getYear() == 2011)
            .sorted(Comparator.comparing(Transaction::getValue))
            .toList();
        result.forEach(System.out::println);
    }

    private static void 거래자가_근무하는_모든_도시를_중복_없이_나열하시오() {
        System.out.println("거래자가_근무하는_모든_도시를_중복_없이_나열하시오");
        var result = transactions.stream()
            .map(transaction -> transaction.getTrader().getCity())
            .distinct()
            .toList();
        result.forEach(System.out::println);
    }

    private static void 케임브리지에서_근무하는_모든_거래자를_찾아서_이름순으로_정렬하시오() {
        System.out.println("케임브리지에서_근무하는_모든_거래자를_찾아서_이름순으로_정렬하시오");
        var result = transactions.stream()
            .map(Transaction::getTrader)
            .filter(trader -> trader.getCity().equalsIgnoreCase("Cambridge"))
            .distinct()
            .sorted(Comparator.comparing(Trader::getName))
            .toList();
        result.forEach(System.out::println);
    }

    private static void 모든_거래자의_이름을_알파벳순으로_정렬해서_반환하시오() {
        System.out.println("모든_거래자의_이름을_알파벳순으로_정렬해서_반환하시오");
        var result = transactions.stream()
            .map(transaction -> transaction.getTrader().getName())
            .distinct()
            .sorted()
            .reduce("", (a, b) -> a + b);
        System.out.println(result);
    }

    private static void 밀라노에_거래자가_있는가() {
        System.out.println("밀라노에_거래자가_있는가");
        var result = transactions.stream()
            .anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("milan"));
        System.out.println(result);
    }

    private static void 케임브릿지에_거주하는_거래자의_모든_트랜잭션값을_출력하시오() {
        System.out.println("케임브릿지에_거주하는_거래자의_모든_트랜잭션값을_출력하시오");
        transactions.stream()
            .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("cambridge"))
            .map(Transaction::getValue)
            .forEach(System.out::println);
    }

    private static void 전체_트랜잭션_중_최댓값은_얼마인가() {
        System.out.println("전체_트랜잭션_중_최댓값은_얼마인가");
        var result = transactions.stream()
            .map(Transaction::getValue)
            .reduce(0, Integer::max);
        System.out.println(result);
    }

    private static void 전체_트랜잭션_중_최솟값은_얼마인가() {
        System.out.println("전체_트랜잭션_중_최솟값은_얼마인가");
        var result = transactions.stream()
            .map(Transaction::getValue)
            .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(result);
    }
}
