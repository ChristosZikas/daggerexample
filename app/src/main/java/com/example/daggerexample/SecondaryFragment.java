package com.example.daggerexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daggerexample.dagger.DaggerAppComponent;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondaryFragment extends Fragment {

    @BindView(R.id.tv_1)
    TextView textView1;

    @BindView(R.id.tv_2)
    TextView textView2;

    @BindView(R.id.tv_3)
    TextView textView3;

    @BindView(R.id.tv_4)
    TextView textView4;

    @BindView(R.id.tv_5)
    TextView textView5;

    @BindView(R.id.tv_6)
    TextView textView6;

    @Inject
    Model2 model2;

    @Inject
    Model1 model1;

    @Inject
    @Named("TEST1")
    String s;

    @Inject
    @Named("TEST2")
    String s2;

    @Inject
    @Named("TEST3")
    String s3;

    @SuppressLint("SetTextI18n")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_secondary, container, false);
        ButterKnife.bind(this, view);

        DaggerAppComponent.builder().build().subComponentBuilder().build().inject(this);

        textView1.setText(s);
        textView2.setText(model1.getString());
        textView3.setText(model2.m2);
        textView4.setText(s2);
        textView5.setText(s3);
        textView6.setText(model1.getString() + model2.m2);


        return view;
    }

}
