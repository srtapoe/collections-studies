package br.studies.beginner.challenge3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainAccount {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        Account patrice = new Account("84907-8", 500.0);
        Account olivia = new Account("84700-7", 1250.0);
        Account marshall = new Account("09149168-7", 5000.75);
        Account barney = new Account("18593-3", 7500.00);

        accounts.add(patrice);
        accounts.add(olivia);
        accounts.add(marshall);
        accounts.add(barney);

        accounts.stream()
                .map(Account::getBalance)
                .filter(balance -> balance > 0)
                .max(Comparator.naturalOrder())
                .ifPresentOrElse(
                        betterBalanceAccount -> System.out.println("Better balance account: " + betterBalanceAccount),
                        () -> System.out.println("No accounts found or all balances are negative.")
                );
    }
}
