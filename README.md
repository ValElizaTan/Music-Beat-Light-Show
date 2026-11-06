# Music Beat Light Show (Java)

A Java program that plays an MP3, detects the beats in real time and draws a pixel-art light show on a 10 × 20 grid of coloured "pixels", changing the picture as the song progresses. My choreography is set to **"Empty Space" by James Arthur** (198 beats in total).

## How it works

1. `Main` opens a file picker so you can choose an `.mp3` and plays it with the [Minim](https://code.compartmental.net/minim/) audio library.
2. `MyListener` runs Minim's `BeatDetect` on the audio stream. Each time it detects a beat (at least 300 ms after the previous one), it starts a `Worker` thread.
3. `Worker` calls `YourCode.onBeat(beatCount)`. My code there decides what to draw for that beat number.
4. `ColorDisplay` is a Swing window that renders the pixel grid.

## What's drawn

`pkg/YourCode.java` builds the show from small drawing helpers: full-screen fills, horizontal and vertical lines, letters (spelling **"HI"**), animated hearts, a smiley face, stairs, a pyramid, a stick person, random patterns, and pixel-art **Minecraft fox** and **Alex** characters. These scenes switch at set beat ranges throughout the song.

## Project structure

```
src/
├── pkg/
│   └── YourCode.java        # My light-show choreography (onBeat + drawing helpers)
└── ryanguru/                # Framework provided for the module
    ├── Main.java            # Entry point, MP3 picker, Minim setup
    ├── MyListener.java      # Beat detection
    ├── Worker.java          # Calls onBeat on a new thread per beat
    └── ColorDisplay.java    # Swing pixel-grid display
lib/
└── music.jar                # Minim audio library + dependencies
```

## Running it

This is an Eclipse project (`.project` and `.classpath` are included).

**Eclipse:** File → Import → *Existing Projects into Workspace*, then run `ryanguru.Main`.

**Command line:**

```bash
javac -cp lib/music.jar -d bin src/ryanguru/*.java src/pkg/*.java
java  -cp "bin:lib/music.jar" ryanguru.Main      # use ; instead of : on Windows
```

When prompted, pick an MP3 file. The choreography is timed for "Empty Space", but any song will play. No audio file is included in this repo.

## Credits

- The display, beat-detection and threading framework in `ryanguru/` was provided as starter code for the module.
- Audio playback and beat detection use [Minim](https://code.compartmental.net/minim/).
- Choreography (`YourCode.java`): Valerie Tan Wan Xin