package com.example.online

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Appdesigning : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_appdesigning, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.codelabbutton).setOnClickListener {
            val i= Intent()
            i.setPackage("com.android.chrome")
            i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse("https://codelabs.developers.google.com/android-kotlin-fundamentals/"))
            startActivity(i)
        }
        view.findViewById<Button>(R.id.developerbutton).setOnClickListener {
            val i= Intent()
            i.setPackage("com.android.chrome")
            i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse("https://developer.android.com/training/basics/firstapp/index.html"))
            startActivity(i)
        }
        view.findViewById<Button>(R.id.corebutton).setOnClickListener {
            val i= Intent()
            i.setPackage("com.android.chrome")
            i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse("http://www.coreservlets.com/android-tutorial/"))
            startActivity(i)
        }
        view.findViewById<Button>(R.id.vogellabutton).setOnClickListener {
            val i= Intent()
            i.setPackage("com.android.chrome")
            i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse("https://www.vogella.com/tutorials/android.html"))
            startActivity(i)
        }

    }

}
