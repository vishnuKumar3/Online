package com.example.online

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Webdesigning : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_webdesigning, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.w3button).setOnClickListener {
            val i= Intent()
            i.setPackage("com.android.chrome")
            i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse("http://www.w3schools.com"))
            startActivity(i)
        }
        view.findViewById<Button>(R.id.javatwebbutton).setOnClickListener {
            val i= Intent()
            i.setPackage("com.android.chrome")
            i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse("https://www.javatpoint.com/html-tutorial"))
            startActivity(i)
        }
        view.findViewById<Button>(R.id.htmldogbutton).setOnClickListener {
            val i= Intent()
            i.setPackage("com.android.chrome")
            i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse("https://htmldog.com/"))
            startActivity(i)
        }
        view.findViewById<Button>(R.id.courserabutton).setOnClickListener {
            val i= Intent()
            i.setPackage("com.android.chrome")
            i.setAction(Intent.ACTION_VIEW)
            i.setData(Uri.parse("https://www.coursera.org/courses?query=web%20development"))
            startActivity(i)
        }

    }


}