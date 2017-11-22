package stream.crosspromotionsample;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.*;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context mContext;
    ArrayList<Main> mList;

    public final String mActivity = this.getClass().getSimpleName();

    public MainAdapter(Context context, ArrayList<Main> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new MainViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder genericHolder, final int position) {
        Main item = mList.get(position);
        MainViewHolder holder = (MainViewHolder) genericHolder;
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public Main getItem(int position) {
        return mList.get(position);
    }
}