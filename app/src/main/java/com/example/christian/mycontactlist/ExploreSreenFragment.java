package com.example.christian.mycontactlist;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ExploreSreenFragment extends Fragment {
    private TextView slider_name_text;
    private String NAME;
    private String GENDER;
    private int ID;
    @Override
    /**
     * Inflates fragment
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.explore_screen_fragment, container, false);
        return view;
    }
    @Override
    /**
     * Sets the text
     */
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        slider_name_text = (TextView) view.findViewById(R.id.slider_name_text);
        slider_name_text.setText(getName());
    }
    public String getName() {
        return NAME;
    }
    public void setName(String name){
        this.NAME = name;
    }
    public String getGENDER() {
        return GENDER;
    }
    public void setGENDER(String gender){
        this.GENDER = gender;
    }
    public int getID() {
        return ID;
    }
    public void setID(int id){
        this.ID = id;
    }
}
