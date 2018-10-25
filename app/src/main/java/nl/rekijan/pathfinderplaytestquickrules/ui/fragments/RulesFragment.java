package nl.rekijan.pathfinderplaytestquickrules.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nl.rekijan.pathfinderplaytestquickrules.R;
import nl.rekijan.pathfinderplaytestquickrules.models.RulesModel;
import nl.rekijan.pathfinderplaytestquickrules.ui.views.RulesLinearLayout;


public class RulesFragment extends Fragment {
    private static final String ARG_RULES_NAME = "ARG_RULES_NAME";
    private RulesModel rulesModel;

    public RulesFragment() {
        // Required empty public constructor
    }

    public static RulesFragment newInstance(RulesModel rulesModel) {
        RulesFragment fragment = new RulesFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_RULES_NAME, rulesModel);
        fragment.setArguments(args);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            rulesModel = getArguments().getParcelable(ARG_RULES_NAME);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rules, container, false);
        RulesLinearLayout rulesLinearLayout = (RulesLinearLayout) rootView.findViewById(R.id.rules_ll);
        rulesLinearLayout.addRulesToLayout(rulesModel);
        return rootView;
    }
}