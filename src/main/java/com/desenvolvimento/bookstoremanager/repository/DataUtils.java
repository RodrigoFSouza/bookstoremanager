package com.desenvolvimento.bookstoremanager.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataUtils {
    public static void main(String[] args) {
        LocalDate inicioPeriodo = LocalDate.now();
        LocalDate fimPeriodo = inicioPeriodo.minusMonths(12);

        List<Integer> meses = new ArrayList<>();

        meses.forEach(System.out::println);
    }
}
