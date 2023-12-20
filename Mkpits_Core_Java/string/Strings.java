package com.mkpits.string;

/*
** Comprehensive explanation of String concepts in Java, covering essential details:**

**1. What is a String?**

- A sequence of characters (letters, numbers, symbols) used to represent text.
- It's a fundamental data type in Java, essential for storing and manipulating text data.
- It's a class, not a primitive type like `int` or `char`.

**2. Immutability:**

- Strings are immutable, meaning once created, their contents cannot be changed directly.
- Operations that seem to modify a string actually create a new string object with the desired changes.
- This ensures thread safety and prevents unintended side effects.

**3. Creating Strings:**

- **Literals:** Enclose characters within double quotes: `String name = "Alice";`
- **Constructors:** Use the `new` keyword: `String greeting = new String("Hello!");`

**4. Common String Methods:**

- **Accessing characters:** `charAt(index)`
- **Length:** `length()`
- **Concatenation:** `concat()`, `+` operator
- **Substring extraction:** `substring(start, end)`
- **Finding characters/substrings:** `indexOf()`, `lastIndexOf()`
- **Comparison:** `equals()`, `equalsIgnoreCase()`
- **Case conversion:** `toUpperCase()`, `toLowerCase()`
- **Trimming whitespace:** `trim()`
- **Replacing characters/substrings:** `replace(oldChar, newChar)`, `replace(target, replacement)`
- **Splitting strings:** `split(delimiter)`

**5. String Pool:**

- Java maintains a pool of string literals to save memory.
- When you create a string literal, it first checks if an identical string already exists in the pool. If so, it reuses the existing one.
- This optimization improves performance and memory usage.

**6. StringBuffer and StringBuilder:**

- For frequent string modifications, use `StringBuffer` (thread-safe) or `StringBuilder` (non-thread-safe) for better performance.
- They are mutable, allowing direct changes to the string content without creating new objects each time.

**7. Important Points:**

- Strings are objects, not primitive types.
- They are immutable, so operations create new strings.
- Use StringBuffer or StringBuilder for frequent modifications.
- Understand the string pool for memory optimization.

**8. Additional Concepts:**

- **Regular expressions:** For advanced pattern matching and text manipulation.
- **Character encoding:** How strings represent different character sets (e.g., UTF-8, ASCII).
- **Unicode:** A universal character encoding standard supported by Java.

**Remember:**

- Practice using these methods to master string manipulation in Java.
- Explore the Java documentation for more details and advanced features.
*/

public class StringsExplain {

	public static void main(String[] args) {

		StringsExplain explain = new StringsExplain();
		explain.getAccessCharacters();
		explain.getConcatenation();
		explain.getSubstringExtraction();
		explain.getCharactersandSubstrings();
		explain.getComparison();
		explain.getConversion();
		explain.getWhitespace();
		explain.getSentenceReplace();
		explain.getStringWords();
	     
	}


	private void getAccessCharacters() {
		// Accessing Characters
		// Strings are sequences of characters, each with an index starting from 0.
		String name = "Regved";
		char firstLetter = name.charAt(2);  // Access the character at index 2 ('e')
		System.out.println(firstLetter);

	}

	private void getConcatenation() {
		// Concatenation
		// Combine strings using the + operator or the concat() method.
		String myname = "Regved";
		String mysirname = "Pande";
		String fullname = "My Name is" + myname + mysirname; // Combine three strings
		System.out.println(fullname);
	}

	

	private void getSubstringExtraction() {
		// Substring Extraction
		// Extract a portion of a string using substring(start, end).
		String sentence = "Java is Object Oriented Programming Language";
		String rangelimit = sentence.substring(1, 18);  // Extract characters from index 1 to 17
		System.out.println(rangelimit);
	}
	
	private void getCharactersandSubstrings() {
		// Finding Characters and Substrings
		// Find the index of a character/substring or check for its presence.
		String phrase = "Java is a great Programming Language";
		int wordRange = phrase.indexOf('i');  // Find the first occurrence of 'i'
		System.out.println(wordRange);
		int wordRange2 = phrase.lastIndexOf("g");  // Find the last occurrence of 'g'
		System.out.println(wordRange2);
		boolean range = phrase.contains("great");  // Check if "great" is present
		System.out.println(range);

	}

	private void getComparison() {
		// Comparison
		// Compare strings for equality using equals() or equalsIgnoreCase().
		String halfname = "Steve";
		String completename = "Steve Jobs";
		boolean equal = halfname.equals(completename);  // Case-sensitive comparison
		System.out.println(equal);
		boolean equalsIgnoreCase = halfname.equalsIgnoreCase(completename);  // Case-insensitive
		
	}

	private void getConversion() {
		// Case Conversion
		// Change case using toUpperCase() or toLowerCase().
		String namespelling = "regved pande";
		String uppercase = namespelling.toUpperCase();  // All characters to uppercase
		String lowercase = namespelling.toLowerCase();  // All characters to lowercase
	}



	private void getWhitespace() {
		// Trimming Whitespace
		// Remove leading and trailing whitespace using trim().
		String spaceshipname = "     Millenium Falcon!      ";
		String trimmed = spaceshipname.trim();  // Remove extra spaces
		System.out.println(trimmed);
		
	}

	private void getSentenceReplace() {
		// Sentence Replace
		// Replace parts of a string using replace(oldChar/oldString, newChar/newString).
		String reality = "I saw a Persian black dog today";
		String replaced = reality.replace("dog", "cat");  // Replace "dog" with "cat"
		System.out.println(replaced);
	}

	private void getStringWords() {
		// String Words
		// Split a string into an array of words using split(delimiter).
		String catbreeds = "Persian, Maine Coon, Caracal, Munchkin";
		String[] cats = catbreeds.split(",");  // Split into an array using comma as delimiter
		System.out.println(catbreeds);  // Note: This line prints the original string, not the array.
	}
}
