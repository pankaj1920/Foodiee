package com.example.foodiee.BottomNavFragment.SearchFragment;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodiee.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {

    androidx.appcompat.widget.Toolbar searchToolbar;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        searchToolbar = (Toolbar) view.findViewById(R.id.searchToolbar);
        //setting toolbar in fragment
       // ((AppCompatActivity) getActivity()).setSupportActionBar(searchToolbar);
        return view;
    }

}
