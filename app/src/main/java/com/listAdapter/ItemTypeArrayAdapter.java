package com.listAdapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.model.ItemType;
import com.nikitasha.R;
import java.util.List;

/**
 * Created by Admin on 09-August-9-2017.
 */

public class ItemTypeArrayAdapter extends RecyclerView.Adapter<ItemTypeArrayAdapter.ItemTypeView> {

    private Context mContext;
    private Activity mActivity;
    private List<ItemType> itemTypeList;

    public ItemTypeArrayAdapter(Context mContext, Activity mActivity, List<ItemType> itemTypeList) {
        this.mContext = mContext;
        this.mActivity = mActivity;
        this.itemTypeList = itemTypeList;
    }

    public class ItemTypeView extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;
        public Button button;

        public ItemTypeView(View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.img_cat_typeId);
            textView=(TextView)itemView.findViewById(R.id.tv_cate_type_name);
            button=(Button)itemView.findViewById(R.id.btn_ViewDtlsId);
        }
    }


    @Override
    public void onBindViewHolder(ItemTypeView holder, int position) {
        ItemType itemType=itemTypeList.get(position);
        holder.textView.setText(" "+itemType.getItemName());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public ItemTypeView onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type_row,parent,false);
        return new ItemTypeView(itemView);
    }

    @Override
    public int getItemCount() {
        return itemTypeList.size();
    }
}
