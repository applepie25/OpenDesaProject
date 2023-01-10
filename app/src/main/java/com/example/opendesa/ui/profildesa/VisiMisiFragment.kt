package com.example.opendesa.ui.profildesa

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.opendesa.util.Helper
import com.example.opendesa.R

class VisiMisiFragment : Fragment(R.layout.fragment_desa_visi_misi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = this.arguments
        activity?.title = "Visi Misi"
        view.findViewById<TextView>(R.id.visi).text = bundle!!.getString("visi")
            ?.let { Helper.fromHTML(it) }
        view.findViewById<TextView>(R.id.misi).text = bundle.getString("misi")
            ?.let { Helper.fromHTML(it) }

    }
}