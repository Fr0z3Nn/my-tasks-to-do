package ru.svivanov.OCT_12_2020;

public class Pirate {
    private final Long rank;
    private final String name;

    public Pirate(Long rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    public Long getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }
}
