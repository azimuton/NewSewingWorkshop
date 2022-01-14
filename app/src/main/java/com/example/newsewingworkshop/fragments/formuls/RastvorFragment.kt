package com.example.newsewingworkshop.fragments.formuls

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.newsewingworkshop.R
import kotlinx.android.synthetic.main.fragment_rastvor.*
import kotlinx.android.synthetic.main.fragment_rastvor.etPbRastvor
import kotlinx.android.synthetic.main.fragment_rastvor.etSbRastvor
import kotlinx.android.synthetic.main.fragment_vitochka.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RastvorFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RastvorFragment : Fragment() {
    // TODO: Rename and change types of parameters
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
        return inflater.inflate(R.layout.fragment_rastvor, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btResultSummRastvor.setOnClickListener {
            if (etSbRastvor.text.toString().isNotEmpty() && etPbRastvor.text.toString().isNotEmpty()
                && etStRastvor.text.toString().isNotEmpty() && etPtRastvor.text.toString().isNotEmpty()){
                rastvorOsnova()
            } else {
                Toast.makeText(context,"Заполните пустые поля!", Toast.LENGTH_LONG).show()
            }
        }
        btResultSummBokovoy.setOnClickListener {
            if (etSbRastvor.text.toString().isNotEmpty() && etPbRastvor.text.toString().isNotEmpty()
                && etStRastvor.text.toString().isNotEmpty() && etPtRastvor.text.toString().isNotEmpty()){
                rastvor0_5_Osnova()
            } else {
                Toast.makeText(context,"Заполните пустые поля!", Toast.LENGTH_LONG).show()
            }
        }
        btResultSummZadney.setOnClickListener {
            if (etSbRastvor.text.toString().isNotEmpty() && etPbRastvor.text.toString().isNotEmpty()
                && etStRastvor.text.toString().isNotEmpty() && etPtRastvor.text.toString().isNotEmpty()){
                rastvor0_35_Osnova()
            } else {
                Toast.makeText(context,"Заполните пустые поля!", Toast.LENGTH_LONG).show()
            }
        }
        btResultSummPeredney.setOnClickListener {
            if (etSbRastvor.text.toString().isNotEmpty() && etPbRastvor.text.toString().isNotEmpty()
                && etStRastvor.text.toString().isNotEmpty() && etPtRastvor.text.toString().isNotEmpty()){
                rastvor0_15_Osnova()
            } else {
                Toast.makeText(context,"Заполните пустые поля!", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun rastvorOsnova(){
        val Sb : Double = etSbRastvor.text.toString().toDouble()
        val Pb : Double = etPbRastvor.text.toString().toDouble()
        val St : Double = etStRastvor.text.toString().toDouble()
        val Pt : Double = etPtRastvor.text.toString().toDouble()
        val result : Double = ((Sb + Pb) - (St + Pt)).dec()
        tvResultRastvorSumm.text = result.toString()

    }
    fun rastvor0_5_Osnova(){
        val Sb : Double = etSbRastvor.text.toString().toDouble()
        val Pb : Double = etPbRastvor.text.toString().toDouble()
        val St : Double = etStRastvor.text.toString().toDouble()
        val Pt : Double = etPtRastvor.text.toString().toDouble()
        val result : Double = (((Sb + Pb) - (St + Pt))/2).dec()
        tvResultRastvorBokovoy.text = result.toString()
    }
    fun rastvor0_35_Osnova(){
        val Sb : Double = etSbRastvor.text.toString().toDouble().dec()
        val Pb : Double = etPbRastvor.text.toString().toDouble().dec()
        val St : Double = etStRastvor.text.toString().toDouble().dec()
        val Pt : Double = etPtRastvor.text.toString().toDouble().dec()
        val result : Double = (((Sb + Pb) - (St + Pt))*0.35).dec()
        tvResultRastvorZadney.text = result.toString()
    }
    fun rastvor0_15_Osnova(){
        val Sb : Double = etSbRastvor.text.toString().toDouble()
        val Pb : Double = etPbRastvor.text.toString().toDouble()
        val St : Double = etStRastvor.text.toString().toDouble()
        val Pt : Double = etPtRastvor.text.toString().toDouble()
        val result : Double = (((Sb + Pb) - (St + Pt))*0.15).dec()
        tvResultRastvorPeredney.text = result.toString()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RastvorFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RastvorFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}