package com.example.csd_proj2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ContactFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.contact_fragment,container,false);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ashish Pathak", "ashishpathak@gmail.com"));
        contacts.add(new Contact("Satyam Dixit", "satyamdixit@gmail.com"));
        ListView listView = view.findViewById(R.id.contact_list);
        ContactAdaptor adapter = new ContactAdaptor(getActivity(),R.layout.adaptor_view_layout,contacts);
        listView.setAdapter(adapter);

        return view;


    }

}
