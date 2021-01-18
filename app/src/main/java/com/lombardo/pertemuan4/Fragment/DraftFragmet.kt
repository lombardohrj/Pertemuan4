package com.lombardo.pertemuan4.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lombardo.pertemuan4.R

/**
 * A simple [Fragment] subclass.
 * Use the [DraftFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DraftFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragmen_draft, container, false)
    }
}
