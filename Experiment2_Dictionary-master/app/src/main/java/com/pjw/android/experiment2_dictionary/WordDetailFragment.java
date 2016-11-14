package com.pjw.android.experiment2_dictionary;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * A fragment representing a list of Items.
 * <p />
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class WordDetailFragment extends Fragment
{

    // TODO: Customize parameters
    private int mColumnCount = 1;

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";

    private OnListFragmentInteractionListener mListener;
    private ArrayList<Map<String, String>> mWords;

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static WordDetailFragment newInstance(int columnCount) {
        WordDetailFragment fragment = new WordDetailFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public WordDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
	    Word w=null;
	    if (getArguments() != null)
	    {
		    List<Word> words=new ArrayList<> ();
		    w=(Word)getArguments ().getSerializable ("word");
		    words.add (w);
		    WordDBFunctions wordDBFunctions=new WordDBFunctions (getActivity ());
		    mWords=wordDBFunctions.List2Map (words);
	    }
        View view = inflater.inflate(R.layout.fragment_detail_layout_item, container, false);

        //if (view instanceof ListView)
        //{
            /*WordDBFunctions wordDBFunctions=new WordDBFunctions (getActivity ());
            mWords=wordDBFunctions.getAllWordsInArrayList ();
            ListView detail_words = (ListView) view.findViewById (R.id.fragment_detail_container);
            registerForContextMenu (detail_words);
            SimpleAdapter adapter = new SimpleAdapter (getActivity (), mWords, R.layout.fragment_detail_layout_item,
                    new String[]{Word.COLUMN_NAME_WORD,Word.COLUMN_NAME_MEANING,Word.COLUMN_NAME_SAMPLE},
	        new int[]{R.id.fragment_detail_textview_word,R.id
                            .fragment_detail_textview_meaning,R.id.fragment_detail_textview_example});
            setListAdapter (adapter);*/
	        TextView detail_words=(TextView)view.findViewById (R.id.fragment_detail_textview_word);
	        detail_words.setText (w.getWord ());
	        TextView detail_meaning=(TextView)view.findViewById (R.id
			        .fragment_detail_textview_meaning);
	        detail_meaning.setText (w.getMeaning ());
	        TextView detail_example=(TextView)view.findViewById (R.id
			        .fragment_detail_textview_example);
	        detail_example.setText (w.getSample ());
        //}
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onDetailClick (String itemname);
    }
}
