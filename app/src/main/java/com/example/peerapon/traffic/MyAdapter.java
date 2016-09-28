package com.example.peerapon.traffic;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by Pc on 21/9/2559.
 */
public class MyAdapter extends BaseAdapter {
    private Context objContext;
    private int[] trafficInts;
    private String[] trafficStrings;
    public MyAdapter(Context objContext, int[] trafficInts, String[] trafficStrings) {
        this.objContext = objContext;
        this.trafficInts = trafficInts;
        this.trafficStrings = trafficStrings;
    }
    public MyAdapter(Context objContext, int[] trafficInts){
    }
    @Override
    public int getCount() {
        return trafficStrings.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup ) {
        LayoutInflater objLayoutIntflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewl = objLayoutIntflater.inflate(R.layout.my_listview, viewGroup,false);
        //show Icon
        ImageView IconImageView = (ImageView) viewl.findViewById(R.id.imvShowIcon);
        IconImageView.setBackgroundResource(trafficInts[i]);
        TextView titleTextView = (TextView) viewl.findViewById(R.id.txtShowTitile);
        titleTextView.setText(trafficStrings[i]);
        return viewl;
    }
}
