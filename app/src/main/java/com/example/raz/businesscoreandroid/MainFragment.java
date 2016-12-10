package com.example.raz.businesscoreandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.content.Intent;
import android.widget.AdapterView;

/**
 * Main activity fragment.
 * Here the user can choose between viewing his businesses and appointments
 */
public class MainFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Add this line in order for this fragment to handle menu events.
        setHasOptionsMenu(true);

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main_fragment, menu);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // The ArrayAdapter will take data from a source and
        // use it to populate the ListView it's attached to.

        final View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Get a reference to the ListView, and attach this adapter to it.
        Button my_businesses = (Button) rootView.findViewById(R.id.my_businesses);
//        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
//        listView.setAdapter(mForecastAdapter);
//        my_businesses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Intent intent = new Intent(getActivity(), MyBusinessesActivity.class)
//                        .putExtra(Intent.EXTRA_TEXT, forecast);
//                startActivity(intent);
//            }
//
//        });

        Button my_appoitenments = (Button) rootView.findViewById(R.id.my_appointments_opt);
//        my_appoitenments.setOnItemClickListener(new AdapterView.OnItemClickListener()
//
//        {
//
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position,
//                                    long l) {
//                Intent intent = new Intent(getActivity(), MyBusinessesActivity.class)
//                        .putExtra(Intent.EXTRA_TEXT, forecast);
//                startActivity(intent);
//            }
//        });

        return rootView;
    }


}
