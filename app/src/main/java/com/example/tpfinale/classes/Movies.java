package com.example.tpfinale.classes;

import java.util.ArrayList;

public class Movies {
    String page;
    ArrayList<data> results ;

    public ArrayList<data> getResults() {
        return results;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }



    public class data{
        boolean adult ;
        String backdrop_path;
        int id;
        String original_language;
        String original_title;
        String overview;
        String poster_path;
        String popularity;
        String release_date;
        String title;
        String vote_average;
        String vote_count;
        ArrayList<Long> genre_ids;

        public ArrayList<Long> getGenre_ids()  {
            return genre_ids;
        }


        public String getPoster_path() {

            return poster_path;
        }

        public void setPoster_path(String poster_path) {
            this.poster_path = poster_path;
        }

        public boolean isAdult() {
            return adult;
        }

        public String getBackdrop_path() {
            return backdrop_path;
        }

        public int getId() {
            return id;
        }

        public String getOriginal_language() {
            return original_language;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public String getOverview() {
            return overview;
        }

        public String getPopularity() {
            return popularity;
        }

        public String getRelease_date() {
            return release_date;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public void setBackdrop_path(String backdrop_path) {
            this.backdrop_path = backdrop_path;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setOriginal_language(String original_language) {
            this.original_language = original_language;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public void setPopularity(String popularity) {
            this.popularity = popularity;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setVote_average(String vote_average) {
            this.vote_average = vote_average;
        }

        public void setVote_count(String vote_count) {
            this.vote_count = vote_count;
        }

        public String getTitle() {
            return title;
        }

        public String getVote_average() {
            return vote_average;
        }

        public String getVote_count() {
            return vote_count;
        }
    }


}

