package com.yariksoffice.lingver

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

class FragmentOne: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onResume() {
        super.onResume()
        setHasOptionsMenu(true)
    }



    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.clear()
        inflater.inflate(R.menu.main_menu, menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)
        /*menu.clear()
        MenuInflater(activity?.applicationContext).let {
            it.inflate(R.menu.main_menu, menu)
            super.onPrepareOptionsMenu(menu)
        }*/
    }
}