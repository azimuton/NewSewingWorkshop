package com.example.newsewingworkshop.fragments.formuls

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.newsewingworkshop.R
import kotlinx.android.synthetic.main.fragment_solnce.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class SolnceFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_solnce, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btResultSolnce.setOnClickListener {
            if (etStRastvor.text.toString().isNotEmpty() && etPtRastvor.text.toString().isNotEmpty()){
                result()
            } else {
                Toast.makeText(context,"Заполните все поля!", Toast.LENGTH_LONG).show()
            }
        }
    }
    private fun result() {
        val ot : Int = etStRastvor.text?.toString()!!.toInt()
        val result = ot/6.28
        tvR1Solnce.text = result.toString()
        val dlina : Int = etPtRastvor.text?.toString()!!.toInt()
        val result1 = result + dlina
        tvR2Solnce.text = result1.toString()
    }
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SolnceFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}