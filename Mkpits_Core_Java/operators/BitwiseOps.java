package com.mkpits.operators;

   public class BitwiseOps {
            public static void main(String[] args) {
                int x = 5;   // 00000101
                int y = 3;   // 00000011
        
                System.out.println(x & y);  // Bitwise AND: 00000001 (1)
                System.out.println(x | y);  // Bitwise OR:  00000111 (7)
                System.out.println(x ^ y);  // Bitwise XOR: 00000110 (6)
                System.out.println(~x);     // Bitwise NOT: 11111010 (-6) 
            }
        }
