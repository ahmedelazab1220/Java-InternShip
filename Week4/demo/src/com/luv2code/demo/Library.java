package com.luv2code.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SuppressWarnings("ALL")
public class Library {

    private final List<Item> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        boolean found = items.stream().map(tmp -> (tmp == item)).reduce(false, (a, b) -> a || b);
        if (!found) {
            System.out.println(item.getItemType() + " there is no exist in library");
            return;
        }
        items.remove(item);
    }

    private Item getItem(ItemType type, String title, String author, LocalDate Publication) {
        return items.stream()
                .filter(item -> (item.getItemType() == type) &&
                        (item.getTitle().equalsIgnoreCase(title)) &&
                        (item.getAuthor().equalsIgnoreCase(author)) &&
                        (item.getPublication().equals(Publication)))
                .findFirst().orElse(null);
    }

    public void updateItem(Item item) {
        Optional<Item> result = Optional.ofNullable(getItem(item.getItemType(), item.getTitle(), item.getAuthor(), item.getPublication()));

        if (result.isPresent()) {
            items.remove(result.get());
        }
        items.add(item);
    }

    public void displayAllItems() {
        System.out.println("Library Items - ");
        for (Item item : items) {
            System.out.println(item.displayInfo());
        }
    }

}
