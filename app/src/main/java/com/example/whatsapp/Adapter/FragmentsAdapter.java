package com.example.whatsapp.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.whatsapp.Fragments.CallsFragment;
import com.example.whatsapp.Fragments.ChatsFragment;
import com.example.whatsapp.Fragments.StatusFragment;

//this is going to be the fragments adapter for the fragments in the tab layout
public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

//    public FragmentsAdapter(@NonNull FragmentManager fm, int behavior) {
//        super(fm, behavior);
//    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 2 : return new CallsFragment();
            case 1 : return new StatusFragment();
            default: return new ChatsFragment();
        }

    }

    @Override
    public int getCount() {
//        we are returning 3 because we are using 3 fragments
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if(position==0){
            title = "Chats";
        }else if(position == 1){
            title = "Status";
        }else if(position == 2){
            title = "Calls";
        }


        return title;
    }
}
