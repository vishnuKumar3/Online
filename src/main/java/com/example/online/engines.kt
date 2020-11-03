package com.example.online

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class engines : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_engines, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.googlebutton).setOnClickListener {
            val i= Intent()
            i.setPackage("com.android.chrome")
            i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse("http://www.google.com"))
            startActivity(i)
        }
        view.findViewById<Button>(R.id.bingbutton).setOnClickListener {
            val i= Intent()
            i.setPackage("com.android.chrome")
            i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse("https://www.bing.com/"))
            startActivity(i)
        }
        view.findViewById<Button>(R.id.yahoobutton).setOnClickListener {
            val i= Intent()
            i.setPackage("com.android.chrome")
            i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse("https://in.yahoo.com/?p=us"))
            startActivity(i)
        }
        view.findViewById<Button>(R.id.duckbutton).setOnClickListener {
            val i= Intent()
            i.setPackage("com.android.chrome")
            i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse("https://duckduckgo.com/"))
            startActivity(i)
        }

    }


}