package com.abrahamgudratli.cinemaworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SeriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);

        setupList();
    }

    private void setupList() {
        ProductListEntry[] series = {
                new ProductListEntry("Breaking Bad", "A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine.", R.drawable.breaking_bad, 5),
                new ProductListEntry("Game of Thrones", "Nine noble families fight for control over the lands of Westeros, while an ancient enemy returns after being dormant for millennia.", R.drawable.gameofthrones, 4.5f),
                new ProductListEntry("Friends", "Follows the personal and professional lives of six twenty to thirty-something-year-old friends living in Manhattan.", R.drawable.friends, 5),
                new ProductListEntry("The Mandalorian", "The travels of a lone bounty hunter in the outer reaches of the galaxy, far from the authority of the New Republic.", R.drawable.themandalorian, 5),
                new ProductListEntry("The Sopranos", "New Jersey mob boss Tony Soprano deals with personal and professional issues in his home and business life that affect his mental state.", R.drawable.sopranos, 4.5f),
                new ProductListEntry("Seinfeld", "The continuing misadventures of neurotic New York City stand-up comedian Jerry Seinfeld and his equally neurotic New York City friends.", R.drawable.seinfeld, 5),
                new ProductListEntry("House of Cards", "A Congressman works with his equally conniving wife to exact revenge on the people who betrayed him.", R.drawable.houseofcards, 4.5f),
                new ProductListEntry("Stranger Things", "When a young boy disappears, his mother, a police chief and his friends must confront terrifying supernatural forces in order to get him back.", R.drawable.strangerthings, 5)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_series);
        ProductListEntryAdapter adapter = new ProductListEntryAdapter(series);
        recyclerView.setAdapter(adapter);
    }
}