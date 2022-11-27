package com.example.homework20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Registration_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_registration_, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val goToMainFragment = view.findViewById<Button>(R.id.button_registration)
        val login = view.findViewById<EditText>(R.id.login_registration)
        val password = view.findViewById<EditText>(R.id.password_registration)


        goToMainFragment.setOnClickListener {
            if (login.text.isEmpty() || password.text.isEmpty()) {
                Toast.makeText(context, getString(R.string.both_fields), Toast.LENGTH_SHORT)
                    .show()
            } else parentFragmentManager.beginTransaction()
                .replace(R.id.main_activity, MainFragment()).commit()
        }



    }
}