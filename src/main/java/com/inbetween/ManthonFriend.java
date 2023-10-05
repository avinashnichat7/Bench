package com.inbetween;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ManthonFriend {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("manthans friend Number");
        int N = scanner.nextInt(); // Number of Manthan's friends
        System.out.println("number of manthans friends each friend");
        int K = scanner.nextInt(); // Number of friends each of Manthan's friends have

        scanner.nextLine(); // Consume the newline character

        Set<String> currentFriends = new HashSet<>();

        // Read Manthan's current friends
        for (int i = 0; i < N; i++) {
            String[] friends = scanner.nextLine().split(" ");
            currentFriends.addAll(Arrays.asList(friends));
        }

        Set<String> newFriends = new HashSet<>();

        // Read and process introductions from Manthan's friends
        for (int i = 0; i < N; i++) {
            String[] friendList = scanner.nextLine().split(" ");
            for (String friend : friendList) {
                if (!currentFriends.contains(friend)) {
                    newFriends.add(friend);
                }
            }
        }

        // Output the count of new friends
        System.out.println("Count of new friend " + newFriends.size());

    }
}


