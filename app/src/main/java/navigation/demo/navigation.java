package navigation.demo;

import android.animation.Animator;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tune.navigation.R;

import static com.example.tune.navigation.R.layout.frame_main;

/**
 * Created by tune on 05/03/16.
 */
public class navigation extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(frame_main, container, false);

        return rootView;
    }
}

