package org.heao.demo.accounting_report_cli.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RandomDate {

    private static LocalDate buildDateDaysAgo (int daysAgo) {
        return LocalDate.now().minusDays(daysAgo);
    }

    public static CircularLinkedList<LocalDate> loadFakePastDates () {
        System.out.println("Load Fake Past Dates");

        List<LocalDate> days = new ArrayList<>();
        for (int i = 0; i < 365; i++)
            days.add(buildDateDaysAgo(i));

        return new CircularLinkedList<>(days);
    }

}
