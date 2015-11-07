package com.concavenp.nanodegree.popularmovies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dave on 11/2/2015.
 */
public class MovieItems {

    public static class MovieItem {

        private boolean adult;
        private String backdrop_path;
        private List<Integer> genre_ids;
        private int id;
        private String original_language;
        private String original_title;
        private String overview;
        private String release_date;
        private String poster_path;
        private double popularity;
        private String title;
        private boolean video;
        private double vote_average;
        private int vote_Count;

        public boolean isAdult() {
            return adult;
        }

        public String getBackdrop_path() {
            return backdrop_path;
        }

        public List<Integer> getGenre_ids() {
            return genre_ids;
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

        public String getRelease_date() {
            return release_date;
        }

        public String getPoster_path() {
            return poster_path;
        }

        public double getPopularity() {
            return popularity;
        }

        public String getTitle() {
            return title;
        }

        public boolean isVideo() {
            return video;
        }

        public double getVote_average() {
            return vote_average;
        }

        public int getVote_Count() {
            return vote_Count;
        }

    }

    int page;
    List<MovieItem> results = new ArrayList<>();
    int total_pages;
    int total_results;

    public int getPage() {
        return page;
    }

    public List<MovieItem> getResults() {
        return results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public int getTotal_results() {
        return total_results;
    }

}