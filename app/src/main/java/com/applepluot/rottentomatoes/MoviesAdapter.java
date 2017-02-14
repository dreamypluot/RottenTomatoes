package com.applepluot.rottentomatoes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by achow on 2/13/17.
 */

public class MoviesAdapter extends ArrayAdapter<Movie> {

    public MoviesAdapter(Context context, ArrayList<Movie> movies) {
        super(context, 0, movies);
    }

    @NonNull
    @Override
    /* converts model to a view */
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        Movie movie = getItem(position);
        if (convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_movie, parent, false);
        }
        ImageView imageView = (ImageView) convertView.findViewById(R.id.ivPoster);
        //clear out image from convertView
        imageView.setImageResource(0);
        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvScore = (TextView) convertView.findViewById(R.id.tvScore);
        assert movie != null;
        tvTitle.setText(movie.getTitle());
        tvScore.setText(movie.getScoreLabel());
        return convertView;
    }
}
