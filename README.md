# Character Profile Generator (Java & Python)

A beginner‑friendly program implemented in **both Java and Python** that collects character details and numeric stats, then generates a clean, formatted character sheet.  
This project demonstrates core programming concepts such as Strings, numeric input, escape sequences, Scanner/input behavior, and basic arithmetic.

---

## 📂 Project Structure

```
character_profile_generator/
│
├── java_version/
│   └── character_profile.java
│
└── python_version/
└── character_profile.py
```

Each folder contains a standalone implementation of the same program logic.

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
  - String and numeric input  
  - Escape sequences (`\n`, `\t`)  
  - Input → processing → output structure  
  - Clean console formatting  
  - Differences between Java’s `Scanner` and Python’s `input()`  

---

## 🧠 Concepts Practiced

### **Java Version**
- `Scanner` input  
- `String`, `int`, and `double` variables  
- Handling `nextLine()` after numeric input  
- Escape sequences  
- Arithmetic expressions  

### **Python Version**
- `input()` for text and numbers  
- `float` and `int` types  
- f‑string formatting  
- Simple arithmetic  
- Clean printed output  

---

## 🧮 How It Works

1. The user enters their character’s name, race, and class.  
2. The program asks for three numeric stats: Strength, Health, and Speed.  
3. It calculates the **power level** using:
`
powerLevel = (strength + health + speed) / 3
`
4. It prints a formatted character sheet using escape sequences and spacing.

---

## 🧪 Sample Output
```
---------------------------
CHARACTER PROFILE SUMMARY
---------------------------
Enter your character's name: Arion Nightwind
Enter your character's race: Elf
Enter your character's class: Ranger

Enter Strength (0–100): 78
Enter Health (0–100): 92
Enter Speed (0–100): 84
--------------------------
FINAL CHARACTER SHEET
--------------------------

Name:        Arion Nightwind
Race:        Elf
Class:       Ranger

Stats:
  Strength:     78
  Health:       92
  Speed:        84

Overall Power Level: 84.6

"May Arion Nightwind's arrows fly true."
----------------------
```
