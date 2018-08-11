package com.example.tenx.groupliststest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context mCtx;
    private List<ListItem> mList;

    public CustomAdapter(Context mCtx) {
        this.mCtx = mCtx;
        mList = ResourceUtils.getData();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = null;
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        if(i == ListItem.TYPE_EVENT){
            view = inflater.inflate(R.layout.viewholder_list_item, viewGroup, false);
            return new EventViewHolder(view);
        }
        if(i== ListItem.TYPE_HEADER){
            view = inflater.inflate(R.layout.header_listitem, viewGroup, false);
            return new HeaderViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder customViewHolder, int i) {
            int type = getItemViewType(i);
            if(type == ListItem.TYPE_HEADER){
                ((HeaderViewHolder) customViewHolder).tvHeader.setText(((Headeritem) mList.get(i)).getName());
            }else{
                ((EventViewHolder) customViewHolder).tvText.setText(((EventItem) mList.get(i)).getName());
            }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder{
        TextView tvText;
        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
            tvText = itemView.findViewById(R.id.tvEvent);
        }
    }
    class HeaderViewHolder extends RecyclerView.ViewHolder{
        TextView tvHeader;
        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            tvHeader = itemView.findViewById(R.id.tvHeader);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getType();
    }
}
