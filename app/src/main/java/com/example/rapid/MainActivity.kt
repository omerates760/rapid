package com.example.rapid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.rapid.Fragments.MyFavoriteFragment
import com.example.rapid.Fragments.SearchFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Search.setOnClickListener {

            val searchFragment=SearchFragment()
            getPage(searchFragment)
        }

        btn_my_favorite.setOnClickListener {

            val myfavoriteFragment=MyFavoriteFragment()
            getPage(myfavoriteFragment)

        }


    }

    private fun getPage(fragment: Fragment) {

        val fragmentManager = this.supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container,fragment)
        fragmentTransaction.commit()



    }
}
