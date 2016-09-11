package cn.edu.bistu.cs.se.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BlankFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    private static final String ARG_PARAM1 = "id";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank, container, false);
        TextView textViewWord=(TextView)view.findViewById(R.id.word);
        TextView textViewMeaning=(TextView)view.findViewById(R.id.wordmeaning);
        TextView textViewSample=(TextView)view.findViewById(R.id.wordsample);
        switch (mParam1){
            case "1":
                textViewWord.setText("apple");
                textViewMeaning.setText("苹果");
                textViewSample.setText("This apple is very nice.");
                break;
            case "2":
                textViewWord.setText("Orange");
                textViewMeaning.setText("橘子");
                textViewSample.setText("This orange is very nice.");
                break;
            case "3":
                textViewWord.setText("Banana");
                textViewMeaning.setText("香蕉");
                textViewSample.setText("This banana is very nice.");
                break;
            case "4":
                textViewWord.setText("Lemon");
                textViewMeaning.setText("柠檬");
                textViewSample.setText("This lemon is very nice.");
        }
        return view;
    }
}

