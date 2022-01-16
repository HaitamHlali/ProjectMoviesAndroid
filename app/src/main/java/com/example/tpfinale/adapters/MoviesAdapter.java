package com.example.tpfinale.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tpfinale.classes.Movies;
import com.example.tpfinale.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder>  {
    private OnMoviesListner mOnMoviesListener;
    Movies.data data;
    ArrayList<Movies.data> moviesData;
    Context context;
    public MoviesAdapter (List<Movies.data> movies, Context context, OnMoviesListner onMoviesListner) {
        this.context=context;
        this.moviesData= (ArrayList<Movies.data>) movies;
        this.mOnMoviesListener= onMoviesListner;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public MoviesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie,parent,false);
        ViewHolder viewHolder=new ViewHolder(v, mOnMoviesListener);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull MoviesAdapter.ViewHolder holder, int position) {
        Movies.data movie =moviesData.get(position);
        Picasso.with(context)
                .load("https://image.tmdb.org/t/p/original"+movie.getPoster_path())
                .into((ImageView) holder.movieImage);

    }

    @Override
    public int getItemCount() {
        return moviesData.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public Object movieImage;
        OnMoviesListner onMoviesListner;

        public ViewHolder(@NonNull View itemView, OnMoviesListner onMoviesListner) {
            super(itemView);
            movieImage=(ImageView)itemView.findViewById(R.id.image);
            this.onMoviesListner=onMoviesListner;
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
                onMoviesListner.onMovieClick(moviesData,getAdapterPosition());

        }
    }
    public interface OnMoviesListner {
        void onMovieClick(ArrayList<Movies.data> movie, int position);
    }
}
