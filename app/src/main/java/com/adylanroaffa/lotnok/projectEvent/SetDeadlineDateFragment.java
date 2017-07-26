package com.adylanroaffa.lotnok.projectEvent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adylanroaffa.lotnok.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SetDeadlineDateFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SetDeadlineDateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SetDeadlineDateFragment extends Fragment {

    public SetDeadlineDateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_project_set_deadline_date, container, false);
    }


}
