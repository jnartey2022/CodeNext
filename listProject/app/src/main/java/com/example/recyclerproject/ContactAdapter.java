package com.example.recyclerproject;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
public class ContactAdapter<convertView> extends ArrayAdapter<Contact>{

    private final ArrayList<Contact> myContacts;
    private Context myContext;
    private ArrayList<Contact> = new ArrayList<Contact>();

    public ContactAdapter (Context myContext, ArrayList<Contact> myContacts){

        super(myContext, 0, myContacts);
        this.myContext = myContext;
        this.myContacts = myContacts;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent);

    if(myContacts == null){

        convertView = LayoutInflater.from(myContext).inflate(R.layout.contact_items,parent, false);
    }
    Contact currentContact = myContacts.get(position);

    ImageView profilepicture = convertView.findViewById(R.id.profilepicture);
    profilepicture.setImageResource(currentContact.getprofilepicture());

    TextView contactname = convertView.findViewById(R.id.contactname);
    contactname.setT
    return.convertView;
}
