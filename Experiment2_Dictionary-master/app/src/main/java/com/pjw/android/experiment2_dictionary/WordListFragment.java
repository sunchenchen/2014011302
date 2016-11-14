package com.pjw.android.experiment2_dictionary;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;

/**
 * A fragment representing a list of Items.
 * <p>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class WordListFragment extends ListFragment
{

	// TODO: Customize parameter argument names
	private static final String ARG_COLUMN_COUNT = "column-count";
	// TODO: Customize parameters
	private int mColumnCount = 1;
	private OnListFragmentInteractionListener mListener;
	private ArrayList<Map<String, String>> mWords;
	private View mView;
	public WordsDBHelper mDBHelper;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public WordListFragment () {}

	// TODO: Customize parameter initialization
	@SuppressWarnings ("unused")
	public static WordListFragment newInstance (int columnCount)
	{
		WordListFragment fragment = new WordListFragment ();
		Bundle args = new Bundle ();
		args.putInt (ARG_COLUMN_COUNT, columnCount);
		fragment.setArguments (args);
		return fragment;
	}

	@Override
	public void onCreate (Bundle savedInstanceState)
	{
		super.onCreate (savedInstanceState);

		/*if (getArguments () != null)
		{
			mColumnCount = getArguments ().getInt (ARG_COLUMN_COUNT);
		}*/
	}

	@Override
	public View onCreateView (LayoutInflater inflater, ViewGroup container,
	                          Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.fragment_list_layout,container,false);
		if (view instanceof ListView)
		{
			WordDBFunctions wordDBFunctions=new WordDBFunctions (getActivity ());
			mWords=wordDBFunctions.getAllWordsInArrayList ();
			ListView list_words = (ListView) view.findViewById (R.id.fragment_list_container);
			registerForContextMenu (list_words);
			SimpleAdapter adapter = new SimpleAdapter (getActivity (), mWords, R.layout.fragment_list_layout_item,
					new String[]{Word.COLUMN_NAME_WORD},
					new int[]{R.id.fragment_list_textWord});
			setListAdapter (adapter);
		}
		mView=view;
		return view;
	}


	@Override
	public void onAttach (Context context)
	{
		super.onAttach (context);
	}

	@Override
	public void onDetach ()
	{
		super.onDetach ();
		mListener = null;
	}

	/**
	 * This interface must be implemented by activities that contain this
	 * fragment to allow an interaction in this fragment to be communicated
	 * to the activity and potentially other fragments contained in that
	 * activity.
	 * <p>
	 * See the Android Training lesson <a href=
	 * "http://developer.android.com/training/basics/fragments/communicating.html"
	 * >Communicating with Other Fragments</a> for more information.
	 */
	@Override
	public void onListItemClick (ListView l, View v, int position, long id)
	{
		super.onListItemClick (l, v, position, id);
		Context context=getActivity ();
		if (context instanceof OnListFragmentInteractionListener)
		{
			mListener = (OnListFragmentInteractionListener) context;
		}
		else
		{
			throw new RuntimeException (context.toString ()
					+ " must implement OnListFragmentInteractionListener");
		}
		mListener.returnViewFromListFragment (mView);
		String string = ((TextView)(v.findViewById (R.id.fragment_list_textWord))).getText
				().toString ();
		mListener.onItemClick (string);
	}

	public interface OnListFragmentInteractionListener
	{
		// TODO: Update argument type and name
		void onItemClick (String itemname);
		void returnViewFromListFragment(View returnview);
	}
}
