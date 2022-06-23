package com.Houts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {

    DragonCave dragonCave;

    @BeforeEach
    void setUp() {
        dragonCave = new DragonCave();
    }

    @Test
    void getIntro() {
        assertEquals("You are in a land full of dragons.\n" +
                "In front of you, you see two caves.\n" +
                "In one cave, the dragon is friendly and will share his treasure with you.\n" +
                "The other dragon is greedy and hungry and will eat you on sight.\n", dragonCave.getIntro());
    }

    @Test
    void getCaveSelection() {
        assertEquals("Which cave will you go into? (1 or 2)\n", dragonCave.getCaveSelection());
    }

    @Test
    void getCaveValidSelection() {
        assertEquals("Please enter a valid selection. (1 or 2)", dragonCave.getCaveValidSelection());
    }

    @Test
    void badDragon() {
        assertEquals("You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!", dragonCave.badDragon());
    }

    @Test
    void goodDragon() {
        assertEquals("You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "Unsure what lies ahead, you slowly creep inside.\n" +
                "From behind a pile of rocks jumps the good dragon and welcomes you inside.\n" +
                "Please with the visit, he offers to share his treasure with you.", dragonCave.goodDragon());
    }
}