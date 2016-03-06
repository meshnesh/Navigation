package navigation.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import static com.example.tune.navigation.R.layout.places_frag;


public class places extends navigation  {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(places_frag, container, false); //linked it to the layout for the button.

        return rootView;
    }
}
