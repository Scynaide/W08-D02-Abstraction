# Lab: Abstract Classes and Interfaces with Show, Movie, and TvShow

## Objective
In this lab, you will:
1. Create an abstract `Show` class that encapsulates common attributes and functionality for movies and TV shows.
2. Extend the `Show` class to the existing `Movie` class and a new class called `TvShow`.
3. Implement abstract and concrete methods in the subclasses, as well as any unique functionality for each class.

---

## Instructions

### Step 1: Create the `Show` Abstract Class
1. **Define the Class**:
   - Create an abstract class named `Show`.

2. **Add Fields**:
   - `title` (String): The title of the show (movie or TV show).
   - `releaseYear` (int): The year the show was released.
   - `rating` (double): The rating of the show.
   - `actors` (ArrayList<Actor>): A list of actors that star in the show.
   - `isOnNetflix` (boolean): true or false if the show is on netflix

3. **Abstract Methods**:
   - Define an abstract method `void displayShowInfo()` that each subclass must implement to display show information.

4. **Concrete Methods**:
   - Implement concrete methods for adding actors to the `actors` list and displaying the show title.

---

### Step 2: Refactor the `Movie` Class
1. **Extend the `Show` Class**:
   - Update the `Movie` class to extend the abstract `Show` class.
   
2. **Movie-Specific Fields**:
   - Keep any movie-specific fields such as 
   - `director` (String): The director of the movie.
   - `runtime` (int): runtime of movie
   
3. **Implement the Abstract Method**:
   - Implement the `displayShowInfo()` method to display movie-specific information along with inherited attributes.
---

### Step 3: Create the `TvShow` Class
1. **Define the Class**:
   - Create a class named `TvShow` that extends `Show`.

2. **TvShow-Specific Fields**:
   - `seasonCount` (int): The number of seasons in the TV show.
   - `totalEpisodes` (int): The number of episodes total for the show.

3. **Implement the Abstract Method**:
   - Implement the `displayShowInfo()` method to display TV show-specific details along with inherited attributes.

---

### Step 4: Interface for Playable Shows (Optional)
1. **Define an Interface**:
   - Create an interface `Playable` with the following method:
     - `void play()`: This method should print a message indicating that the show is now playing.

2. **Implement the Interface**:
   - Implement the `Playable` interface in both `Movie` and `TvShow` classes.

---

### Step 5: Testing
1. **Create Objects**:
   - Instantiate `Movie` and `TvShow` objects with valid data.

2. **Test Methods**:
   - Add actors to the `actors` list of both `Movie` and `TvShow`.
   - Call `displayShowInfo()` on both `Movie` and `TvShow` objects.
   - If implementing the `Playable` interface, call the `play()` method on both objects.

---