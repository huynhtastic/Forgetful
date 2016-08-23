package comhuynhtastic.github.forgetful;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class RoutineFragment extends Fragment {


    public RoutineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tip, container, false);
        TextView titleTextView = (TextView) rootView.findViewById(R.id.title);
        TextView tipTextview = (TextView) rootView.findViewById(R.id.tip);
        ImageView imgView = (ImageView) rootView.findViewById(R.id.image);

        titleTextView.setText(getString(R.string.routine_title));
        tipTextview.setText(getString(R.string.routine_tip_text));
        imgView.setImageResource(R.drawable.r);

        return rootView;
    }

}
