package com.gulfemervaaltun.recycleviewkullanimi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.gulfemervaaltun.recycleviewkullanimi.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bookID= intent.getIntExtra(BOOK_ID_EXTRA, -1)
        val book= bookFromID(bookID)
        if (book != null){
            binding.cover.setImageResource(book.cover)
            binding.title.text=book.title
            binding.description.text=book.description
            binding.author.text=book.author
        }
    }

    private fun bookFromID(bookID: Int): Book ?{
        for(book in bookList){
            if (book.id==bookID)
                return book
        }
        return null

    }
}