package org.codepond.commitbrowser.commitdetail;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.codepond.commitbrowser.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class CommitDetailFragment extends Fragment {

    public CommitDetailFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.commit_detail_fragment, container, false);
    }
}