package com.example.homework20

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val dialog = AlertDialog.Builder(this.requireContext())
            .setTitle(getString(R.string.verify_successful))
            .setCancelable(false)
            .setMessage(getString(R.string.all_ok))
            .setPositiveButton("Accept") { dialog, _ ->
                Toast.makeText(
                    context,
                    getString(R.string.cool),
                    Toast.LENGTH_SHORT
                ).show()
            }
            .setNegativeButton("Nope") { dialog, _ ->
                Toast.makeText(
                    context, ":(", Toast.LENGTH_SHORT).show()
            }
            .show()

    }


}