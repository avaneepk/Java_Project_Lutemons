# Lutemon — A Student Game

Lutemon is an Android game project inspired by Pokémon-style mechanics. Players can **create, train, and battle Lutemons**, each with unique stats and abilities. Built as a university project, the app demonstrates object-oriented programming, Android development, and UI design.

---

## Gameplay Overview

- **Create Lutemons**  
  Choose from 5 types (Green, Gray, Blue, Orange, Red), each with unique **attack, defense, and health** values.

- **Home Area**  
  Lutemons rest and recover full health but keep their XP.

- **Training**  
  Send Lutemons to the training area. Training increases **XP**, which raises **attack power**.

- **Battlefield**  
  Engage in **turn-based battles** where Lutemons attack and defend until one’s health reaches zero.  
  - **Winner**: Gains XP.  
  - **Loser**: Removed from the game.  

- **Lutedex**  
  View all Lutemons with images and stats.

---

## Features

- Object-oriented design with **class hierarchy** (`Lutemon` subclasses, `Storage`, `Battle`).  
- **RecyclerView** support for listing Lutemons dynamically.  
- **Battle winner display** screen (`activity_winner.xml`).  
- **Consistent bottom navigation bar** (`include_bottom_bar.xml`).  
- **Custom assets**: Lutemon sprites, icons, styled backgrounds.  
- Extra UI/UX touches: splash screen, loading animations, smooth navigation.  

---

## Tech Stack

- **Language:** Java  
- **Platform:** Android Studio  
- **Build System:** Gradle (Kotlin DSL)  
- **UI:** ConstraintLayout, CardView, RecyclerView, Material Components  
- **Architecture:** Object-Oriented Programming principles  

---

## Installation & Running

1. Clone the repository:
   ```bash
   git clone https://github.com/avaneepk/Java_Project_Lutemons.git
   cd Java_Project_Lutemons
2. Open the project in Android Studio.
3. Sync Gradle and install dependencies.
4. Run

---

## Team Members


Selin Cekli — Front-end, Documentation

Avaneep Kamal — Back-end, Presentation

