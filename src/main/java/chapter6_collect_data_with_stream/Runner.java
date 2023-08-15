package chapter6_collect_data_with_stream;

import chapter5_stream_uses.chapter5_6_practice.model.Trader;
import chapter5_stream_uses.chapter5_6_practice.model.Transaction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static chapter5_stream_uses.chapter5_6_practice.Runner.transactions;

public class Runner {

    public static void main(String[] args) {
        groupTransactionsByCurrency();
    }

    private static void groupTransactionsByCurrency() {
        List<Transaction> transactionList = transactions;

        Map<Trader, List<Transaction>> mapByTrader = transactionList.stream().collect(
            Collectors.groupingBy(Transaction::getTrader)
        );
        System.out.println(mapByTrader);
    }
}
