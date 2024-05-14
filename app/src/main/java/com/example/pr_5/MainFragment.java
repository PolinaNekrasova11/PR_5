package com.example.pr_5;
import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import java.util.ArrayList;
public class MainFragment extends Fragment {
    EditText fragment_main_edit_text;
    public MainFragment() {
        super(R.layout.fragment_main);
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        fragment_main_edit_text = view.findViewById(R.id.fragment_main_edit_text);

        Button button = view.findViewById(R.id.fragment_main_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Navigation.findNavController(view).navigate(R.id.action_MainFragment_to_FirstFragment);
                Bundle bundle = new Bundle();
                String name = fragment_main_edit_text.getText().toString();
                bundle.putString("name", name);
                Navigation.findNavController(view).navigate(R.id.FirstFragment, bundle);
            }
        });
        return view;
    }
}
