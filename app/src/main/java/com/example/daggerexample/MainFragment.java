package com.example.daggerexample;

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

import static com.example.daggerexample.AppInit.getInjector;

public class MainFragment extends Fragment {

    @BindView(R.id.tv_1)
    TextView textView1;

    @BindView(R.id.tv_2)
    TextView textView2;

    @BindView(R.id.tv_3)
    TextView textView3;

    @Inject
    Model2 model2;

    @Inject
    Model1 model1;

    @Inject
    @Named("SomeString")
    String s;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
//        DaggerAppComponent.create().inject(this);
        getInjector().inject(this);
        textView1.setText(s);
        textView2.setText(model1.getString());
        textView3.setText(model2.m2);

        model2.m2 = "Test Change Singleton";

        return view;
    }
}
