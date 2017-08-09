package com.nikitasha;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dbAdapter.DBAdapter;
import com.dbAdapter.TableBase;
import com.listAdapter.ItemTypeArrayAdapter;
import com.model.ItemType;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CategoryFragment extends android.app.Fragment {

    private RecyclerView recyclerView;


    private OnFragmentInteractionListener mListener;

    public CategoryFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_category, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.recycler_vehicleMarket_id);
        return view;
    }


    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        DBAdapter dbAdapter =new DBAdapter(context);
        dbAdapter.OpenDatabase();
        List<ItemType> typeList=new ArrayList<ItemType>();

        try{
           Cursor mCursor= dbAdapter.getTableCurser(false, TableBase.Tables.item_type,null,null,null,null,null,null,null);
            if(mCursor!=null){
                if(mCursor.getCount()>0){
                    ItemType type=new ItemType();
                    type.setItemName(mCursor.getString(mCursor.getColumnIndex(TableBase.ColumnName.ItemType.ITEM_NAME)));
                    typeList.add(type);
                }
                ItemTypeArrayAdapter itemTypeArrayAdapter=new ItemTypeArrayAdapter(getActivity(),getActivity(),typeList);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(itemTypeArrayAdapter);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
