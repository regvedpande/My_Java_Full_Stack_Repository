package com.mkpits.method;

import java.util.Random;

public class RandomPasswordGenerator {

  public static String generatePassword(int length, String characterSet) {
    if (length <= 0) {
      throw new IllegalArgumentException("Password length must be positive.");
    }
    if (characterSet == null || characterSet.isEmpty()) {
      throw new IllegalArgumentException("Character set cannot be null or empty.");
    }

    StringBuilder password = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      int index = random.nextInt(characterSet.length());
      password.append(characterSet.charAt(index));
    }
    return password.toString();
  }

  public static void main(String[] args) {
    String password = generatePassword(10, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*");
    System.out.println("Generated Password: " + password);
  }
}

