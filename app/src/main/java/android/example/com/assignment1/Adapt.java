package android.example.com.assignment1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapt extends RecyclerView.Adapter<Adapt.MyView> {
    ArrayList<CustomData> list= new ArrayList();
    Context context;



    Adapt(Context context,ArrayList<CustomData> list) {
        this.context=context;
        this.list=list;
    }

    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.rviewlayout,parent,false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyView holder, int position) {
        holder.name.setText( list.get(position).getName());
        holder.age.setText(list.get(position).getAge());
        holder.date.setText(list.get(position).getDob());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MyView extends RecyclerView.ViewHolder {
        TextView name,age,date;
        ImageView imageView;
        public MyView(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            name=itemView.findViewById(R.id.name);
            age=itemView.findViewById(R.id.age);
            date=itemView.findViewById(R.id.dob);

        }
    }
}
