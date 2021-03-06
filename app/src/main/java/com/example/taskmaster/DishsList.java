package com.example.taskmaster;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DishsList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DishsList extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "name";
    private static final String ARG_PARAM2 = "price";
    private static final String ARG_PARAM3 = "ingredients";

    // TODO: Rename and change types of parameters
    private String mName;
    private String mPrice;
    private String mIngredients;

    public DishsList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param mName Parameter 1.
     * @param mPrice Parameter 2.
     * @param mIngredients Parameter 2.
     * @return A new instance of fragment DishsList.
     */
    // TODO: Rename and change types and number of parameters
    public static DishsList newInstance(String mName, String mPrice,String mIngredients) {
        DishsList dishFragment = new DishsList();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, mName);
        args.putString(ARG_PARAM2, mPrice);
        args.putString(ARG_PARAM2, mIngredients);
        dishFragment.setArguments(args);
        return dishFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mName = getArguments().getString(ARG_PARAM1);
            mPrice = getArguments().getString(ARG_PARAM2);
            mIngredients = getArguments().getString(ARG_PARAM3);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dishs_list, container, false);
    }
}