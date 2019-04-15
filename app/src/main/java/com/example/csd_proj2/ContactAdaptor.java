package com.example.csd_proj2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdaptor extends ArrayAdapter<Contact> {

    Context context;
    int resource_file;

    public ContactAdaptor(Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource_file = resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String name = getItem(position).getName();
        String mail_id = getItem(position).getMail_id();

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource_file,parent,false);
        TextView tv1 = convertView.findViewById(R.id.contact_name);
        TextView tv2 = convertView.findViewById(R.id.contact_id);
        tv1.setText(name);
        tv2.setText(mail_id);

        return convertView;


    }
}
