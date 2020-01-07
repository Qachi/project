package com.example.fragmenttestrun;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Fragmentt extends Fragment {


    public void intent() {
        Intent intent = new Intent(getActivity().getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    Toolbar toolbar;
    CardView payments;
    CardView explore;
    CardView transactions;
    CardView settings;
    CardView profile;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment, container, false);


        payments = (CardView) view.findViewById(R.id.payments);
        explore = (CardView) view.findViewById(R.id.explore);
        transactions = (CardView) view.findViewById(R.id.transactions);
        settings = (CardView) view.findViewById(R.id.settings);
        profile = (CardView) view.findViewById(R.id.profile);

        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setTitle("DashBoard");


        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                intent();

                return true;
            }


        });

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();

                switch (id) {
                    case R.id.payments:
                        Toast.makeText(getActivity(), "Payments Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.explore:
                        Toast.makeText(getActivity(), "Explore Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.transactions:
                        Toast.makeText(getActivity(), " Transactions History Clicked", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.settings:
                        Toast.makeText(getActivity(), " Settings Clicked", Toast.LENGTH_SHORT).show();
                        break;
                        case R.id.profile:
                            Toast.makeText(getActivity(), " Profile Details Clicked", Toast.LENGTH_SHORT).show();
                            break;
                            default:
                                return;



                }
            }
        };
        payments.setOnClickListener(listener);
        explore.setOnClickListener(listener);
        transactions.setOnClickListener(listener);
        settings.setOnClickListener(listener);
        profile.setOnClickListener(listener);
        return view;


    }


}






