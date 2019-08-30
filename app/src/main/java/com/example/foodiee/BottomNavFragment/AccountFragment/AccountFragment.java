package com.example.foodiee.BottomNavFragment.AccountFragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.foodiee.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {

    ImageView acountEdit;
    ConstraintLayout manageAddressLayout, yourOderLayout, favLayout, offerLayout, helpLayout;
    Button logoutBtn;

    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        acountEdit = (ImageView) view.findViewById(R.id.acountEdit);
        manageAddressLayout = (ConstraintLayout) view.findViewById(R.id.manageAddressLayout);
        favLayout = (ConstraintLayout) view.findViewById(R.id.favLayout);
        yourOderLayout = (ConstraintLayout) view.findViewById(R.id.yourOderLayout);
        offerLayout = (ConstraintLayout) view.findViewById(R.id.offerLayout);
        helpLayout = (ConstraintLayout) view.findViewById(R.id.helpLayout);


        //Setting Click
        Click();

        return view;
    }

    public void Click() {

        acountEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EditProfileActivity.class);
                startActivity(intent);
                // getActivity().finish();

            }
        });

        manageAddressLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), UpdateAddressActivity.class);
                startActivity(intent);
                //getActivity().finish();
            }
        });

        favLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FavActivity.class);
                startActivity(intent);
                //  getActivity().finish();
            }
        });

        yourOderLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OderActivity.class);
                startActivity(intent);
                //  getActivity().finish();
            }
        });

        offerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OfferActivity.class);
                startActivity(intent);
                //  getActivity().finish();
            }
        });

        helpLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HelpActivity.class);
                startActivity(intent);
                //   getActivity().finish();
            }
        });

    }

}
