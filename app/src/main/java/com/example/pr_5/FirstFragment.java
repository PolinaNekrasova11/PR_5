package com.example.pr_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    EditText fragment_first_edit_text;
    public FirstFragment() {
        super(R.layout.fragment_first);
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        fragment_first_edit_text = view.findViewById(R.id.fragment_first_edit_text);

        Button button = view.findViewById(R.id.fragment_first_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String address = fragment_first_edit_text.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                Navigation.findNavController(view).navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
            }
        });
        String name = getArguments().getString("name");
        TextView text = view.findViewById(R.id.fragment_first_text_view3);
        text.setText(name);
        return view;
    }
}

