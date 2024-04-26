function tellStory() {
    let storyProgress = 0;
  
    while (storyProgress !== -1) {
      if (storyProgress === 0) {
        console.log("You awaken in a dark forest, the air thick with mist. You hear a faint rustling in the distance. What do you do?");
        console.log("1. Follow the sound.");
        console.log("2. Stay put and call for help.");
        const choice = prompt("Enter your choice (1 or 2): ");
        storyProgress = parseInt(choice);
      } else if (storyProgress === 1) {
        console.log("You cautiously approach the sound, branches snapping under your feet. Suddenly, a pair of glowing eyes emerges from the shadows. What do you do?");
        console.log("1. Run away.");
        console.log("2. Stand your ground and speak to the creature.");
        const choice = prompt("Enter your choice (1 or 2): ");
        storyProgress = parseInt(choice);
      } else if (storyProgress === 2) {
        console.log("You strain your voice, but only silence answers. Just as despair starts to set in, a friendly voice calls out from behind. What do you do?");
        console.log("1. Turn around in relief.");
        console.log("2. Ignore the voice and keep calling for help.");
        const choice = prompt("Enter your choice (1 or 2): ");
        storyProgress = parseInt(choice);
      } else if (storyProgress === 3) { // Option 1, choice 1 (run away)
        console.log("You sprint through the undergrowth, your heart pounding in your chest. You escape the glowing eyes, but are now hopelessly lost. The story ends...");
        storyProgress = -1;
      } else if (storyProgress === 4) { // Option 1, choice 2 (speak)
        console.log("The creature steps forward, revealing itself to be a wise old owl. It offers cryptic guidance that helps you navigate the forest. The story ends...");
        storyProgress = -1;
      } else if (storyProgress === 5) { // Option 2, choice 1 (turn around)
        console.log("You turn to see a young lost child. Together, you find your way out of the forest. The story ends...");
        storyProgress = -1;
      } else if (storyProgress === 6) { // Option 2, choice 2 (ignore)
        console.log("You continue calling, but a twig snaps behind you. You turn around to find...");  // Add a surprising twist here! (e.g., a friendly deer, a hidden treasure)
        storyProgress = -1; // Or create a new branch based on the twist
      } else {
        console.log("Invalid choice. Please enter 1 or 2.");
      }
    }
  }
  
  tellStory();
  