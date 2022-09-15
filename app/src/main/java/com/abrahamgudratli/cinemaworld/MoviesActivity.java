package com.abrahamgudratli.cinemaworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        setupList();
    }

    private void setupList() {
        ProductListEntry[] movies = {
                new ProductListEntry("Godfather", "The aging patriarch of an organized crime dynasty in postwar New York City transfers control of his clandestine empire to his reluctant youngest son.", R.drawable.godfather, 5),
                new ProductListEntry("Matrix", "When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of cyber-intelligence.", R.drawable.matrix, 4.5f),
                new ProductListEntry("Fight Club", "An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.", R.drawable.fightclub, 5),
                new ProductListEntry("Shawshank Redemption", "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", R.drawable.shawshank, 5),
                new ProductListEntry("Pulp Fiction", "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.", R.drawable.pulpfiction, 4.5f),
                new ProductListEntry("Interstellar", "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.", R.drawable.interstellar, 5),
                new ProductListEntry("City of God", "In the slums of Rio, two kids' paths diverge as one struggles to become a photographer and the other a kingpin.", R.drawable.cityofgod, 4.5f),
                new ProductListEntry("Saving Private Ryan", "Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.", R.drawable.savingryan, 5)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_movies);
        ProductListEntryAdapter adapter = new ProductListEntryAdapter(movies);
        recyclerView.setAdapter(adapter);

    }
}