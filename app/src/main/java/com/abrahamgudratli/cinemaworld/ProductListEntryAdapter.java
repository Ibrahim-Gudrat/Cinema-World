package com.abrahamgudratli.cinemaworld;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductListEntryAdapter extends RecyclerView.Adapter<ProductListEntryAdapter.ProductListEntryViewHolder> {

    ProductListEntry[] products;

    // This line is constructor. Whenever we created our adapter this will be executed
    public ProductListEntryAdapter(ProductListEntry[] products) {
        this.products = products;
    }

    // This line return the number of elements in product
    @Override
    public int getItemCount() {
        return products.length;
    }

    // This code is more explicit version of setContentView()
    @NonNull
    @Override
    public ProductListEntryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_entry, parent, false);
        return new ProductListEntryViewHolder(view);
    }

    // This code is used to add/change content in recycler view
    @Override
    public void onBindViewHolder(@NonNull ProductListEntryViewHolder holder, int position) {
        holder.bind(products[position], position);
    }


    static class ProductListEntryViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView title;
        private TextView description;
        private RatingBar rating;

        public ProductListEntryViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_view);
            title = itemView.findViewById(R.id.text_view_title);
            description = itemView.findViewById(R.id.text_view_description);
            rating = itemView.findViewById(R.id.rating_bar);
        }

        public void bind(ProductListEntry entry, int position) {
            image.setImageResource(entry.image);
            title.setText(entry.title);
            description.setText(entry.description);
            rating.setRating(entry.rating);

        }

    }

}
