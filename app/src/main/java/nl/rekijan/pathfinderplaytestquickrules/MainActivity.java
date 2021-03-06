package nl.rekijan.pathfinderplaytestquickrules;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import nl.rekijan.pathfinderplaytestquickrules.models.RulesModel;
import nl.rekijan.pathfinderplaytestquickrules.ui.activities.SettingsActivity;
import nl.rekijan.pathfinderplaytestquickrules.ui.dialogs.CustomDialogFragment;
import nl.rekijan.pathfinderplaytestquickrules.ui.fragments.RulesFragment;
import nl.rekijan.pathfinderplaytestquickrules.ui.fragments.StartFragment;
import nl.rekijan.pathfinderplaytestquickrules.ui.views.NoteLinearLayout;
import nl.rekijan.pathfinderplaytestquickrules.ui.views.SearchableNavigationView;
import nl.rekijan.pathfinderplaytestquickrules.ui.views.TraitLinearLayout;
import nl.rekijan.pathfinderplaytestquickrules.utilities.CommonUtil;

import static nl.rekijan.pathfinderplaytestquickrules.AppConstants.DIALOG_TAG;
import static nl.rekijan.pathfinderplaytestquickrules.AppConstants.START_FRAGMENT_TAG;

public class MainActivity extends AppCompatActivity
        implements NoteLinearLayout.OnNotePressedListener,
        TraitLinearLayout.OnTraitPressedListener,
        StartFragment.OnOpenDrawerClicked,
        SearchableNavigationView.OnNavItemPressedListener {

    private CustomDialogFragment mDialogFragment;
    private DrawerLayout mDrawerLayout;
    private RelativeLayout mDrawerGroupedLayout;
    private ExpandableListView mNavItemListView;
    private RulesModel mRulesModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Layout that contains the navigation drawer and the main contain
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        //Container that holds all elements of the navigation drawer
        mDrawerGroupedLayout = (RelativeLayout) findViewById(R.id.drawer_left_group);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        if (mDrawerLayout != null) {
            mDrawerLayout.addDrawerListener(toggle);
            toggle.syncState();

            mDrawerLayout.openDrawer(mDrawerGroupedLayout);
            mDrawerLayout.addDrawerListener(new DrawerListener());
        }
            mNavItemListView = (ExpandableListView) findViewById(R.id.navigation_expandableListView);


        if (findViewById(R.id.fragment_container) != null) {
            //if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, StartFragment.newInstance())
                    .addToBackStack(START_FRAGMENT_TAG)
                    .commit();
        }
        mRulesModel = null;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer != null) {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
                    getSupportFragmentManager().popBackStackImmediate();
                } else {
                    this.finish();
                }
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        } else if (id == R.id.action_share) {
            shareContent();
        } else if (id == R.id.action_about) {
            aboutInfo();
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Show dialog explaining more info is available on the website
     */
    public void aboutInfo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(getString(R.string.dialog_about_info))
                .setTitle(getString(R.string.dialog_about_info_title));
        builder.setPositiveButton(getString(R.string.dialog_about_ok), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent siteIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("http://www.rekijan.nl/"));
                startActivity(siteIntent);
            }
        });
        builder.setNegativeButton(getString(R.string.dialog_cancel), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {}
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void replaceFragment(Fragment newFragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void shareContent() {
        if (mRulesModel != null) {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, mRulesModel.getShareableString(this));
            sendIntent.setType("text/plain");
            startActivity(sendIntent);
        } else {
            Toast.makeText(this, getString(R.string.error_no_rules_model), Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Callback when a {@link nl.rekijan.pathfinderplaytestquickrules.models.NavItemModel NavItemModel} has been clicked on
     *
     * @param rulesModel new rules to be opened
     */
    @Override
    public void onNavItemPressed(RulesModel rulesModel) {
        replaceFragment(RulesFragment.newInstance(rulesModel));
        mRulesModel = rulesModel;
        if (mDrawerLayout != null) {
            if (mDrawerLayout.isDrawerOpen(mDrawerGroupedLayout)) {
                mDrawerLayout.closeDrawer(mDrawerGroupedLayout);
            }
        }
    }

    /**
     * Callback when a note has been pressed and a dialog needs to be opened
     *
     * @param dialogFragment dialog associated with the note that has to be opened
     */
    @Override
    public void onNotePressed(CustomDialogFragment dialogFragment) {
        //Hide previous dialog if there is one
        if (mDialogFragment != null && mDialogFragment.getDialog() != null && mDialogFragment.getDialog().isShowing())
            mDialogFragment.dismiss();
        //Show new dialog
        mDialogFragment = dialogFragment != null ? dialogFragment : null;
        if (mDialogFragment != null)
            mDialogFragment.show(getSupportFragmentManager(), DIALOG_TAG);
    }

    /**
     * Callback when a trait has been pressed and a dialog needs to be opened
     *
     * @param dialogFragment dialog associated with the trait that has to be opened
     */
    @Override
    public void onTraitPressed(CustomDialogFragment dialogFragment) {
        //Hide previous dialog if there is one
        if (mDialogFragment != null && mDialogFragment.getDialog() != null && mDialogFragment.getDialog().isShowing())
            mDialogFragment.dismiss();
        //Show new dialog
        mDialogFragment = dialogFragment != null ? dialogFragment : null;
        if (mDialogFragment != null)
            mDialogFragment.show(getSupportFragmentManager(), DIALOG_TAG);
    }

    /**
     * Callback to open the drawer from the {@link StartFragment}
     */
    @Override
    public void onOpenDrawerClicked() {
        if (mDrawerLayout != null) {
            mDrawerLayout.openDrawer(mDrawerGroupedLayout);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        ((AppExtension) getApplicationContext()).createOrUpdateNavigation();
    }

    private class DrawerListener implements DrawerLayout.DrawerListener {

        @Override
        public void onDrawerSlide(View drawerView, float slideOffset) {
        }

        @Override
        public void onDrawerOpened(View drawerView) {

        }

        @Override
        public void onDrawerClosed(View drawerView) {
        }

        @Override
        public void onDrawerStateChanged(int newState) {
            CommonUtil.getInstance(MainActivity.this).hideSoftKeyboard(MainActivity.this);
        }
    }
}