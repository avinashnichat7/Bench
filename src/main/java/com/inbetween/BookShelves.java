package com.inbetween;

import java.util.Arrays;

public class BookShelves {
    public static void main(String[] args) {
        int[] bookshelves = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int friends = 3;

        int result = minMaxBooksToSearch(bookshelves, friends);
        System.out.println("Minimum maximum number of books to search: " + result);
    }

    public static int minMaxBooksToSearch(int[] bookshelves, int friends) {
        int left = Arrays.stream(bookshelves).max().getAsInt(); // The minimum possible value of max books
        int right = Arrays.stream(bookshelves).sum(); // The maximum possible value of max books

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isValidPartition(bookshelves, friends, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static boolean isValidPartition(int[] bookshelves, int friends, int maxBooks) {
        int currentSum = 0;
        int friendCount = 1;

        for (int i = 0; i < bookshelves.length; i++) {
            if (currentSum + bookshelves[i] <= maxBooks) {
                currentSum += bookshelves[i];
            } else {
                currentSum = bookshelves[i];
                friendCount++;
            }

            if (friendCount > friends) {
                return false;
            }
        }

        return true;
    }
}
