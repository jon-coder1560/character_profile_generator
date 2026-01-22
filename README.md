# Character Profile Generator

A beginner‑friendly Java program that creates a formatted character sheet based on user input.  
This project demonstrates core Java concepts such as Strings, numeric types, Scanner input, escape sequences, and basic arithmetic.

---

## 📌 Features

- Collects character information:
  - Name  
  - Race  
  - Class  
  - Strength  
  - Health  
  - Speed  

- Calculates an **overall power level** using the average of the stats.

- Demonstrates:
  - `String` and numeric input  
  - Proper use of `nextLine()` with `nextInt()`  
  - Escape sequences (`\n`, `\t`)  
  - Input → processing → output structure  
  - Clean, formatted console output  

---

## 🧠 Concepts Practiced

| Concept | Description |
|--------|-------------|
| **Scanner Input** | Reads both Strings and numbers from the user |
| **Variables & Types** | Uses `String`, `int`, and `double` |
| **Escape Sequences** | Formats output with `\n`, `\t` |
| **Arithmetic** | Adds stats and computes an average |
| **Formatting** | Produces a clean, readable character sheet |

---

## 🧪 Sample Output
```
----------------------------------------
        CHARACTER PROFILE SUMMARY
----------------------------------------

Enter your character's name: Arion Nightwind
Enter your character's race: Elf
Enter your character's class: Ranger

Enter Strength (0–100): 78
Enter Health (0–100): 92
Enter Speed (0–100): 84

----------------------------------------
           FINAL CHARACTER SHEET
----------------------------------------

Name: Arion Nightwind
Race: Elf
Class: Ranger

Stats:
    Strength:     78
    Health:       92
    Speed:        84

Overall Power Level: 84.0

"May Arion Nightwind's arrows fly true."
----------------------------------------
```
---

## 🧮 Math Used

The program calculates the character’s **power level** using a simple average:
```
powerLevel = (strength + health + speed) / 3
```


This reinforces addition, division, and variable assignment.

---

## 📚 Purpose

This project was created to practice the skills taught in early Java lessons, including:
- Input handling  
- Variables and data types  
- Escape sequences  
- Basic math  
- Clean formatting  
- Understanding Scanner behavior  

Perfect for beginners building their first Java portfolio piece.
