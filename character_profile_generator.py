"""
    This program collects information about a user's custom character,
    including name, race, class, and several numeric stats. This program
    also performs simple math by calculating an overall power level
    based on the character's stats.
"""

# Annotate variables
charName: str
charRace: str
charClass: str
strength: int
health: int
speed: int
powerLevel: float

print("--------------------------------")
print("   Character Profile Summary   ")
print("--------------------------------")

# Ask user for character info
charName = input("Enter your character's name: ")
charRace = input("Enter your character's race: ")
charClass = input("Enter your character's class: ")

strength = int(input("\nEnter Strength (0-100): "))
health = int(input("Enter Health (0-100): "))
speed = int(input("Enter Spees (0-100): "))

# Display output
print("--------------------------------")
print("     Final character Sheet     ")
print("--------------------------------")

powerLevel = (strength + health + speed) / 3

print(f"\nName: {charName}")
print(f"Race: {charRace}")
print(f"Class: {charClass}")

print("\nStats:")
print(f"\tStrength: {strength}")
print(f"\tHealth: {health}")
print(f"\tSpeed: {speed}")

print(f"\nOverall Power Level: {powerLevel:.2f}")
print(f"\n'May {charName}'s arrows fly true.'")
print("--------------------------------")
