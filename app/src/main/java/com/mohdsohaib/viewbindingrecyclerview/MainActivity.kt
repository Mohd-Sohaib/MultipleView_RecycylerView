package com.mohdsohaib.viewbindingrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mohdsohaib.viewbindingrecyclerview.MyAdapter.Companion.FIRST_VIEW
import com.mohdsohaib.viewbindingrecyclerview.MyAdapter.Companion.SECOND_VIEW
import com.mohdsohaib.viewbindingrecyclerview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
         binding.recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
         binding.recyclerView.adapter = MyAdapter(getList())
    }

    private fun getList() : List<contact_data>{
        return listOf(
            contact_data(FIRST_VIEW, "Mohd.Sohaib", 231456789, "Coder"),
            contact_data(SECOND_VIEW,"Sohaib",963258741,"Gamer"),
            contact_data(FIRST_VIEW, "Khan", 123321123, "Student"),
            contact_data(SECOND_VIEW,"Pathan",999999999,"Actor"),
            contact_data(FIRST_VIEW, "Brother",555555555,"Bhai"),
            contact_data(SECOND_VIEW, "Dell", 111111111, "Computer"),
            contact_data(FIRST_VIEW, "Mohd.Sohaib", 231456789, "Coder"),
            contact_data(SECOND_VIEW,"Sohaib",963258741,"Gamer"),
            contact_data(FIRST_VIEW, "Khan", 123321123, "Student"),
            contact_data(SECOND_VIEW,"Pathan",999999999,"Actor"),
            contact_data(FIRST_VIEW, "Brother",555555555,"Bhai"),
            contact_data(SECOND_VIEW, "Dell", 111111111, "Computer"),
            contact_data(FIRST_VIEW, "Mohd.Sohaib", 231456789, "Coder"),
            contact_data(SECOND_VIEW,"Sohaib",963258741,"Gamer"),
            contact_data(FIRST_VIEW, "Khan", 123321123, "Student"),
            contact_data(SECOND_VIEW,"Pathan",999999999,"Actor"),
            contact_data(FIRST_VIEW, "Brother",555555555,"Bhai"),
            contact_data(SECOND_VIEW, "Dell", 111111111, "Computer"),
            contact_data(FIRST_VIEW, "Mohd.Sohaib", 231456789, "Coder"),
            contact_data(SECOND_VIEW,"Sohaib",963258741,"Gamer"),
            contact_data(FIRST_VIEW, "Khan", 123321123, "Student"),
            contact_data(SECOND_VIEW,"Pathan",999999999,"Actor"),
            contact_data(FIRST_VIEW, "Brother",555555555,"Bhai"),
            contact_data(SECOND_VIEW, "Dell", 111111111, "Computer"),
            contact_data(FIRST_VIEW, "Mohd.Sohaib", 231456789, "Coder"),
            contact_data(SECOND_VIEW,"Sohaib",963258741,"Gamer"),
            contact_data(FIRST_VIEW, "Khan", 123321123, "Student"),
            contact_data(SECOND_VIEW,"Pathan",999999999,"Actor"),
            contact_data(FIRST_VIEW, "Brother",555555555,"Bhai"),
            contact_data(SECOND_VIEW, "Dell", 111111111, "Computer"),
            contact_data(FIRST_VIEW, "Mohd.Sohaib", 231456789, "Coder"),
            contact_data(SECOND_VIEW,"Sohaib",963258741,"Gamer"),
            contact_data(FIRST_VIEW, "Khan", 123321123, "Student"),
            contact_data(SECOND_VIEW,"Pathan",999999999,"Actor"),
            contact_data(FIRST_VIEW, "Brother",555555555,"Bhai"),
            contact_data(SECOND_VIEW, "Dell", 111111111, "Computer"),

        )
    }
}