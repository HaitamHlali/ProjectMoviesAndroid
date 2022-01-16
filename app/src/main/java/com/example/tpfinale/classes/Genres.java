package com.example.tpfinale.classes;

import java.util.ArrayList;

public class Genres {

    ArrayList<Genre> genres;

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public class Genre {
        int id;
        String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
