package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RemovingCharacters {

    public static void main(String[] args) throws IOException {
        RemovingCharacters character = new RemovingCharacters();
        character.removeCharacter();
    }

    private void removeCharacter() throws IOException {
        String name = "Regved Pande";
        char[] original = name.toCharArray();

        // Get characters to remove from user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter characters to remove (separated by commas): ");
        String input = reader.readLine();
        char[] toRemove = input.replaceAll("\\s+", "").toCharArray();

        // Process removal as before
        char[] newArray = new char[original.length];
        int newIndex = 0;
        for (char c : original) {
            boolean shouldRemove = false;
            for (char r : toRemove) {
                if (c == r) {
                    shouldRemove = true;
                    break;
                }
            }
            if (!shouldRemove) {
                newArray[newIndex++] = c;
            }
        }
        newArray = Arrays.copyOf(newArray, newIndex);

        // Print the modified string
        System.out.println("Modified string: " + new String(newArray));
    }
}
