package com.andela.mrm;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MeetingRoomFragment extends Fragment {

    /**
     * Instantiates a new Meeting room fragment.
     */
    public MeetingRoomFragment() {
        // This constructor is intentionally empty. Nothing special is needed here.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_meeting_room, container, false);
    }

}
