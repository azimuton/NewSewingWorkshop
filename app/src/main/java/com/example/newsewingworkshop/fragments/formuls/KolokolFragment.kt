package com.example.newsewingworkshop.fragments.formuls

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.newsewingworkshop.R
import kotlinx.android.synthetic.main.fragment_kolokol.*
import kotlinx.android.synthetic.main.fragment_kolokol.etPb

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class KolokolFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kolokol, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btResultKolokol.setOnClickListener {
            if (etPb.text.toString().isNotEmpty()){
                ubkaKolokol()
            } else {
                Toast.makeText(context,"Заполните пустое полe!", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun ubkaKolokol(){
        val count = etPb.text.toString().toInt()
        val result = (8*count)/(3*6.28)
        tvResultKolokol.text = result.toString()
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            KolokolFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}